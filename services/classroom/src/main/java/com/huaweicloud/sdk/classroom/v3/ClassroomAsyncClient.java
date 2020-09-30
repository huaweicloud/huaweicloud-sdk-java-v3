package com.huaweicloud.sdk.classroom.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.classroom.v3.model.*;

public class ClassroomAsyncClient {
    protected HcClient hcClient;

    public ClassroomAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ClassroomAsyncClient> newBuilder() {
        return new ClientBuilder<>(ClassroomAsyncClient::new);
    }


    /**
     * 根据课堂ID获取指定课堂的课堂成员列表
     * 根据课堂ID获取指定课堂的课堂成员列表，支持分页，搜索字段默认同时匹配姓名，学号，用户名，班级。
     *
     * @param ListClassroomMembersRequest 请求对象
     * @return CompletableFuture<ListClassroomMembersResponse>
     */
    public CompletableFuture<ListClassroomMembersResponse> listClassroomMembersAsync(ListClassroomMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listClassroomMembers);
    }

    /**
     * 获取当前用户的课堂列表
     * 获取当前用户的课堂列表，课堂课表分为我创建的课堂，我加入的课堂以及所有课堂，支持分页查询。
     *
     * @param ListClassroomsRequest 请求对象
     * @return CompletableFuture<ListClassroomsResponse>
     */
    public CompletableFuture<ListClassroomsResponse> listClassroomsAsync(ListClassroomsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listClassrooms);
    }

    /**
     * 根据课堂ID获取指定课堂的详细信息
     * 根据课堂ID获取指定课堂的详细信息
     *
     * @param ShowClassroomDetailRequest 请求对象
     * @return CompletableFuture<ShowClassroomDetailResponse>
     */
    public CompletableFuture<ShowClassroomDetailResponse> showClassroomDetailAsync(ShowClassroomDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showClassroomDetail);
    }

    /**
     * 查询课堂下指定成员的作业信息
     * 查询课堂下指定成员的作业信息
     *
     * @param ListClassroomMemberJobsRequest 请求对象
     * @return CompletableFuture<ListClassroomMemberJobsResponse>
     */
    public CompletableFuture<ListClassroomMemberJobsResponse> listClassroomMemberJobsAsync(ListClassroomMemberJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listClassroomMemberJobs);
    }

    /**
     * 查询指定课堂下的作业列表信息
     * 查询指定课堂下的作业列表信息，支持分页查询。
     *
     * @param ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listJobs);
    }

    /**
     * 查询学生函数习题提交记录信息
     * 查询学生指定作业的习题提交记录信息(针对函数习题)
     *
     * @param ListMemberJobRecordsRequest 请求对象
     * @return CompletableFuture<ListMemberJobRecordsResponse>
     */
    public CompletableFuture<ListMemberJobRecordsResponse> listMemberJobRecordsAsync(ListMemberJobRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listMemberJobRecords);
    }

    /**
     * 根据作业ID，查询指定作业的信息
     * 根据作业ID，查询指定作业的信息
     *
     * @param ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showJobDetail);
    }

    /**
     * 查询指定作业下的习题信息
     * 查询指定作业下的习题信息
     *
     * @param ShowJobExercisesRequest 请求对象
     * @return CompletableFuture<ShowJobExercisesResponse>
     */
    public CompletableFuture<ShowJobExercisesResponse> showJobExercisesAsync(ShowJobExercisesRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showJobExercises);
    }

}