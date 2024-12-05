package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateGdgwRoutetableRequestBody
 */
public class UpdateGdgwRoutetableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gdgw_routetable")

    private UpdateGdgwRoutetableRequestBodyGdgwRoutetable gdgwRoutetable;

    public UpdateGdgwRoutetableRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 空运行：true-是，false-否
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public UpdateGdgwRoutetableRequestBody withGdgwRoutetable(
        UpdateGdgwRoutetableRequestBodyGdgwRoutetable gdgwRoutetable) {
        this.gdgwRoutetable = gdgwRoutetable;
        return this;
    }

    public UpdateGdgwRoutetableRequestBody withGdgwRoutetable(
        Consumer<UpdateGdgwRoutetableRequestBodyGdgwRoutetable> gdgwRoutetableSetter) {
        if (this.gdgwRoutetable == null) {
            this.gdgwRoutetable = new UpdateGdgwRoutetableRequestBodyGdgwRoutetable();
            gdgwRoutetableSetter.accept(this.gdgwRoutetable);
        }

        return this;
    }

    /**
     * Get gdgwRoutetable
     * @return gdgwRoutetable
     */
    public UpdateGdgwRoutetableRequestBodyGdgwRoutetable getGdgwRoutetable() {
        return gdgwRoutetable;
    }

    public void setGdgwRoutetable(UpdateGdgwRoutetableRequestBodyGdgwRoutetable gdgwRoutetable) {
        this.gdgwRoutetable = gdgwRoutetable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGdgwRoutetableRequestBody that = (UpdateGdgwRoutetableRequestBody) obj;
        return Objects.equals(this.dryRun, that.dryRun) && Objects.equals(this.gdgwRoutetable, that.gdgwRoutetable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, gdgwRoutetable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGdgwRoutetableRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    gdgwRoutetable: ").append(toIndentedString(gdgwRoutetable)).append("\n");
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
