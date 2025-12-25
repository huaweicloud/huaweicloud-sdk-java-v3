package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MavenTabRepo
 */
public class MavenTabRepo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release")

    private String release;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot")

    private String snapshot;

    public MavenTabRepo withRelease(String release) {
        this.release = release;
        return this;
    }

    /**
     * **参数解释**： release仓库名称。  **取值范围**： 不涉及。
     * @return release
     */
    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public MavenTabRepo withSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * **参数解释**： snapshot仓库名称。  **取值范围**： 不涉及。
     * @return snapshot
     */
    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MavenTabRepo that = (MavenTabRepo) obj;
        return Objects.equals(this.release, that.release) && Objects.equals(this.snapshot, that.snapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(release, snapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MavenTabRepo {\n");
        sb.append("    release: ").append(toIndentedString(release)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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
