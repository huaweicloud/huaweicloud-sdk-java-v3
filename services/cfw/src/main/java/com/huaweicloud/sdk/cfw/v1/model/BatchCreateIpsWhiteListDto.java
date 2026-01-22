package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateIpsWhiteListDto
 */
public class BatchCreateIpsWhiteListDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_white_list_dto_list")

    private List<IpsWhiteListDto> ipsWhiteListDtoList = null;

    public BatchCreateIpsWhiteListDto withIpsWhiteListDtoList(List<IpsWhiteListDto> ipsWhiteListDtoList) {
        this.ipsWhiteListDtoList = ipsWhiteListDtoList;
        return this;
    }

    public BatchCreateIpsWhiteListDto addIpsWhiteListDtoListItem(IpsWhiteListDto ipsWhiteListDtoListItem) {
        if (this.ipsWhiteListDtoList == null) {
            this.ipsWhiteListDtoList = new ArrayList<>();
        }
        this.ipsWhiteListDtoList.add(ipsWhiteListDtoListItem);
        return this;
    }

    public BatchCreateIpsWhiteListDto withIpsWhiteListDtoList(
        Consumer<List<IpsWhiteListDto>> ipsWhiteListDtoListSetter) {
        if (this.ipsWhiteListDtoList == null) {
            this.ipsWhiteListDtoList = new ArrayList<>();
        }
        ipsWhiteListDtoListSetter.accept(this.ipsWhiteListDtoList);
        return this;
    }

    /**
     * **参数解释**：  添加的IPS白名单列表 **约束限制**：  不涉及  **取值范围**： 不涉及  **默认取值**：  不涉及
     * @return ipsWhiteListDtoList
     */
    public List<IpsWhiteListDto> getIpsWhiteListDtoList() {
        return ipsWhiteListDtoList;
    }

    public void setIpsWhiteListDtoList(List<IpsWhiteListDto> ipsWhiteListDtoList) {
        this.ipsWhiteListDtoList = ipsWhiteListDtoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateIpsWhiteListDto that = (BatchCreateIpsWhiteListDto) obj;
        return Objects.equals(this.ipsWhiteListDtoList, that.ipsWhiteListDtoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipsWhiteListDtoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateIpsWhiteListDto {\n");
        sb.append("    ipsWhiteListDtoList: ").append(toIndentedString(ipsWhiteListDtoList)).append("\n");
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
