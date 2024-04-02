package com.good.wellbackendjudgeservice.judge;

import com.good.wellbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.good.wellbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.good.wellbackendjudgeservice.judge.strategy.JudgeContext;
import com.good.wellbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.good.wellbackendmodel.model.codesandbox.JudgeInfo;
import com.good.wellbackendmodel.model.entity.QuestionSubmit;
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
