package com.yunbang.common.service;

import org.springframework.stereotype.Service;

import com.yunbang.common.domain.LogDO;
import com.yunbang.common.domain.PageDO;
import com.yunbang.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
