package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 每个用户所关联的桌面池列表信息
 */
public class ShowDesktopPoolListByUsersInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_count")

    private Integer desktopPoolCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pools")

    private List<AttachDesktopPoolsInfo> desktopPools = null;

    public ShowDesktopPoolListByUsersInfo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowDesktopPoolListByUsersInfo withDesktopPoolCount(Integer desktopPoolCount) {
        this.desktopPoolCount = desktopPoolCount;
        return this;
    }

    /**
     * 桌面池数
     * @return desktopPoolCount
     */
    public Integer getDesktopPoolCount() {
        return desktopPoolCount;
    }

    public void setDesktopPoolCount(Integer desktopPoolCount) {
        this.desktopPoolCount = desktopPoolCount;
    }

    public ShowDesktopPoolListByUsersInfo withDesktopPools(List<AttachDesktopPoolsInfo> desktopPools) {
        this.desktopPools = desktopPools;
        return this;
    }

    public ShowDesktopPoolListByUsersInfo addDesktopPoolsItem(AttachDesktopPoolsInfo desktopPoolsItem) {
        if (this.desktopPools == null) {
            this.desktopPools = new ArrayList<>();
        }
        this.desktopPools.add(desktopPoolsItem);
        return this;
    }

    public ShowDesktopPoolListByUsersInfo withDesktopPools(Consumer<List<AttachDesktopPoolsInfo>> desktopPoolsSetter) {
        if (this.desktopPools == null) {
            this.desktopPools = new ArrayList<>();
        }
        desktopPoolsSetter.accept(this.desktopPools);
        return this;
    }

    /**
     * 运行状态统计
     * @return desktopPools
     */
    public List<AttachDesktopPoolsInfo> getDesktopPools() {
        return desktopPools;
    }

    public void setDesktopPools(List<AttachDesktopPoolsInfo> desktopPools) {
        this.desktopPools = desktopPools;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDesktopPoolListByUsersInfo that = (ShowDesktopPoolListByUsersInfo) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.desktopPoolCount, that.desktopPoolCount)
            && Objects.equals(this.desktopPools, that.desktopPools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, desktopPoolCount, desktopPools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDesktopPoolListByUsersInfo {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    desktopPoolCount: ").append(toIndentedString(desktopPoolCount)).append("\n");
        sb.append("    desktopPools: ").append(toIndentedString(desktopPools)).append("\n");
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
