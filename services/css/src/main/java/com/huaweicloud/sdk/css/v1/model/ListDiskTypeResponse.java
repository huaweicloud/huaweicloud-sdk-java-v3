package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDiskTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskTypes")

    private List<DiskType> diskTypes = null;

    public ListDiskTypeResponse withDiskTypes(List<DiskType> diskTypes) {
        this.diskTypes = diskTypes;
        return this;
    }

    public ListDiskTypeResponse addDiskTypesItem(DiskType diskTypesItem) {
        if (this.diskTypes == null) {
            this.diskTypes = new ArrayList<>();
        }
        this.diskTypes.add(diskTypesItem);
        return this;
    }

    public ListDiskTypeResponse withDiskTypes(Consumer<List<DiskType>> diskTypesSetter) {
        if (this.diskTypes == null) {
            this.diskTypes = new ArrayList<>();
        }
        diskTypesSetter.accept(this.diskTypes);
        return this;
    }

    /**
     * **参数解释**： 磁盘类型列表。 **取值范围**： 不涉及
     * @return diskTypes
     */
    public List<DiskType> getDiskTypes() {
        return diskTypes;
    }

    public void setDiskTypes(List<DiskType> diskTypes) {
        this.diskTypes = diskTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDiskTypeResponse that = (ListDiskTypeResponse) obj;
        return Objects.equals(this.diskTypes, that.diskTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diskTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDiskTypeResponse {\n");
        sb.append("    diskTypes: ").append(toIndentedString(diskTypes)).append("\n");
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
