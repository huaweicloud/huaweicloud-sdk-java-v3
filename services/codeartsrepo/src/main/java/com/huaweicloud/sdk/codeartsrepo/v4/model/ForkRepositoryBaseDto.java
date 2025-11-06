package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ForkRepositoryBaseDto
 */
public class ForkRepositoryBaseDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archived")

    private Boolean archived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    public ForkRepositoryBaseDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 仓库ID。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ForkRepositoryBaseDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 仓库名称。 **约束限制：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ForkRepositoryBaseDto withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * **参数解释：** 是否归档。 **约束限制：** 不涉及。
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public ForkRepositoryBaseDto withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释：** 产品ID。 **约束限制：** 不涉及。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ForkRepositoryBaseDto withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * **参数解释：** 产品名称。 **约束限制：** 不涉及。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ForkRepositoryBaseDto that = (ForkRepositoryBaseDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.archived, that.archived) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, archived, productId, productName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForkRepositoryBaseDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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
