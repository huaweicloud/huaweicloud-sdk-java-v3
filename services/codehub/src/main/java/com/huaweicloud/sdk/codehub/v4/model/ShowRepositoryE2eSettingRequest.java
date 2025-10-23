package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowRepositoryE2eSettingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "take_effect")

    private Boolean takeEffect;

    public ShowRepositoryE2eSettingRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowRepositoryE2eSettingRequest withTakeEffect(Boolean takeEffect) {
        this.takeEffect = takeEffect;
        return this;
    }

    /**
     * **参数解释：** 是否查询生效的E2E配置。 **取值范围：** true：查询仓库实际生效的E2E配置，比如继承自代码组或者项目的E2E设置，false：查询仓库自身的E2E配置。
     * @return takeEffect
     */
    public Boolean getTakeEffect() {
        return takeEffect;
    }

    public void setTakeEffect(Boolean takeEffect) {
        this.takeEffect = takeEffect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepositoryE2eSettingRequest that = (ShowRepositoryE2eSettingRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.takeEffect, that.takeEffect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, takeEffect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryE2eSettingRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    takeEffect: ").append(toIndentedString(takeEffect)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
