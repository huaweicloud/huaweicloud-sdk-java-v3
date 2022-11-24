package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取应用拓扑数据的请求参数。
 */
public class BusinessTopoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_business_id")

    private Long targetBusinessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_tag_list")

    private List<Long> envTagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_user")

    private Boolean filterUser;

    public BusinessTopoRequest withTargetBusinessId(Long targetBusinessId) {
        this.targetBusinessId = targetBusinessId;
        return this;
    }

    /**
     * 目标应用id。
     * @return targetBusinessId
     */
    public Long getTargetBusinessId() {
        return targetBusinessId;
    }

    public void setTargetBusinessId(Long targetBusinessId) {
        this.targetBusinessId = targetBusinessId;
    }

    public BusinessTopoRequest withEnvTagList(List<Long> envTagList) {
        this.envTagList = envTagList;
        return this;
    }

    public BusinessTopoRequest addEnvTagListItem(Long envTagListItem) {
        if (this.envTagList == null) {
            this.envTagList = new ArrayList<>();
        }
        this.envTagList.add(envTagListItem);
        return this;
    }

    public BusinessTopoRequest withEnvTagList(Consumer<List<Long>> envTagListSetter) {
        if (this.envTagList == null) {
            this.envTagList = new ArrayList<>();
        }
        envTagListSetter.accept(this.envTagList);
        return this;
    }

    /**
     * 环境标签列表，可为空。
     * @return envTagList
     */
    public List<Long> getEnvTagList() {
        return envTagList;
    }

    public void setEnvTagList(List<Long> envTagList) {
        this.envTagList = envTagList;
    }

    public BusinessTopoRequest withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 方向，可为空。
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public BusinessTopoRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public BusinessTopoRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BusinessTopoRequest withFilterUser(Boolean filterUser) {
        this.filterUser = filterUser;
        return this;
    }

    /**
     * 过滤。
     * @return filterUser
     */
    public Boolean getFilterUser() {
        return filterUser;
    }

    public void setFilterUser(Boolean filterUser) {
        this.filterUser = filterUser;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BusinessTopoRequest businessTopoRequest = (BusinessTopoRequest) o;
        return Objects.equals(this.targetBusinessId, businessTopoRequest.targetBusinessId)
            && Objects.equals(this.envTagList, businessTopoRequest.envTagList)
            && Objects.equals(this.direction, businessTopoRequest.direction)
            && Objects.equals(this.endTime, businessTopoRequest.endTime)
            && Objects.equals(this.startTime, businessTopoRequest.startTime)
            && Objects.equals(this.filterUser, businessTopoRequest.filterUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetBusinessId, envTagList, direction, endTime, startTime, filterUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessTopoRequest {\n");
        sb.append("    targetBusinessId: ").append(toIndentedString(targetBusinessId)).append("\n");
        sb.append("    envTagList: ").append(toIndentedString(envTagList)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    filterUser: ").append(toIndentedString(filterUser)).append("\n");
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
