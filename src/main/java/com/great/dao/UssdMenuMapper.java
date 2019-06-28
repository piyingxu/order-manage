package com.great.dao;

import com.great.model.UssdMenu;
import java.util.List;

public interface UssdMenuMapper {

    UssdMenu selectByMenuId(String menuId);

    List<UssdMenu> selectByParentId(String menuId);

}