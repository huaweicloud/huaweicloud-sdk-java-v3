package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private Long storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_num")

    private Integer projectNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private Integer chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_arrears")

    private Boolean isArrears;

    public ShowOverviewResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 平台ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowOverviewResponse withStorage(Long storage) {
        this.storage = storage;
        return this;
    }

    /**
     * 存储量，单位：byte
     * @return storage
     */
    public Long getStorage() {
        return storage;
    }

    public void setStorage(Long storage) {
        this.storage = storage;
    }

    public ShowOverviewResponse withProjectNum(Integer projectNum) {
        this.projectNum = projectNum;
        return this;
    }

    /**
     * 项目总数
     * @return projectNum
     */
    public Integer getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(Integer projectNum) {
        this.projectNum = projectNum;
    }

    public ShowOverviewResponse withChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式
     * @return chargeMode
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ShowOverviewResponse withIsArrears(Boolean isArrears) {
        this.isArrears = isArrears;
        return this;
    }

    /**
     * 是否欠费
     * @return isArrears
     */
    public Boolean getIsArrears() {
        return isArrears;
    }

    public void setIsArrears(Boolean isArrears) {
        this.isArrears = isArrears;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOverviewResponse showOverviewResponse = (ShowOverviewResponse) o;
        return Objects.equals(this.id, showOverviewResponse.id)
            && Objects.equals(this.storage, showOverviewResponse.storage)
            && Objects.equals(this.projectNum, showOverviewResponse.projectNum)
            && Objects.equals(this.chargeMode, showOverviewResponse.chargeMode)
            && Objects.equals(this.isArrears, showOverviewResponse.isArrears);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, storage, projectNum, chargeMode, isArrears);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOverviewResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    projectNum: ").append(toIndentedString(projectNum)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    isArrears: ").append(toIndentedString(isArrears)).append("\n");
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
