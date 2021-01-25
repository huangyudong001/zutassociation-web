package com.zutassociation.common.exception.user;

import com.zutassociation.common.exception.BaseException;

/**
 * 用户信息异常类
 *
 * @author 黄玉东
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }
}
