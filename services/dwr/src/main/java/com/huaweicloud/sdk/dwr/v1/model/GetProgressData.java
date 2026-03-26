package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * GetProgressData
 */
public class GetProgressData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_name")

    private String storeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_name")

    private String collectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_progress")

    private BuildProgress buildProgress;

    public GetProgressData withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public GetProgressData withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * **参数解释：** Collection 名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public GetProgressData withBuildProgress(BuildProgress buildProgress) {
        this.buildProgress = buildProgress;
        return this;
    }

    public GetProgressData withBuildProgress(Consumer<BuildProgress> buildProgressSetter) {
        if (this.buildProgress == null) {
            this.buildProgress = new BuildProgress();
            buildProgressSetter.accept(this.buildProgress);
        }

        return this;
    }

    /**
     * Get buildProgress
     * @return buildProgress
     */
    public BuildProgress getBuildProgress() {
        return buildProgress;
    }

    public void setBuildProgress(BuildProgress buildProgress) {
        this.buildProgress = buildProgress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetProgressData that = (GetProgressData) obj;
        return Objects.equals(this.storeName, that.storeName)
            && Objects.equals(this.collectionName, that.collectionName)
            && Objects.equals(this.buildProgress, that.buildProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeName, collectionName, buildProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProgressData {\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
        sb.append("    buildProgress: ").append(toIndentedString(buildProgress)).append("\n");
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
