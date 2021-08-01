package com.logbook.common;

import lombok.Data;

@Data
public class PageHelper {
    private Integer pageNo = 0;
    private Integer pageSize = 10;
    private Integer limit;
}
