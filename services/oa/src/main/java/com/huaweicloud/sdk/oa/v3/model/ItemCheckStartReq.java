package com.huaweicloud.sdk.oa.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 启动检查项检查请求参数
 */
public class ItemCheckStartReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_num")

    private String checkNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_id")

    private String checkItemId;

    public ItemCheckStartReq withCheckNum(String checkNum) {
        this.checkNum = checkNum;
        return this;
    }

    /**
     * 检查记录编码
     * @return checkNum
     */
    public String getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(String checkNum) {
        this.checkNum = checkNum;
    }

    public ItemCheckStartReq withCheckItemId(String checkItemId) {
        this.checkItemId = checkItemId;
        return this;
    }

    /**
     * 检查项编码
     * @return checkItemId
     */
    public String getCheckItemId() {
        return checkItemId;
    }

    public void setCheckItemId(String checkItemId) {
        this.checkItemId = checkItemId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemCheckStartReq that = (ItemCheckStartReq) obj;
        return Objects.equals(this.checkNum, that.checkNum) && Objects.equals(this.checkItemId, that.checkItemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkNum, checkItemId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemCheckStartReq {\n");
        sb.append("    checkNum: ").append(toIndentedString(checkNum)).append("\n");
        sb.append("    checkItemId: ").append(toIndentedString(checkItemId)).append("\n");
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
