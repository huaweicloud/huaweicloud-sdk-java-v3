package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListFreeResourceUsagesReq
 */
public class ListFreeResourceUsagesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="free_resource_ids")
    
    private List<String> freeResourceIds = null;
    
    public ListFreeResourceUsagesReq withFreeResourceIds(List<String> freeResourceIds) {
        this.freeResourceIds = freeResourceIds;
        return this;
    }

    
    public ListFreeResourceUsagesReq addFreeResourceIdsItem(String freeResourceIdsItem) {
        if(this.freeResourceIds == null) {
            this.freeResourceIds = new ArrayList<>();
        }
        this.freeResourceIds.add(freeResourceIdsItem);
        return this;
    }

    public ListFreeResourceUsagesReq withFreeResourceIds(Consumer<List<String>> freeResourceIdsSetter) {
        if(this.freeResourceIds == null) {
            this.freeResourceIds = new ArrayList<>();
        }
        freeResourceIdsSetter.accept(this.freeResourceIds);
        return this;
    }

    /**
     * 资源项ID列表，每个最大64字节。
     * @return freeResourceIds
     */
    public List<String> getFreeResourceIds() {
        return freeResourceIds;
    }

    public void setFreeResourceIds(List<String> freeResourceIds) {
        this.freeResourceIds = freeResourceIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFreeResourceUsagesReq listFreeResourceUsagesReq = (ListFreeResourceUsagesReq) o;
        return Objects.equals(this.freeResourceIds, listFreeResourceUsagesReq.freeResourceIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(freeResourceIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFreeResourceUsagesReq {\n");
        sb.append("    freeResourceIds: ").append(toIndentedString(freeResourceIds)).append("\n");
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

