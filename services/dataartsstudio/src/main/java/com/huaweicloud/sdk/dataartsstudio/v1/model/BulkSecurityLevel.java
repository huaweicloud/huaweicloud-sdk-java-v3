package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BulkSecurityLevel
 */
public class BulkSecurityLevel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guids")

    private List<String> guids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_level")

    private String securityLevel;

    public BulkSecurityLevel withGuids(List<String> guids) {
        this.guids = guids;
        return this;
    }

    public BulkSecurityLevel addGuidsItem(String guidsItem) {
        if (this.guids == null) {
            this.guids = new ArrayList<>();
        }
        this.guids.add(guidsItem);
        return this;
    }

    public BulkSecurityLevel withGuids(Consumer<List<String>> guidsSetter) {
        if (this.guids == null) {
            this.guids = new ArrayList<>();
        }
        guidsSetter.accept(this.guids);
        return this;
    }

    /**
     * 资产guid
     * @return guids
     */
    public List<String> getGuids() {
        return guids;
    }

    public void setGuids(List<String> guids) {
        this.guids = guids;
    }

    public BulkSecurityLevel withSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    /**
     * 密级
     * @return securityLevel
     */
    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BulkSecurityLevel that = (BulkSecurityLevel) obj;
        return Objects.equals(this.guids, that.guids) && Objects.equals(this.securityLevel, that.securityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guids, securityLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkSecurityLevel {\n");
        sb.append("    guids: ").append(toIndentedString(guids)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
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
