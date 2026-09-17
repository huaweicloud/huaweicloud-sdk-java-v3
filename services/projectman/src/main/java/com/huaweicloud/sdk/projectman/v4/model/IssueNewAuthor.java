package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 工作项负责人。 **取值范围：** 不涉及。
 */
public class IssueNewAuthor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firstName")

    private String firstName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastName")

    private String lastName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorNickName")

    private String authorNickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    public IssueNewAuthor withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * **参数解释：** 用户名称。 **取值范围：** 不涉及。
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public IssueNewAuthor withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * **参数解释：** 用户姓名。 **取值范围：** 不涉及。
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public IssueNewAuthor withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * **参数解释：** 作者唯一标识。 **取值范围：** 不涉及。
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public IssueNewAuthor withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释：** 用户头像id。 **取值范围：** 不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public IssueNewAuthor withAuthorNickName(String authorNickName) {
        this.authorNickName = authorNickName;
        return this;
    }

    /**
     * **参数解释：** 用户昵称。 **取值范围：** 不涉及。
     * @return authorNickName
     */
    public String getAuthorNickName() {
        return authorNickName;
    }

    public void setAuthorNickName(String authorNickName) {
        this.authorNickName = authorNickName;
    }

    public IssueNewAuthor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 带租户信息的用户名（租户名称_用户名）。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssueNewAuthor withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 用户id。 **取值范围：** 不涉及。
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueNewAuthor that = (IssueNewAuthor) obj;
        return Objects.equals(this.firstName, that.firstName) && Objects.equals(this.lastName, that.lastName)
            && Objects.equals(this.identifier, that.identifier) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.authorNickName, that.authorNickName) && Objects.equals(this.name, that.name)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, identifier, imageId, authorNickName, name, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueNewAuthor {\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    authorNickName: ").append(toIndentedString(authorNickName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
