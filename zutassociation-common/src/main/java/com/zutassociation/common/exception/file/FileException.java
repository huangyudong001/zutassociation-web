package com.zutassociation.common.exception.file;

import com.zutassociation.common.exception.BaseException;

/**
 * 文件信息异常类
 *
 * @author 黄玉东
 */
public class FileException extends BaseException {
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}
