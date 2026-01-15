package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateWhitelistRequest
 */
public class UpdateWhitelistRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ids")

    private List<String> dbIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public UpdateWhitelistRequest withDbIds(List<String> dbIds) {
        this.dbIds = dbIds;
        return this;
    }

    public UpdateWhitelistRequest addDbIdsItem(String dbIdsItem) {
        if (this.dbIds == null) {
            this.dbIds = new ArrayList<>();
        }
        this.dbIds.add(dbIdsItem);
        return this;
    }

    public UpdateWhitelistRequest withDbIds(Consumer<List<String>> dbIdsSetter) {
        if (this.dbIds == null) {
            this.dbIds = new ArrayList<>();
        }
        dbIdsSetter.accept(this.dbIds);
        return this;
    }

    /**
     * 数据库ID列表
     * @return dbIds
     */
    public List<String> getDbIds() {
        return dbIds;
    }

    public void setDbIds(List<String> dbIds) {
        this.dbIds = dbIds;
    }

    public UpdateWhitelistRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 备注
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public UpdateWhitelistRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用  - true：启用  - false：禁用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWhitelistRequest that = (UpdateWhitelistRequest) obj;
        return Objects.equals(this.dbIds, that.dbIds) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbIds, desc, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWhitelistRequest {\n");
        sb.append("    dbIds: ").append(toIndentedString(dbIds)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
