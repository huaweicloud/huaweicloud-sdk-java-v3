package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PersonalPushEventDto
 */
public class PersonalPushEventDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private PersonalEventAuthorDto author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository")

    private RepositorySimpleDto repository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_data")

    private PushEventPayloadDto pushData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    public PersonalPushEventDto withAuthor(PersonalEventAuthorDto author) {
        this.author = author;
        return this;
    }

    public PersonalPushEventDto withAuthor(Consumer<PersonalEventAuthorDto> authorSetter) {
        if (this.author == null) {
            this.author = new PersonalEventAuthorDto();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public PersonalEventAuthorDto getAuthor() {
        return author;
    }

    public void setAuthor(PersonalEventAuthorDto author) {
        this.author = author;
    }

    public PersonalPushEventDto withRepository(RepositorySimpleDto repository) {
        this.repository = repository;
        return this;
    }

    public PersonalPushEventDto withRepository(Consumer<RepositorySimpleDto> repositorySetter) {
        if (this.repository == null) {
            this.repository = new RepositorySimpleDto();
            repositorySetter.accept(this.repository);
        }

        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    public RepositorySimpleDto getRepository() {
        return repository;
    }

    public void setRepository(RepositorySimpleDto repository) {
        this.repository = repository;
    }

    public PersonalPushEventDto withPushData(PushEventPayloadDto pushData) {
        this.pushData = pushData;
        return this;
    }

    public PersonalPushEventDto withPushData(Consumer<PushEventPayloadDto> pushDataSetter) {
        if (this.pushData == null) {
            this.pushData = new PushEventPayloadDto();
            pushDataSetter.accept(this.pushData);
        }

        return this;
    }

    /**
     * Get pushData
     * @return pushData
     */
    public PushEventPayloadDto getPushData() {
        return pushData;
    }

    public void setPushData(PushEventPayloadDto pushData) {
        this.pushData = pushData;
    }

    public PersonalPushEventDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **约束限制：** 不涉及
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersonalPushEventDto that = (PersonalPushEventDto) obj;
        return Objects.equals(this.author, that.author) && Objects.equals(this.repository, that.repository)
            && Objects.equals(this.pushData, that.pushData) && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, repository, pushData, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonalPushEventDto {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    pushData: ").append(toIndentedString(pushData)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
