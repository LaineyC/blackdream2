package pers.laineyc.blackdream.generator.tool;

import org.springframework.util.StringUtils;
import pers.laineyc.blackdream.framework.exception.BusinessException;
import pers.laineyc.blackdream.generator.service.domain.TemplateFile;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TemplateFileTool
 *
 * @author LaineyC
 */
public class TemplateFileScriptTool {

    private File templateRootPath;

    private File outputRootPath;

    private Map<String, $Template> templateFileCache = new HashMap<>();

    private List<Command> commandList = new ArrayList<>();

    public TemplateFileScriptTool(File templateRootPath, File outputRootPath, List<TemplateFile> templateFileList){
        this.templateRootPath = templateRootPath;
        this.outputRootPath = outputRootPath;
        if(templateFileList != null){
            templateFileList.forEach(templateFile -> {
                $Template template = new $Template(templateFile.getCode(), templateFile.getEngineType());
                templateFileCache.put(template.code, template);
            });
        }
    }

    public class $Var{

        private String name;

        private Object value;

        private $Var(String name, Object value){
            this.name = name;
            this.value = value;
        }
    }

    public class $Template{

        private String code;

        private Integer engineType;

        private $Template(String code, Integer engineType){
            this.code = code;
            this.engineType = engineType;
        }

        private $Template(String code){
            $Template template = templateFileCache.get(code);
            this.code = code;
            this.engineType = template.engineType;
        }
    }

    public class $File implements Command{

        private String name;

        private $Template template;

        private Map<String, Object> context = new HashMap<>();

        private $File(String name, $Template template){
            this.name = name;
            this.template = template;
            commandList.add(this);
        }

        private $File(String name, $Template template, Map<String, Object> context){
            this.name = name;
            this.template = template;
            this.context = context;
            commandList.add(this);
        }
/*
        public void putVar($Var var){
            if(var == null){
                throw new BusinessException("添加Var时，缺少var参数");
            }

            context.put(var.name, var.value);
        }

        public void putVar(String name, Object value){
            if(!StringUtils.hasText(name)){
                throw new BusinessException("添加Var时，缺少name参数");
            }

            if(value == null){
                throw new BusinessException("添加Var时，缺少value参数");
            }
            context.put(name, value);
        }
*/
        public void make(){/*
            for($Var var : template.varList){
                System.out.println(var.name + "," + var.value);
            }
            System.out.println(TemplateFileScriptTool.this.templateRootPath + name);
            */
        }

        public String makeTest(){
            return name.replace("/", File.separator);
        }
    }

    public class $Directory implements Command{

        private String name;

        public $Directory(String name){
            this.name = name;
            commandList.add(this);
        }

        public void make(){
            String path = outputRootPath.getAbsolutePath() + File.separator + name.replace("/", File.separator);
            File pathFile = new File(path);
            if(!pathFile.exists()) {
                pathFile.mkdirs();
            }
        }

        public String makeTest(){
            return name.replace(File.separator, "/");
        }
    }

    public interface Command{
        void make();
        String makeTest();
    }

    public $Var newVar(String name, Object value){
        if(!StringUtils.hasText(name)){
            throw new BusinessException("定义Var时，缺少name参数");
        }

        if(value == null){
            throw new BusinessException("定义Var时，缺少value参数");
        }

        return new $Var(name, value);
    }

    public $Template newTmpl(String code){
        if(!StringUtils.hasText(code)){
            throw new BusinessException("定义Tmpl时，缺少id参数");
        }

        return new $Template(code);
    }

    public $File newFile(String name, $Template template){
        if(!StringUtils.hasText(name)){
            throw new BusinessException("定义File时，缺少name参数");
        }

        if(template == null){
            throw new BusinessException("定义File时，缺少template参数");
        }

        if(!templateFileCache.containsKey(template.code)){
            throw new BusinessException("定义File时，template不存在");
        }

        return new $File(name, templateFileCache.get(template.code));
    }

    public $File newFile(String name, $Template template, Map<String, Object> context){
        if(!StringUtils.hasText(name)){
            throw new BusinessException("定义File时，缺少name参数");
        }

        if(template == null){
            throw new BusinessException("定义File时，缺少template参数");
        }

        if(context == null){
            throw new BusinessException("定义File时，缺少context参数");
        }

        if(!templateFileCache.containsKey(template.code)){
            throw new BusinessException("定义File时，template不存在");
        }

        return new $File(name, templateFileCache.get(template.code), context);
    }

    public $Directory newDir(String name){
        if(!StringUtils.hasText(name)){
            throw new BusinessException("定义Dir时，缺少name参数");
        }

        return new $Directory(name);
    }

    public void make(){

    }

    public List<String> makeTest(){
        List<String> result = new ArrayList<>();
        commandList.forEach(command -> {
            result.add(command.makeTest());
        });

        return result;
    }

}
