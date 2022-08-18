package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchMigrateCloudPhoneRequestBody
 */
public class BatchMigrateCloudPhoneRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_infos")

    private List<BatchMigrateCloudPhoneRequestBodyMigrateInfos> migrateInfos = null;

    public BatchMigrateCloudPhoneRequestBody withMigrateInfos(
        List<BatchMigrateCloudPhoneRequestBodyMigrateInfos> migrateInfos) {
        this.migrateInfos = migrateInfos;
        return this;
    }

    public BatchMigrateCloudPhoneRequestBody addMigrateInfosItem(
        BatchMigrateCloudPhoneRequestBodyMigrateInfos migrateInfosItem) {
        if (this.migrateInfos == null) {
            this.migrateInfos = new ArrayList<>();
        }
        this.migrateInfos.add(migrateInfosItem);
        return this;
    }

    public BatchMigrateCloudPhoneRequestBody withMigrateInfos(
        Consumer<List<BatchMigrateCloudPhoneRequestBodyMigrateInfos>> migrateInfosSetter) {
        if (this.migrateInfos == null) {
            this.migrateInfos = new ArrayList<>();
        }
        migrateInfosSetter.accept(this.migrateInfos);
        return this;
    }

    /**
     * 待迁移数据的云手机信息
     * @return migrateInfos
     */
    public List<BatchMigrateCloudPhoneRequestBodyMigrateInfos> getMigrateInfos() {
        return migrateInfos;
    }

    public void setMigrateInfos(List<BatchMigrateCloudPhoneRequestBodyMigrateInfos> migrateInfos) {
        this.migrateInfos = migrateInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchMigrateCloudPhoneRequestBody batchMigrateCloudPhoneRequestBody = (BatchMigrateCloudPhoneRequestBody) o;
        return Objects.equals(this.migrateInfos, batchMigrateCloudPhoneRequestBody.migrateInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrateInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchMigrateCloudPhoneRequestBody {\n");
        sb.append("    migrateInfos: ").append(toIndentedString(migrateInfos)).append("\n");
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
