package com.yjxxt.crm.mapper;

import com.yjxxt.crm.base.BaseMapper;
import com.yjxxt.crm.bean.Module;
import com.yjxxt.crm.dto.TreeDto;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface ModuleMapper extends BaseMapper<Module,Integer> {


    public List<TreeDto> selectModules();

    List<Module> selectAllModules();

    @MapKey("")
    List<Map<String, Object>> selectAllModuleByGrade(Integer grade);


    Module queryModuleByGradeAndModuleName(Integer grade, String moduleName);

    Module queryModuleByGradeAndUrl(Integer grade, String url);

    Module queryModuleByOptValue(String optValue);

    int countSubModuleByParentId(Integer mid);
}