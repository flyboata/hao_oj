package com.good.hao.judge;

import com.good.hao.judge.codesandbox.model.JudgeInfo;
import com.good.hao.model.entity.QuestionSubmit;
import com.good.hao.judge.strategy.DefaultJudgeStrategy;
import com.good.hao.judge.strategy.JavaLanguageJudgeStrategy;
import com.good.hao.judge.strategy.JudgeContext;
import com.good.hao.judge.strategy.JudgeStrategy;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
