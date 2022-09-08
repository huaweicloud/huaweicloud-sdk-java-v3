package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UploadProductResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succ_num")

    private Integer succNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_num")

    private Integer failNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_objects_ids")

    private List<String> failObjectsIds = null;

    public UploadProductResponse withSuccNum(Integer succNum) {
        this.succNum = succNum;
        return this;
    }

    /**
     * 导入成功的产品数
     * minimum: 0
     * maximum: 500
     * @return succNum
     */
    public Integer getSuccNum() {
        return succNum;
    }

    public void setSuccNum(Integer succNum) {
        this.succNum = succNum;
    }

    public UploadProductResponse withFailNum(Integer failNum) {
        this.failNum = failNum;
        return this;
    }

    /**
     * 导入失败的产品数
     * minimum: 0
     * maximum: 500
     * @return failNum
     */
    public Integer getFailNum() {
        return failNum;
    }

    public void setFailNum(Integer failNum) {
        this.failNum = failNum;
    }

    public UploadProductResponse withFailObjectsIds(List<String> failObjectsIds) {
        this.failObjectsIds = failObjectsIds;
        return this;
    }

    public UploadProductResponse addFailObjectsIdsItem(String failObjectsIdsItem) {
        if (this.failObjectsIds == null) {
            this.failObjectsIds = new ArrayList<>();
        }
        this.failObjectsIds.add(failObjectsIdsItem);
        return this;
    }

    public UploadProductResponse withFailObjectsIds(Consumer<List<String>> failObjectsIdsSetter) {
        if (this.failObjectsIds == null) {
            this.failObjectsIds = new ArrayList<>();
        }
        failObjectsIdsSetter.accept(this.failObjectsIds);
        return this;
    }

    /**
     * 导入失败的产品名称列表
     * @return failObjectsIds
     */
    public List<String> getFailObjectsIds() {
        return failObjectsIds;
    }

    public void setFailObjectsIds(List<String> failObjectsIds) {
        this.failObjectsIds = failObjectsIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadProductResponse uploadProductResponse = (UploadProductResponse) o;
        return Objects.equals(this.succNum, uploadProductResponse.succNum)
            && Objects.equals(this.failNum, uploadProductResponse.failNum)
            && Objects.equals(this.failObjectsIds, uploadProductResponse.failObjectsIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(succNum, failNum, failObjectsIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadProductResponse {\n");
        sb.append("    succNum: ").append(toIndentedString(succNum)).append("\n");
        sb.append("    failNum: ").append(toIndentedString(failNum)).append("\n");
        sb.append("    failObjectsIds: ").append(toIndentedString(failObjectsIds)).append("\n");
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
