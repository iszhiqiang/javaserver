package com.iszhouhua.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iszhouhua.blog.model.pojo.Comment;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 评论表 Mapper 接口
 * </p>
 *
 * @author ZhouHua
 * @since 2018-12-01
 */
public interface CommentMapper extends BaseMapper<Comment> {

    @Select("SELECT id,target_type,article_id,user_id,reply_user_id,content,user_agent,ip,parent_id,create_time,status FROM blog_comment WHERE parent_id =#{parentId} and `status`=1 ")
    List<Comment> getCommentByParentId(Long parentId);
}
