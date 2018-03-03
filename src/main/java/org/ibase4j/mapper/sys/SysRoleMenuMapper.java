package org.ibase4j.mapper.sys;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.ibase4j.model.sys.SysRoleMenu;

import top.ibase4j.core.base.BaseMapper;

public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {
	List<Long> queryMenuIdsByRoleId(@Param("roleId") Long roleId);

	List<Map<String, Object>> queryPermissions(@Param("roleId") Long roleId);

	List<String> queryPermission(@Param("roleId") Long id);
}