package com.huaweicloud.sdk.classroom.v3;

import com.huaweicloud.sdk.classroom.v3.model.ApplyJudgementRequest;
import com.huaweicloud.sdk.classroom.v3.model.ApplyJudgementResponse;
import com.huaweicloud.sdk.classroom.v3.model.ExecuteExerciseRequest;
import com.huaweicloud.sdk.classroom.v3.model.ExecuteExerciseResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListAllDifficultsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListAllDifficultsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomMemberJobsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomMemberJobsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomMembersRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomMembersResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListExercisesRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListExercisesResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListJobsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListJobsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListMemberJobRecordsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListMemberJobRecordsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListMyKnowledgePointsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListMyKnowledgePointsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListPackagesRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListPackagesResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowClassroomDetailRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowClassroomDetailResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowExerciseDetailRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowExerciseDetailResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowJobExercisesRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowJobExercisesResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowJudgementDetailRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowJudgementDetailResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowJudgementFileRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowJudgementFileResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowPackageDetailRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowPackageDetailResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class ClassroomAsyncClient {

    protected HcClient hcClient;

    public ClassroomAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ClassroomAsyncClient> newBuilder() {
        ClientBuilder<ClassroomAsyncClient> clientBuilder = new ClientBuilder<>(ClassroomAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 下发判题任务
     *
     * 下发判题任务，根据回调地址、代码来源、源代码文本、语言类型、超时时长、输出类型，触发后台代码编译运行和判题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyJudgementRequest 请求对象
     * @return CompletableFuture<ApplyJudgementResponse>
     */
    public CompletableFuture<ApplyJudgementResponse> applyJudgementAsync(ApplyJudgementRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.applyJudgement);
    }

    /**
     * 下发判题任务
     *
     * 下发判题任务，根据回调地址、代码来源、源代码文本、语言类型、超时时长、输出类型，触发后台代码编译运行和判题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyJudgementRequest 请求对象
     * @return AsyncInvoker<ApplyJudgementRequest, ApplyJudgementResponse>
     */
    public AsyncInvoker<ApplyJudgementRequest, ApplyJudgementResponse> applyJudgementAsyncInvoker(
        ApplyJudgementRequest request) {
        return new AsyncInvoker<ApplyJudgementRequest, ApplyJudgementResponse>(request, ClassroomMeta.applyJudgement,
            hcClient);
    }

    /**
     * 获取判题结果详情
     *
     * 根据判题任务ID获取判题结果详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJudgementDetailRequest 请求对象
     * @return CompletableFuture<ShowJudgementDetailResponse>
     */
    public CompletableFuture<ShowJudgementDetailResponse> showJudgementDetailAsync(ShowJudgementDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showJudgementDetail);
    }

    /**
     * 获取判题结果详情
     *
     * 根据判题任务ID获取判题结果详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJudgementDetailRequest 请求对象
     * @return AsyncInvoker<ShowJudgementDetailRequest, ShowJudgementDetailResponse>
     */
    public AsyncInvoker<ShowJudgementDetailRequest, ShowJudgementDetailResponse> showJudgementDetailAsyncInvoker(
        ShowJudgementDetailRequest request) {
        return new AsyncInvoker<ShowJudgementDetailRequest, ShowJudgementDetailResponse>(request,
            ClassroomMeta.showJudgementDetail, hcClient);
    }

    /**
     * 下载判题结果文件
     *
     * 根据文件id或图片id下载输出结果文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJudgementFileRequest 请求对象
     * @return CompletableFuture<ShowJudgementFileResponse>
     */
    public CompletableFuture<ShowJudgementFileResponse> showJudgementFileAsync(ShowJudgementFileRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showJudgementFile);
    }

    /**
     * 下载判题结果文件
     *
     * 根据文件id或图片id下载输出结果文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJudgementFileRequest 请求对象
     * @return AsyncInvoker<ShowJudgementFileRequest, ShowJudgementFileResponse>
     */
    public AsyncInvoker<ShowJudgementFileRequest, ShowJudgementFileResponse> showJudgementFileAsyncInvoker(
        ShowJudgementFileRequest request) {
        return new AsyncInvoker<ShowJudgementFileRequest, ShowJudgementFileResponse>(request,
            ClassroomMeta.showJudgementFile, hcClient);
    }

    /**
     * 习题判题
     *
     * 习题判题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteExerciseRequest 请求对象
     * @return CompletableFuture<ExecuteExerciseResponse>
     */
    public CompletableFuture<ExecuteExerciseResponse> executeExerciseAsync(ExecuteExerciseRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.executeExercise);
    }

    /**
     * 习题判题
     *
     * 习题判题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteExerciseRequest 请求对象
     * @return AsyncInvoker<ExecuteExerciseRequest, ExecuteExerciseResponse>
     */
    public AsyncInvoker<ExecuteExerciseRequest, ExecuteExerciseResponse> executeExerciseAsyncInvoker(
        ExecuteExerciseRequest request) {
        return new AsyncInvoker<ExecuteExerciseRequest, ExecuteExerciseResponse>(request, ClassroomMeta.executeExercise,
            hcClient);
    }

    /**
     * 查询习题库下习题列表
     *
     * 查询习题库下习题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExercisesRequest 请求对象
     * @return CompletableFuture<ListExercisesResponse>
     */
    public CompletableFuture<ListExercisesResponse> listExercisesAsync(ListExercisesRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listExercises);
    }

    /**
     * 查询习题库下习题列表
     *
     * 查询习题库下习题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExercisesRequest 请求对象
     * @return AsyncInvoker<ListExercisesRequest, ListExercisesResponse>
     */
    public AsyncInvoker<ListExercisesRequest, ListExercisesResponse> listExercisesAsyncInvoker(
        ListExercisesRequest request) {
        return new AsyncInvoker<ListExercisesRequest, ListExercisesResponse>(request, ClassroomMeta.listExercises,
            hcClient);
    }

    /**
     * 查询当前租户的习题库列表
     *
     * 查询当前租户的习题库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPackagesRequest 请求对象
     * @return CompletableFuture<ListPackagesResponse>
     */
    public CompletableFuture<ListPackagesResponse> listPackagesAsync(ListPackagesRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listPackages);
    }

    /**
     * 查询当前租户的习题库列表
     *
     * 查询当前租户的习题库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPackagesRequest 请求对象
     * @return AsyncInvoker<ListPackagesRequest, ListPackagesResponse>
     */
    public AsyncInvoker<ListPackagesRequest, ListPackagesResponse> listPackagesAsyncInvoker(
        ListPackagesRequest request) {
        return new AsyncInvoker<ListPackagesRequest, ListPackagesResponse>(request, ClassroomMeta.listPackages,
            hcClient);
    }

    /**
     * 查询单个习题详情
     *
     * 查询单个习题详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExerciseDetailRequest 请求对象
     * @return CompletableFuture<ShowExerciseDetailResponse>
     */
    public CompletableFuture<ShowExerciseDetailResponse> showExerciseDetailAsync(ShowExerciseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showExerciseDetail);
    }

    /**
     * 查询单个习题详情
     *
     * 查询单个习题详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExerciseDetailRequest 请求对象
     * @return AsyncInvoker<ShowExerciseDetailRequest, ShowExerciseDetailResponse>
     */
    public AsyncInvoker<ShowExerciseDetailRequest, ShowExerciseDetailResponse> showExerciseDetailAsyncInvoker(
        ShowExerciseDetailRequest request) {
        return new AsyncInvoker<ShowExerciseDetailRequest, ShowExerciseDetailResponse>(request,
            ClassroomMeta.showExerciseDetail, hcClient);
    }

    /**
     * 查询单个习题库详情
     *
     * 查询单个习题库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPackageDetailRequest 请求对象
     * @return CompletableFuture<ShowPackageDetailResponse>
     */
    public CompletableFuture<ShowPackageDetailResponse> showPackageDetailAsync(ShowPackageDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showPackageDetail);
    }

    /**
     * 查询单个习题库详情
     *
     * 查询单个习题库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPackageDetailRequest 请求对象
     * @return AsyncInvoker<ShowPackageDetailRequest, ShowPackageDetailResponse>
     */
    public AsyncInvoker<ShowPackageDetailRequest, ShowPackageDetailResponse> showPackageDetailAsyncInvoker(
        ShowPackageDetailRequest request) {
        return new AsyncInvoker<ShowPackageDetailRequest, ShowPackageDetailResponse>(request,
            ClassroomMeta.showPackageDetail, hcClient);
    }

    /**
     * 获取习题所有难度
     *
     * 获取习题所有难度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllDifficultsRequest 请求对象
     * @return CompletableFuture<ListAllDifficultsResponse>
     */
    public CompletableFuture<ListAllDifficultsResponse> listAllDifficultsAsync(ListAllDifficultsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listAllDifficults);
    }

    /**
     * 获取习题所有难度
     *
     * 获取习题所有难度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllDifficultsRequest 请求对象
     * @return AsyncInvoker<ListAllDifficultsRequest, ListAllDifficultsResponse>
     */
    public AsyncInvoker<ListAllDifficultsRequest, ListAllDifficultsResponse> listAllDifficultsAsyncInvoker(
        ListAllDifficultsRequest request) {
        return new AsyncInvoker<ListAllDifficultsRequest, ListAllDifficultsResponse>(request,
            ClassroomMeta.listAllDifficults, hcClient);
    }

    /**
     * 获取自身习题知识点
     *
     * 获取自身习题知识点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMyKnowledgePointsRequest 请求对象
     * @return CompletableFuture<ListMyKnowledgePointsResponse>
     */
    public CompletableFuture<ListMyKnowledgePointsResponse> listMyKnowledgePointsAsync(
        ListMyKnowledgePointsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listMyKnowledgePoints);
    }

    /**
     * 获取自身习题知识点
     *
     * 获取自身习题知识点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMyKnowledgePointsRequest 请求对象
     * @return AsyncInvoker<ListMyKnowledgePointsRequest, ListMyKnowledgePointsResponse>
     */
    public AsyncInvoker<ListMyKnowledgePointsRequest, ListMyKnowledgePointsResponse> listMyKnowledgePointsAsyncInvoker(
        ListMyKnowledgePointsRequest request) {
        return new AsyncInvoker<ListMyKnowledgePointsRequest, ListMyKnowledgePointsResponse>(request,
            ClassroomMeta.listMyKnowledgePoints, hcClient);
    }

    /**
     * 根据课堂ID获取指定课堂的课堂成员列表
     *
     * 根据课堂ID获取指定课堂的课堂成员列表，支持分页，搜索字段默认同时匹配姓名，学号，用户名，班级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomMembersRequest 请求对象
     * @return CompletableFuture<ListClassroomMembersResponse>
     */
    public CompletableFuture<ListClassroomMembersResponse> listClassroomMembersAsync(
        ListClassroomMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listClassroomMembers);
    }

    /**
     * 根据课堂ID获取指定课堂的课堂成员列表
     *
     * 根据课堂ID获取指定课堂的课堂成员列表，支持分页，搜索字段默认同时匹配姓名，学号，用户名，班级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomMembersRequest 请求对象
     * @return AsyncInvoker<ListClassroomMembersRequest, ListClassroomMembersResponse>
     */
    public AsyncInvoker<ListClassroomMembersRequest, ListClassroomMembersResponse> listClassroomMembersAsyncInvoker(
        ListClassroomMembersRequest request) {
        return new AsyncInvoker<ListClassroomMembersRequest, ListClassroomMembersResponse>(request,
            ClassroomMeta.listClassroomMembers, hcClient);
    }

    /**
     * 获取当前用户的课堂列表
     *
     * 获取当前用户的课堂列表，课堂课表分为我创建的课堂，我加入的课堂以及所有课堂，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomsRequest 请求对象
     * @return CompletableFuture<ListClassroomsResponse>
     */
    public CompletableFuture<ListClassroomsResponse> listClassroomsAsync(ListClassroomsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listClassrooms);
    }

    /**
     * 获取当前用户的课堂列表
     *
     * 获取当前用户的课堂列表，课堂课表分为我创建的课堂，我加入的课堂以及所有课堂，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomsRequest 请求对象
     * @return AsyncInvoker<ListClassroomsRequest, ListClassroomsResponse>
     */
    public AsyncInvoker<ListClassroomsRequest, ListClassroomsResponse> listClassroomsAsyncInvoker(
        ListClassroomsRequest request) {
        return new AsyncInvoker<ListClassroomsRequest, ListClassroomsResponse>(request, ClassroomMeta.listClassrooms,
            hcClient);
    }

    /**
     * 根据课堂ID获取指定课堂的详细信息
     *
     * 根据课堂ID获取指定课堂的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClassroomDetailRequest 请求对象
     * @return CompletableFuture<ShowClassroomDetailResponse>
     */
    public CompletableFuture<ShowClassroomDetailResponse> showClassroomDetailAsync(ShowClassroomDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showClassroomDetail);
    }

    /**
     * 根据课堂ID获取指定课堂的详细信息
     *
     * 根据课堂ID获取指定课堂的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClassroomDetailRequest 请求对象
     * @return AsyncInvoker<ShowClassroomDetailRequest, ShowClassroomDetailResponse>
     */
    public AsyncInvoker<ShowClassroomDetailRequest, ShowClassroomDetailResponse> showClassroomDetailAsyncInvoker(
        ShowClassroomDetailRequest request) {
        return new AsyncInvoker<ShowClassroomDetailRequest, ShowClassroomDetailResponse>(request,
            ClassroomMeta.showClassroomDetail, hcClient);
    }

    /**
     * 查询课堂下指定成员的作业信息
     *
     * 查询课堂下指定成员的作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomMemberJobsRequest 请求对象
     * @return CompletableFuture<ListClassroomMemberJobsResponse>
     */
    public CompletableFuture<ListClassroomMemberJobsResponse> listClassroomMemberJobsAsync(
        ListClassroomMemberJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listClassroomMemberJobs);
    }

    /**
     * 查询课堂下指定成员的作业信息
     *
     * 查询课堂下指定成员的作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomMemberJobsRequest 请求对象
     * @return AsyncInvoker<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse>
     */
    public AsyncInvoker<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse> listClassroomMemberJobsAsyncInvoker(
        ListClassroomMemberJobsRequest request) {
        return new AsyncInvoker<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse>(request,
            ClassroomMeta.listClassroomMemberJobs, hcClient);
    }

    /**
     * 查询指定课堂下的作业列表信息
     *
     * 查询指定课堂下的作业列表信息，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listJobs);
    }

    /**
     * 查询指定课堂下的作业列表信息
     *
     * 查询指定课堂下的作业列表信息，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<ListJobsRequest, ListJobsResponse>(request, ClassroomMeta.listJobs, hcClient);
    }

    /**
     * 查询学生函数习题提交记录信息
     *
     * 查询学生指定作业的习题提交记录信息(针对函数习题)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMemberJobRecordsRequest 请求对象
     * @return CompletableFuture<ListMemberJobRecordsResponse>
     */
    public CompletableFuture<ListMemberJobRecordsResponse> listMemberJobRecordsAsync(
        ListMemberJobRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listMemberJobRecords);
    }

    /**
     * 查询学生函数习题提交记录信息
     *
     * 查询学生指定作业的习题提交记录信息(针对函数习题)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMemberJobRecordsRequest 请求对象
     * @return AsyncInvoker<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse>
     */
    public AsyncInvoker<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse> listMemberJobRecordsAsyncInvoker(
        ListMemberJobRecordsRequest request) {
        return new AsyncInvoker<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse>(request,
            ClassroomMeta.listMemberJobRecords, hcClient);
    }

    /**
     * 根据作业ID，查询指定作业的信息
     *
     * 根据作业ID，查询指定作业的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showJobDetail);
    }

    /**
     * 根据作业ID，查询指定作业的信息
     *
     * 根据作业ID，查询指定作业的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, ClassroomMeta.showJobDetail,
            hcClient);
    }

    /**
     * 查询指定作业下的习题信息
     *
     * 查询指定作业下的习题信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobExercisesRequest 请求对象
     * @return CompletableFuture<ShowJobExercisesResponse>
     */
    public CompletableFuture<ShowJobExercisesResponse> showJobExercisesAsync(ShowJobExercisesRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showJobExercises);
    }

    /**
     * 查询指定作业下的习题信息
     *
     * 查询指定作业下的习题信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobExercisesRequest 请求对象
     * @return AsyncInvoker<ShowJobExercisesRequest, ShowJobExercisesResponse>
     */
    public AsyncInvoker<ShowJobExercisesRequest, ShowJobExercisesResponse> showJobExercisesAsyncInvoker(
        ShowJobExercisesRequest request) {
        return new AsyncInvoker<ShowJobExercisesRequest, ShowJobExercisesResponse>(request,
            ClassroomMeta.showJobExercises, hcClient);
    }

}
