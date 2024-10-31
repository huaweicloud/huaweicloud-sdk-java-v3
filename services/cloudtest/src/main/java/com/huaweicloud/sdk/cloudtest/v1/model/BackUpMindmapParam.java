package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BackUpMindmapParam
 */
public class BackUpMindmapParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bak_name")

    private String bakName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memo")

    private String memo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mindmap_id")

    private String mindmapId;

    public BackUpMindmapParam withBakName(String bakName) {
        this.bakName = bakName;
        return this;
    }

    /**
     * 备份名称
     * @return bakName
     */
    public String getBakName() {
        return bakName;
    }

    public void setBakName(String bakName) {
        this.bakName = bakName;
    }

    public BackUpMindmapParam withMemo(String memo) {
        this.memo = memo;
        return this;
    }

    /**
     * 备注
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public BackUpMindmapParam withMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
        return this;
    }

    /**
     * 脑图id
     * @return mindmapId
     */
    public String getMindmapId() {
        return mindmapId;
    }

    public void setMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackUpMindmapParam that = (BackUpMindmapParam) obj;
        return Objects.equals(this.bakName, that.bakName) && Objects.equals(this.memo, that.memo)
            && Objects.equals(this.mindmapId, that.mindmapId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bakName, memo, mindmapId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackUpMindmapParam {\n");
        sb.append("    bakName: ").append(toIndentedString(bakName)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("    mindmapId: ").append(toIndentedString(mindmapId)).append("\n");
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
