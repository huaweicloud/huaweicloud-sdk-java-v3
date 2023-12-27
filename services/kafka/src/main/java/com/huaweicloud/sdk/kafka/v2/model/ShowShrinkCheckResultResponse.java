package com.huaweicloud.sdk.kafka.v2.model;

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
public class ShowShrinkCheckResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_detail")

    private List<ShowShrinkCheckResponseBodyCheckDetail> checkDetail = null;

    public ShowShrinkCheckResultResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 缩容检查是否通过
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ShowShrinkCheckResultResponse withCheckDetail(List<ShowShrinkCheckResponseBodyCheckDetail> checkDetail) {
        this.checkDetail = checkDetail;
        return this;
    }

    public ShowShrinkCheckResultResponse addCheckDetailItem(ShowShrinkCheckResponseBodyCheckDetail checkDetailItem) {
        if (this.checkDetail == null) {
            this.checkDetail = new ArrayList<>();
        }
        this.checkDetail.add(checkDetailItem);
        return this;
    }

    public ShowShrinkCheckResultResponse withCheckDetail(
        Consumer<List<ShowShrinkCheckResponseBodyCheckDetail>> checkDetailSetter) {
        if (this.checkDetail == null) {
            this.checkDetail = new ArrayList<>();
        }
        checkDetailSetter.accept(this.checkDetail);
        return this;
    }

    /**
     * broker检查结果
     * @return checkDetail
     */
    public List<ShowShrinkCheckResponseBodyCheckDetail> getCheckDetail() {
        return checkDetail;
    }

    public void setCheckDetail(List<ShowShrinkCheckResponseBodyCheckDetail> checkDetail) {
        this.checkDetail = checkDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowShrinkCheckResultResponse that = (ShowShrinkCheckResultResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.checkDetail, that.checkDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, checkDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShrinkCheckResultResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    checkDetail: ").append(toIndentedString(checkDetail)).append("\n");
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
