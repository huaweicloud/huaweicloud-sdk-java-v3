package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：创建镜像快照请求体。 
 */
public class CreateImageSnapshotRequestInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_snapshot_size")

    private Integer imageSnapshotSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved_days")

    private Integer reservedDays;

    public CreateImageSnapshotRequestInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：快照名称（用户指定，用于标识快照用途）。 **约束限制**：不涉及。 **取值范围**：以小写字母开头，小写字母、数字、中划线（-）组成，小写字母或数字结尾的1到190字符的字符串。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateImageSnapshotRequestInput withImageSnapshotSize(Integer imageSnapshotSize) {
        this.imageSnapshotSize = imageSnapshotSize;
        return this;
    }

    /**
     * **参数解释**：快照大小，单位GiB。 **约束限制**：不涉及。 **取值范围**：20~400。 **默认取值**：不传则基于镜像大小的3倍自动估算。 
     * minimum: 20
     * maximum: 400
     * @return imageSnapshotSize
     */
    public Integer getImageSnapshotSize() {
        return imageSnapshotSize;
    }

    public void setImageSnapshotSize(Integer imageSnapshotSize) {
        this.imageSnapshotSize = imageSnapshotSize;
    }

    public CreateImageSnapshotRequestInput withReservedDays(Integer reservedDays) {
        this.reservedDays = reservedDays;
        return this;
    }

    /**
     * **参数解释**：镜像快照保留天数。超过保留天数自动失效，0表示永久保留。 **约束限制**：不涉及。 **取值范围**：0~65536天。 **默认取值**：0。 
     * minimum: 0
     * maximum: 65536
     * @return reservedDays
     */
    public Integer getReservedDays() {
        return reservedDays;
    }

    public void setReservedDays(Integer reservedDays) {
        this.reservedDays = reservedDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateImageSnapshotRequestInput that = (CreateImageSnapshotRequestInput) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.imageSnapshotSize, that.imageSnapshotSize)
            && Objects.equals(this.reservedDays, that.reservedDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageSnapshotSize, reservedDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateImageSnapshotRequestInput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageSnapshotSize: ").append(toIndentedString(imageSnapshotSize)).append("\n");
        sb.append("    reservedDays: ").append(toIndentedString(reservedDays)).append("\n");
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
