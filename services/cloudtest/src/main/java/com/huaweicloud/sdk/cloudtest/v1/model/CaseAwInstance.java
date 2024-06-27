package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CaseAwInstance
 */
public class CaseAwInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setup_aw_list")

    private List<AwInstance> setupAwList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "teardown_aw_list")

    private List<AwInstance> teardownAwList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_aw_list")

    private List<AwInstance> testAwList = null;

    public CaseAwInstance withSetupAwList(List<AwInstance> setupAwList) {
        this.setupAwList = setupAwList;
        return this;
    }

    public CaseAwInstance addSetupAwListItem(AwInstance setupAwListItem) {
        if (this.setupAwList == null) {
            this.setupAwList = new ArrayList<>();
        }
        this.setupAwList.add(setupAwListItem);
        return this;
    }

    public CaseAwInstance withSetupAwList(Consumer<List<AwInstance>> setupAwListSetter) {
        if (this.setupAwList == null) {
            this.setupAwList = new ArrayList<>();
        }
        setupAwListSetter.accept(this.setupAwList);
        return this;
    }

    /**
     * 测试用例前置步骤
     * @return setupAwList
     */
    public List<AwInstance> getSetupAwList() {
        return setupAwList;
    }

    public void setSetupAwList(List<AwInstance> setupAwList) {
        this.setupAwList = setupAwList;
    }

    public CaseAwInstance withTeardownAwList(List<AwInstance> teardownAwList) {
        this.teardownAwList = teardownAwList;
        return this;
    }

    public CaseAwInstance addTeardownAwListItem(AwInstance teardownAwListItem) {
        if (this.teardownAwList == null) {
            this.teardownAwList = new ArrayList<>();
        }
        this.teardownAwList.add(teardownAwListItem);
        return this;
    }

    public CaseAwInstance withTeardownAwList(Consumer<List<AwInstance>> teardownAwListSetter) {
        if (this.teardownAwList == null) {
            this.teardownAwList = new ArrayList<>();
        }
        teardownAwListSetter.accept(this.teardownAwList);
        return this;
    }

    /**
     * 测试步骤
     * @return teardownAwList
     */
    public List<AwInstance> getTeardownAwList() {
        return teardownAwList;
    }

    public void setTeardownAwList(List<AwInstance> teardownAwList) {
        this.teardownAwList = teardownAwList;
    }

    public CaseAwInstance withTestAwList(List<AwInstance> testAwList) {
        this.testAwList = testAwList;
        return this;
    }

    public CaseAwInstance addTestAwListItem(AwInstance testAwListItem) {
        if (this.testAwList == null) {
            this.testAwList = new ArrayList<>();
        }
        this.testAwList.add(testAwListItem);
        return this;
    }

    public CaseAwInstance withTestAwList(Consumer<List<AwInstance>> testAwListSetter) {
        if (this.testAwList == null) {
            this.testAwList = new ArrayList<>();
        }
        testAwListSetter.accept(this.testAwList);
        return this;
    }

    /**
     * 测试用例后置不走
     * @return testAwList
     */
    public List<AwInstance> getTestAwList() {
        return testAwList;
    }

    public void setTestAwList(List<AwInstance> testAwList) {
        this.testAwList = testAwList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseAwInstance that = (CaseAwInstance) obj;
        return Objects.equals(this.setupAwList, that.setupAwList)
            && Objects.equals(this.teardownAwList, that.teardownAwList)
            && Objects.equals(this.testAwList, that.testAwList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setupAwList, teardownAwList, testAwList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseAwInstance {\n");
        sb.append("    setupAwList: ").append(toIndentedString(setupAwList)).append("\n");
        sb.append("    teardownAwList: ").append(toIndentedString(teardownAwList)).append("\n");
        sb.append("    testAwList: ").append(toIndentedString(testAwList)).append("\n");
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
