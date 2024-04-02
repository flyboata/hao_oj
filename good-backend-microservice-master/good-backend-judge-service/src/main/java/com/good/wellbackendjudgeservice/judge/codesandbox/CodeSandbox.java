package com.good.wellbackendjudgeservice.judge.codesandbox;

import com.good.wellbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.good.wellbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
