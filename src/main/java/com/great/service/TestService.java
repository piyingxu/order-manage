package com.great.service;

import com.great.dto.req.UssdReq;
import com.great.dto.res.UssdRes;

public interface TestService {

    UssdRes execute(UssdReq req);
}
