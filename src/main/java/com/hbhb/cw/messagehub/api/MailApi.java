package com.hbhb.cw.messagehub.api;

import com.hbhb.cw.messagehub.vo.MailVO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author xiaokang
 * @since 2020-10-19
 */
public interface MailApi {

    @PostMapping("/post")
    void postMail(@RequestBody MailVO vo);
}
