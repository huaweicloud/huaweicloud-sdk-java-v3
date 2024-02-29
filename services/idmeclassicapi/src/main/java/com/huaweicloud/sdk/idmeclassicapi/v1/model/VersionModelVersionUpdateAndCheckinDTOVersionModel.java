package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VersionModelVersionUpdateAndCheckinDTOVersionModel
 */
public class VersionModelVersionUpdateAndCheckinDTOVersionModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private VersionModel data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masterId")

    private Long masterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    public VersionModelVersionUpdateAndCheckinDTOVersionModel withData(VersionModel data) {
        this.data = data;
        return this;
    }

    public VersionModelVersionUpdateAndCheckinDTOVersionModel withData(Consumer<VersionModel> dataSetter) {
        if (this.data == null) {
            this.data = new VersionModel();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public VersionModel getData() {
        return data;
    }

    public void setData(VersionModel data) {
        this.data = data;
    }

    public VersionModelVersionUpdateAndCheckinDTOVersionModel withMasterId(Long masterId) {
        this.masterId = masterId;
        return this;
    }

    /**
     * 主对象ID。
     * @return masterId
     */
    public Long getMasterId() {
        return masterId;
    }

    public void setMasterId(Long masterId) {
        this.masterId = masterId;
    }

    public VersionModelVersionUpdateAndCheckinDTOVersionModel withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * 更新者。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionModelVersionUpdateAndCheckinDTOVersionModel that =
            (VersionModelVersionUpdateAndCheckinDTOVersionModel) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.masterId, that.masterId)
            && Objects.equals(this.modifier, that.modifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, masterId, modifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionModelVersionUpdateAndCheckinDTOVersionModel {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    masterId: ").append(toIndentedString(masterId)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
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
