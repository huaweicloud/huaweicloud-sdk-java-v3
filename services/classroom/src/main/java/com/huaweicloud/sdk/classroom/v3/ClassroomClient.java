package com.huaweicloud.sdk.classroom.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.classroom.v3.model.*;

public class ClassroomClient {
    protected HcClient hcClient;

    public ClassroomClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ClassroomClient> newBuilder() {
        return new ClientBuilder<>(ClassroomClient::new);
    }


    /**
     * 根据课堂ID获取指定课堂的课堂成员列表
     * 根据课堂ID获取指定课堂的课堂成员列表，支持分页，搜索字段默认同时匹配姓名，学号，用户名，班级。
     *
     * @param ListClassroomMembersRequest 请求对象
     * @return ListClassroomMembersResponse
     */
    public ListClassroomMembersResponse listClassroomMembers(ListClassroomMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassroomMembers);
    }

    /**
     * 获取当前用户的课堂列表
     * 获取当前用户的课堂列表，课堂课表分为我创建的课堂，我加入的课堂以及所有课堂，支持分页查询。
     *
     * @param ListClassroomsRequest 请求对象
     * @return ListClassroomsResponse
     */
    public ListClassroomsResponse listClassrooms(ListClassroomsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassrooms);
    }

    /**
     * 根据课堂ID获取指定课堂的详细信息
     * 根据课堂ID获取指定课堂的详细信息
     *
     * @param ShowClassroomDetailRequest 请求对象
     * @return ShowClassroomDetailResponse
     */
    public ShowClassroomDetailResponse showClassroomDetail(ShowClassroomDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showClassroomDetail);
    }

    /**
     * 查询课堂下指定成员的作业信息
     * 查询课堂下指定成员的作业信息
     *
     * @param ListClassroomMemberJobsRequest 请求对象
     * @return ListClassroomMemberJobsResponse
     */
    public ListClassroomMemberJobsResponse listClassroomMemberJobs(ListClassroomMemberJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassroomMemberJobs);
    }

    /**
     * 查询指定课堂下的作业列表信息
     * 查询指定课堂下的作业列表信息，支持分页查询。
     *
     * @param ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listJobs);
    }

    /**
     * 查询学生函数习题提交记录信息
     * 查询学生指定作业的习题提交记录信息(针对函数习题)
     *
     * @param ListMemberJobRecordsRequest 请求对象
     * @return ListMemberJobRecordsResponse
     */
    public ListMemberJobRecordsResponse listMemberJobRecords(ListMemberJobRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listMemberJobRecords);
    }

    /**
     * 根据作业ID，查询指定作业的信息
     * 根据作业ID，查询指定作业的信息
     *
     * @param ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJobDetail);
    }

    /**
     * 查询指定作业下的习题信息
     * 查询指定作业下的习题信息
     *
     * @param ShowJobExercisesRequest 请求对象
     * @return ShowJobExercisesResponse
     */
    public ShowJobExercisesResponse showJobExercises(ShowJobExercisesRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJobExercises);
    }

}