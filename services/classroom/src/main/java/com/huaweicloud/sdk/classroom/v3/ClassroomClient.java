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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class ClassroomClient {

    protected HcClient hcClient;

    public ClassroomClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ClassroomClient> newBuilder() {
        ClientBuilder<ClassroomClient> clientBuilder = new ClientBuilder<>(ClassroomClient::new);
        return clientBuilder;
    }

    /**
     * 下发判题任务
     *
     * 下发判题任务，根据回调地址、代码来源、源代码文本、语言类型、超时时长、输出类型，触发后台代码编译运行和判题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyJudgementRequest 请求对象
     * @return ApplyJudgementResponse
     */
    public ApplyJudgementResponse applyJudgement(ApplyJudgementRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.applyJudgement);
    }

    /**
     * 下发判题任务
     *
     * 下发判题任务，根据回调地址、代码来源、源代码文本、语言类型、超时时长、输出类型，触发后台代码编译运行和判题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyJudgementRequest 请求对象
     * @return SyncInvoker<ApplyJudgementRequest, ApplyJudgementResponse>
     */
    public SyncInvoker<ApplyJudgementRequest, ApplyJudgementResponse> applyJudgementInvoker(
        ApplyJudgementRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.applyJudgement, hcClient);
    }

    /**
     * 获取判题结果详情
     *
     * 根据判题任务ID获取判题结果详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJudgementDetailRequest 请求对象
     * @return ShowJudgementDetailResponse
     */
    public ShowJudgementDetailResponse showJudgementDetail(ShowJudgementDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJudgementDetail);
    }

    /**
     * 获取判题结果详情
     *
     * 根据判题任务ID获取判题结果详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJudgementDetailRequest 请求对象
     * @return SyncInvoker<ShowJudgementDetailRequest, ShowJudgementDetailResponse>
     */
    public SyncInvoker<ShowJudgementDetailRequest, ShowJudgementDetailResponse> showJudgementDetailInvoker(
        ShowJudgementDetailRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.showJudgementDetail, hcClient);
    }

    /**
     * 下载判题结果文件
     *
     * 根据文件id或图片id下载输出结果文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJudgementFileRequest 请求对象
     * @return ShowJudgementFileResponse
     */
    public ShowJudgementFileResponse showJudgementFile(ShowJudgementFileRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJudgementFile);
    }

    /**
     * 下载判题结果文件
     *
     * 根据文件id或图片id下载输出结果文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJudgementFileRequest 请求对象
     * @return SyncInvoker<ShowJudgementFileRequest, ShowJudgementFileResponse>
     */
    public SyncInvoker<ShowJudgementFileRequest, ShowJudgementFileResponse> showJudgementFileInvoker(
        ShowJudgementFileRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.showJudgementFile, hcClient);
    }

    /**
     * 习题判题
     *
     * 习题判题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteExerciseRequest 请求对象
     * @return ExecuteExerciseResponse
     */
    public ExecuteExerciseResponse executeExercise(ExecuteExerciseRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.executeExercise);
    }

    /**
     * 习题判题
     *
     * 习题判题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteExerciseRequest 请求对象
     * @return SyncInvoker<ExecuteExerciseRequest, ExecuteExerciseResponse>
     */
    public SyncInvoker<ExecuteExerciseRequest, ExecuteExerciseResponse> executeExerciseInvoker(
        ExecuteExerciseRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.executeExercise, hcClient);
    }

    /**
     * 查询习题库下习题列表
     *
     * 查询习题库下习题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExercisesRequest 请求对象
     * @return ListExercisesResponse
     */
    public ListExercisesResponse listExercises(ListExercisesRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listExercises);
    }

    /**
     * 查询习题库下习题列表
     *
     * 查询习题库下习题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExercisesRequest 请求对象
     * @return SyncInvoker<ListExercisesRequest, ListExercisesResponse>
     */
    public SyncInvoker<ListExercisesRequest, ListExercisesResponse> listExercisesInvoker(ListExercisesRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.listExercises, hcClient);
    }

    /**
     * 查询当前租户的习题库列表
     *
     * 查询当前租户的习题库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPackagesRequest 请求对象
     * @return ListPackagesResponse
     */
    public ListPackagesResponse listPackages(ListPackagesRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listPackages);
    }

    /**
     * 查询当前租户的习题库列表
     *
     * 查询当前租户的习题库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPackagesRequest 请求对象
     * @return SyncInvoker<ListPackagesRequest, ListPackagesResponse>
     */
    public SyncInvoker<ListPackagesRequest, ListPackagesResponse> listPackagesInvoker(ListPackagesRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.listPackages, hcClient);
    }

    /**
     * 查询单个习题详情
     *
     * 查询单个习题详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExerciseDetailRequest 请求对象
     * @return ShowExerciseDetailResponse
     */
    public ShowExerciseDetailResponse showExerciseDetail(ShowExerciseDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showExerciseDetail);
    }

    /**
     * 查询单个习题详情
     *
     * 查询单个习题详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExerciseDetailRequest 请求对象
     * @return SyncInvoker<ShowExerciseDetailRequest, ShowExerciseDetailResponse>
     */
    public SyncInvoker<ShowExerciseDetailRequest, ShowExerciseDetailResponse> showExerciseDetailInvoker(
        ShowExerciseDetailRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.showExerciseDetail, hcClient);
    }

    /**
     * 查询单个习题库详情
     *
     * 查询单个习题库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageDetailRequest 请求对象
     * @return ShowPackageDetailResponse
     */
    public ShowPackageDetailResponse showPackageDetail(ShowPackageDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showPackageDetail);
    }

    /**
     * 查询单个习题库详情
     *
     * 查询单个习题库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageDetailRequest 请求对象
     * @return SyncInvoker<ShowPackageDetailRequest, ShowPackageDetailResponse>
     */
    public SyncInvoker<ShowPackageDetailRequest, ShowPackageDetailResponse> showPackageDetailInvoker(
        ShowPackageDetailRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.showPackageDetail, hcClient);
    }

    /**
     * 获取习题所有难度
     *
     * 获取习题所有难度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllDifficultsRequest 请求对象
     * @return ListAllDifficultsResponse
     */
    public ListAllDifficultsResponse listAllDifficults(ListAllDifficultsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listAllDifficults);
    }

    /**
     * 获取习题所有难度
     *
     * 获取习题所有难度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllDifficultsRequest 请求对象
     * @return SyncInvoker<ListAllDifficultsRequest, ListAllDifficultsResponse>
     */
    public SyncInvoker<ListAllDifficultsRequest, ListAllDifficultsResponse> listAllDifficultsInvoker(
        ListAllDifficultsRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.listAllDifficults, hcClient);
    }

    /**
     * 获取自身习题知识点
     *
     * 获取自身习题知识点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMyKnowledgePointsRequest 请求对象
     * @return ListMyKnowledgePointsResponse
     */
    public ListMyKnowledgePointsResponse listMyKnowledgePoints(ListMyKnowledgePointsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listMyKnowledgePoints);
    }

    /**
     * 获取自身习题知识点
     *
     * 获取自身习题知识点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMyKnowledgePointsRequest 请求对象
     * @return SyncInvoker<ListMyKnowledgePointsRequest, ListMyKnowledgePointsResponse>
     */
    public SyncInvoker<ListMyKnowledgePointsRequest, ListMyKnowledgePointsResponse> listMyKnowledgePointsInvoker(
        ListMyKnowledgePointsRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.listMyKnowledgePoints, hcClient);
    }

    /**
     * 根据课堂ID获取指定课堂的课堂成员列表
     *
     * 根据课堂ID获取指定课堂的课堂成员列表，支持分页，搜索字段默认同时匹配姓名，学号，用户名，班级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClassroomMembersRequest 请求对象
     * @return ListClassroomMembersResponse
     */
    public ListClassroomMembersResponse listClassroomMembers(ListClassroomMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassroomMembers);
    }

    /**
     * 根据课堂ID获取指定课堂的课堂成员列表
     *
     * 根据课堂ID获取指定课堂的课堂成员列表，支持分页，搜索字段默认同时匹配姓名，学号，用户名，班级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClassroomMembersRequest 请求对象
     * @return SyncInvoker<ListClassroomMembersRequest, ListClassroomMembersResponse>
     */
    public SyncInvoker<ListClassroomMembersRequest, ListClassroomMembersResponse> listClassroomMembersInvoker(
        ListClassroomMembersRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.listClassroomMembers, hcClient);
    }

    /**
     * 获取当前用户的课堂列表
     *
     * 获取当前用户的课堂列表，课堂课表分为我创建的课堂，我加入的课堂以及所有课堂，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClassroomsRequest 请求对象
     * @return ListClassroomsResponse
     */
    public ListClassroomsResponse listClassrooms(ListClassroomsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassrooms);
    }

    /**
     * 获取当前用户的课堂列表
     *
     * 获取当前用户的课堂列表，课堂课表分为我创建的课堂，我加入的课堂以及所有课堂，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClassroomsRequest 请求对象
     * @return SyncInvoker<ListClassroomsRequest, ListClassroomsResponse>
     */
    public SyncInvoker<ListClassroomsRequest, ListClassroomsResponse> listClassroomsInvoker(
        ListClassroomsRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.listClassrooms, hcClient);
    }

    /**
     * 根据课堂ID获取指定课堂的详细信息
     *
     * 根据课堂ID获取指定课堂的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClassroomDetailRequest 请求对象
     * @return ShowClassroomDetailResponse
     */
    public ShowClassroomDetailResponse showClassroomDetail(ShowClassroomDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showClassroomDetail);
    }

    /**
     * 根据课堂ID获取指定课堂的详细信息
     *
     * 根据课堂ID获取指定课堂的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClassroomDetailRequest 请求对象
     * @return SyncInvoker<ShowClassroomDetailRequest, ShowClassroomDetailResponse>
     */
    public SyncInvoker<ShowClassroomDetailRequest, ShowClassroomDetailResponse> showClassroomDetailInvoker(
        ShowClassroomDetailRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.showClassroomDetail, hcClient);
    }

    /**
     * 查询课堂下指定成员的作业信息
     *
     * 查询课堂下指定成员的作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClassroomMemberJobsRequest 请求对象
     * @return ListClassroomMemberJobsResponse
     */
    public ListClassroomMemberJobsResponse listClassroomMemberJobs(ListClassroomMemberJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassroomMemberJobs);
    }

    /**
     * 查询课堂下指定成员的作业信息
     *
     * 查询课堂下指定成员的作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClassroomMemberJobsRequest 请求对象
     * @return SyncInvoker<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse>
     */
    public SyncInvoker<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse> listClassroomMemberJobsInvoker(
        ListClassroomMemberJobsRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.listClassroomMemberJobs, hcClient);
    }

    /**
     * 查询指定课堂下的作业列表信息
     *
     * 查询指定课堂下的作业列表信息，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listJobs);
    }

    /**
     * 查询指定课堂下的作业列表信息
     *
     * 查询指定课堂下的作业列表信息，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.listJobs, hcClient);
    }

    /**
     * 查询学生函数习题提交记录信息
     *
     * 查询学生指定作业的习题提交记录信息(针对函数习题)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMemberJobRecordsRequest 请求对象
     * @return ListMemberJobRecordsResponse
     */
    public ListMemberJobRecordsResponse listMemberJobRecords(ListMemberJobRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listMemberJobRecords);
    }

    /**
     * 查询学生函数习题提交记录信息
     *
     * 查询学生指定作业的习题提交记录信息(针对函数习题)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMemberJobRecordsRequest 请求对象
     * @return SyncInvoker<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse>
     */
    public SyncInvoker<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse> listMemberJobRecordsInvoker(
        ListMemberJobRecordsRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.listMemberJobRecords, hcClient);
    }

    /**
     * 根据作业ID，查询指定作业的信息
     *
     * 根据作业ID，查询指定作业的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJobDetail);
    }

    /**
     * 根据作业ID，查询指定作业的信息
     *
     * 根据作业ID，查询指定作业的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.showJobDetail, hcClient);
    }

    /**
     * 查询指定作业下的习题信息
     *
     * 查询指定作业下的习题信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobExercisesRequest 请求对象
     * @return ShowJobExercisesResponse
     */
    public ShowJobExercisesResponse showJobExercises(ShowJobExercisesRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJobExercises);
    }

    /**
     * 查询指定作业下的习题信息
     *
     * 查询指定作业下的习题信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobExercisesRequest 请求对象
     * @return SyncInvoker<ShowJobExercisesRequest, ShowJobExercisesResponse>
     */
    public SyncInvoker<ShowJobExercisesRequest, ShowJobExercisesResponse> showJobExercisesInvoker(
        ShowJobExercisesRequest request) {
        return new SyncInvoker<>(request, ClassroomMeta.showJobExercises, hcClient);
    }

}
