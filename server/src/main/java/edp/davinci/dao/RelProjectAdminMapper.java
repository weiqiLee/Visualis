package edp.davinci.dao;

import edp.davinci.model.RelProjectAdmin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface RelProjectAdminMapper {

    int insert(RelProjectAdmin relProjectAdmin);


    @Select({
            "select * from rel_project_admin where project_id = #{projectId} and user_id = #{userId}"
    })
    RelProjectAdmin getByProjectAndUser(@Param("projectId") Long projectId, @Param("userId") Long userId);

    @Delete({
            "delete from rel_project_admin where id = #{id,jdbcType=BIGINT}"
    })
    int deleteById(Long id);

    @Delete({
            "delete from rel_project_admin where project_id = #{projectId} and user_id = #{userId}"
    })
    int delete(@Param("projectId") Long projectId, @Param("userId") Long userId);

    @Select({
            "select * from rel_project_admin where id = #{id,jdbcType=BIGINT}"
    })
    RelProjectAdmin getById(Long id);

    @Delete({
            "delete from rel_project_admin where project_id = #{projectId}"
    })
    int deleteByProjectId(Long projectId);
}