package com.hbhb.cw.messagehub.vo;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaokang
 * @since 2020-08-11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MailVO implements Serializable {
    private static final long serialVersionUID = -1214209531058325558L;

    @Schema(description = "接收人", required = true)
    private String receiver;
    @Schema(description = "标题", required = true)
    private String title;
    @Schema(description = "内容（可包含html元素）", required = true)
    private String content;
}
