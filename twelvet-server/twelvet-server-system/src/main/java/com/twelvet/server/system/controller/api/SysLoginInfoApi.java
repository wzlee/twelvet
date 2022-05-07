package com.twelvet.server.system.controller.api;

import com.twelvet.api.system.domain.SysLoginInfo;
import com.twelvet.framework.security.annotation.AuthIgnore;
import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.utils.http.IpUtils;
import com.twelvet.server.system.service.ISysLoginInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author twelvet
 * @WebSite www.twelvet.cn
 * @Description: 系统操作/访问日志
 */
@Api(tags = "系统操作/访问日志API")
@RestController
@RequestMapping("/api/loginInfo")
public class SysLoginInfoApi extends TWTController {

    @Autowired
    private ISysLoginInfoService iSysLoginInfoService;

    /**
     * 记录登录信息
     *
     * @param sysLoginInfo SysLoginInfo
     */
    @AuthIgnore
    @PostMapping
    public void insertLog(@RequestBody SysLoginInfo sysLoginInfo) {
        iSysLoginInfoService.insertLoginInfo(sysLoginInfo);
    }

}
