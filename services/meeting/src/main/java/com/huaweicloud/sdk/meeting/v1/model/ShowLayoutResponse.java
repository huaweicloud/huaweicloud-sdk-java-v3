package com.huaweicloud.sdk.meeting.v1.model;

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
public class ShowLayoutResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnCode")

    private Integer returnCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnDesc")

    private String returnDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picLayouts")

    private List<RestPicLayout> picLayouts = null;

    public ShowLayoutResponse withReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    /**
     * 结果码。 * 0：成功 * 非0：失败 
     * minimum: 0
     * maximum: 2147483647
     * @return returnCode
     */
    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public ShowLayoutResponse withReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
        return this;
    }

    /**
     * 结果描述。 * Success：成功 * 其他：失败原因 
     * @return returnDesc
     */
    public String getReturnDesc() {
        return returnDesc;
    }

    public void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
    }

    public ShowLayoutResponse withPicLayouts(List<RestPicLayout> picLayouts) {
        this.picLayouts = picLayouts;
        return this;
    }

    public ShowLayoutResponse addPicLayoutsItem(RestPicLayout picLayoutsItem) {
        if (this.picLayouts == null) {
            this.picLayouts = new ArrayList<>();
        }
        this.picLayouts.add(picLayoutsItem);
        return this;
    }

    public ShowLayoutResponse withPicLayouts(Consumer<List<RestPicLayout>> picLayoutsSetter) {
        if (this.picLayouts == null) {
            this.picLayouts = new ArrayList<>();
        }
        picLayoutsSetter.accept(this.picLayouts);
        return this;
    }

    /**
     * 多画面布局。
     * @return picLayouts
     */
    public List<RestPicLayout> getPicLayouts() {
        return picLayouts;
    }

    public void setPicLayouts(List<RestPicLayout> picLayouts) {
        this.picLayouts = picLayouts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLayoutResponse showLayoutResponse = (ShowLayoutResponse) o;
        return Objects.equals(this.returnCode, showLayoutResponse.returnCode)
            && Objects.equals(this.returnDesc, showLayoutResponse.returnDesc)
            && Objects.equals(this.picLayouts, showLayoutResponse.picLayouts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnCode, returnDesc, picLayouts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLayoutResponse {\n");
        sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
        sb.append("    returnDesc: ").append(toIndentedString(returnDesc)).append("\n");
        sb.append("    picLayouts: ").append(toIndentedString(picLayouts)).append("\n");
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
