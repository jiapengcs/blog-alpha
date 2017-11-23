package com.jiapengcs.alpha.dao;

import com.jiapengcs.alpha.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jiapeng
 * @version V1.0
 * date: 2017/11/23
 */
public interface ContentDAO extends JpaRepository<Content, Integer> {
}
