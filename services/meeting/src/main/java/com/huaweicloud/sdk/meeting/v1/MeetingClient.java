package com.huaweicloud.sdk.meeting.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.meeting.v1.model.*;

public class MeetingClient {

    protected HcClient hcClient;

    public MeetingClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MeetingClient> newBuilder() {
        return new ClientBuilder<>(MeetingClient::new, "MeetingCredentials");
    }

    /** SP管理员创建企业 创建企业，默认管理员及分配资源。
     *
     * @param AddCorpRequest 请求对象
     * @return AddCorpResponse */
    public AddCorpResponse addCorp(AddCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addCorp);
    }

    /** SP管理员创建企业 创建企业，默认管理员及分配资源。
     *
     * @param AddCorpRequest 请求对象
     * @return SyncInvoker<AddCorpRequest, AddCorpResponse> */
    public SyncInvoker<AddCorpRequest, AddCorpResponse> addCorpInvoker(AddCorpRequest request) {
        return new SyncInvoker<AddCorpRequest, AddCorpResponse>(request, MeetingMeta.addCorp, hcClient);
    }

    /** 添加企业管理员 企业默认管理员添加企业普通管理员
     *
     * @param AddCorpAdminRequest 请求对象
     * @return AddCorpAdminResponse */
    public AddCorpAdminResponse addCorpAdmin(AddCorpAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addCorpAdmin);
    }

    /** 添加企业管理员 企业默认管理员添加企业普通管理员
     *
     * @param AddCorpAdminRequest 请求对象
     * @return SyncInvoker<AddCorpAdminRequest, AddCorpAdminResponse> */
    public SyncInvoker<AddCorpAdminRequest, AddCorpAdminResponse> addCorpAdminInvoker(AddCorpAdminRequest request) {
        return new SyncInvoker<AddCorpAdminRequest, AddCorpAdminResponse>(request, MeetingMeta.addCorpAdmin, hcClient);
    }

    /** 添加部门 企业管理员通过该接口添加部门，最多支持10级部门，每级子部门最多支持100个，默认企业最大部门数量为3000个。
     *
     * @param AddDepartmentRequest 请求对象
     * @return AddDepartmentResponse */
    public AddDepartmentResponse addDepartment(AddDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addDepartment);
    }

    /** 添加部门 企业管理员通过该接口添加部门，最多支持10级部门，每级子部门最多支持100个，默认企业最大部门数量为3000个。
     *
     * @param AddDepartmentRequest 请求对象
     * @return SyncInvoker<AddDepartmentRequest, AddDepartmentResponse> */
    public SyncInvoker<AddDepartmentRequest, AddDepartmentResponse> addDepartmentInvoker(AddDepartmentRequest request) {
        return new SyncInvoker<AddDepartmentRequest, AddDepartmentResponse>(request, MeetingMeta.addDepartment,
            hcClient);
    }

    /** 增加终端 企业管理员通过该接口添加硬终端。
     *
     * @param AddDeviceRequest 请求对象
     * @return AddDeviceResponse */
    public AddDeviceResponse addDevice(AddDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addDevice);
    }

    /** 增加终端 企业管理员通过该接口添加硬终端。
     *
     * @param AddDeviceRequest 请求对象
     * @return SyncInvoker<AddDeviceRequest, AddDeviceResponse> */
    public SyncInvoker<AddDeviceRequest, AddDeviceResponse> addDeviceInvoker(AddDeviceRequest request) {
        return new SyncInvoker<AddDeviceRequest, AddDeviceResponse>(request, MeetingMeta.addDevice, hcClient);
    }

    /** 新增全球窗素材 新增全球窗素材（上传素材文件）
     *
     * @param AddMaterialRequest 请求对象
     * @return AddMaterialResponse */
    public AddMaterialResponse addMaterial(AddMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addMaterial);
    }

    /** 新增全球窗素材 新增全球窗素材（上传素材文件）
     *
     * @param AddMaterialRequest 请求对象
     * @return SyncInvoker<AddMaterialRequest, AddMaterialResponse> */
    public SyncInvoker<AddMaterialRequest, AddMaterialResponse> addMaterialInvoker(AddMaterialRequest request) {
        return new SyncInvoker<AddMaterialRequest, AddMaterialResponse>(request, MeetingMeta.addMaterial, hcClient);
    }

    /** 新增全球窗节目 新增全球窗节目
     *
     * @param AddProgramRequest 请求对象
     * @return AddProgramResponse */
    public AddProgramResponse addProgram(AddProgramRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addProgram);
    }

    /** 新增全球窗节目 新增全球窗节目
     *
     * @param AddProgramRequest 请求对象
     * @return SyncInvoker<AddProgramRequest, AddProgramResponse> */
    public SyncInvoker<AddProgramRequest, AddProgramResponse> addProgramInvoker(AddProgramRequest request) {
        return new SyncInvoker<AddProgramRequest, AddProgramResponse>(request, MeetingMeta.addProgram, hcClient);
    }

    /** 新增全球窗发布 新增全球窗发布
     *
     * @param AddPublicationRequest 请求对象
     * @return AddPublicationResponse */
    public AddPublicationResponse addPublication(AddPublicationRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addPublication);
    }

    /** 新增全球窗发布 新增全球窗发布
     *
     * @param AddPublicationRequest 请求对象
     * @return SyncInvoker<AddPublicationRequest, AddPublicationResponse> */
    public SyncInvoker<AddPublicationRequest, AddPublicationResponse> addPublicationInvoker(
        AddPublicationRequest request) {
        return new SyncInvoker<AddPublicationRequest, AddPublicationResponse>(request, MeetingMeta.addPublication,
            hcClient);
    }

    /** SP管理员分配企业资源 企业新增资源发放。优化适配，该接口同时支持修改，带resourceId后会判断该资源是否存在，存在即修改（支持修改的参数见修改接口），否则按新增处理
     *
     * @param AddResourceRequest 请求对象
     * @return AddResourceResponse */
    public AddResourceResponse addResource(AddResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addResource);
    }

    /** SP管理员分配企业资源 企业新增资源发放。优化适配，该接口同时支持修改，带resourceId后会判断该资源是否存在，存在即修改（支持修改的参数见修改接口），否则按新增处理
     *
     * @param AddResourceRequest 请求对象
     * @return SyncInvoker<AddResourceRequest, AddResourceResponse> */
    public SyncInvoker<AddResourceRequest, AddResourceResponse> addResourceInvoker(AddResourceRequest request) {
        return new SyncInvoker<AddResourceRequest, AddResourceResponse>(request, MeetingMeta.addResource, hcClient);
    }

    /** 保存会议纪要到个人云空间 用户使用手机扫码后，手机端请求服务端将当前会议纪要文件保存到个人云空间。二维码内容
     * cloudlink://cloudlink.huawei.com/h5page?action&#x3D;SAVE_MEETING_FILE&amp;key1&#x3D;value1&amp;key2&#x3D;value2
     * key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     *
     * @param AddToPersonalSpaceRequest 请求对象
     * @return AddToPersonalSpaceResponse */
    public AddToPersonalSpaceResponse addToPersonalSpace(AddToPersonalSpaceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addToPersonalSpace);
    }

    /** 保存会议纪要到个人云空间 用户使用手机扫码后，手机端请求服务端将当前会议纪要文件保存到个人云空间。二维码内容
     * cloudlink://cloudlink.huawei.com/h5page?action&#x3D;SAVE_MEETING_FILE&amp;key1&#x3D;value1&amp;key2&#x3D;value2
     * key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     *
     * @param AddToPersonalSpaceRequest 请求对象
     * @return SyncInvoker<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> */
    public SyncInvoker<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> addToPersonalSpaceInvoker(
        AddToPersonalSpaceRequest request) {
        return new SyncInvoker<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse>(request,
            MeetingMeta.addToPersonalSpace, hcClient);
    }

    /** 添加用户 企业管理员通过该接口添加企业用户。
     *
     * @param AddUserRequest 请求对象
     * @return AddUserResponse */
    public AddUserResponse addUser(AddUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addUser);
    }

    /** 添加用户 企业管理员通过该接口添加企业用户。
     *
     * @param AddUserRequest 请求对象
     * @return SyncInvoker<AddUserRequest, AddUserResponse> */
    public SyncInvoker<AddUserRequest, AddUserResponse> addUserInvoker(AddUserRequest request) {
        return new SyncInvoker<AddUserRequest, AddUserResponse>(request, MeetingMeta.addUser, hcClient);
    }

    /** 与会者自己解除静音 决定与会者是否可以自己解除静音。
     *
     * @param AllowGuestUnmuteRequest 请求对象
     * @return AllowGuestUnmuteResponse */
    public AllowGuestUnmuteResponse allowGuestUnmute(AllowGuestUnmuteRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.allowGuestUnmute);
    }

    /** 与会者自己解除静音 决定与会者是否可以自己解除静音。
     *
     * @param AllowGuestUnmuteRequest 请求对象
     * @return SyncInvoker<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> */
    public SyncInvoker<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> allowGuestUnmuteInvoker(
        AllowGuestUnmuteRequest request) {
        return new SyncInvoker<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse>(request, MeetingMeta.allowGuestUnmute,
            hcClient);
    }

    /** 分配云会议室 企业管理员通过该接口将云会议室分配给用户、硬终端（当前仅支持分配TE10、TE20、HUAWEI Board、HUAWEI Bar 500及HUAWEI
     * Box系列硬件终端）。云会议室分配给硬件终端后，需要重启或重新激活硬件终端。若需要管理云会议室、预约会议、录制会议或进行完整的会控操作，请同时将该云会议室分配给会议用户。
     *
     * @param AssociateVmrRequest 请求对象
     * @return AssociateVmrResponse */
    public AssociateVmrResponse associateVmr(AssociateVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.associateVmr);
    }

    /** 分配云会议室 企业管理员通过该接口将云会议室分配给用户、硬终端（当前仅支持分配TE10、TE20、HUAWEI Board、HUAWEI Bar 500及HUAWEI
     * Box系列硬件终端）。云会议室分配给硬件终端后，需要重启或重新激活硬件终端。若需要管理云会议室、预约会议、录制会议或进行完整的会控操作，请同时将该云会议室分配给会议用户。
     *
     * @param AssociateVmrRequest 请求对象
     * @return SyncInvoker<AssociateVmrRequest, AssociateVmrResponse> */
    public SyncInvoker<AssociateVmrRequest, AssociateVmrResponse> associateVmrInvoker(AssociateVmrRequest request) {
        return new SyncInvoker<AssociateVmrRequest, AssociateVmrResponse>(request, MeetingMeta.associateVmr, hcClient);
    }

    /** 批量删除企业管理员 批量删除企业管理员
     *
     * @param BatchDeleteCorpAdminsRequest 请求对象
     * @return BatchDeleteCorpAdminsResponse */
    public BatchDeleteCorpAdminsResponse batchDeleteCorpAdmins(BatchDeleteCorpAdminsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteCorpAdmins);
    }

    /** 批量删除企业管理员 批量删除企业管理员
     *
     * @param BatchDeleteCorpAdminsRequest 请求对象
     * @return SyncInvoker<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> */
    public SyncInvoker<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> batchDeleteCorpAdminsInvoker(
        BatchDeleteCorpAdminsRequest request) {
        return new SyncInvoker<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse>(request,
            MeetingMeta.batchDeleteCorpAdmins, hcClient);
    }

    /** 批量删除终端 企业管理员通过该接口批量删除终端，返回删除失败的列表。
     *
     * @param BatchDeleteDevicesRequest 请求对象
     * @return BatchDeleteDevicesResponse */
    public BatchDeleteDevicesResponse batchDeleteDevices(BatchDeleteDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteDevices);
    }

    /** 批量删除终端 企业管理员通过该接口批量删除终端，返回删除失败的列表。
     *
     * @param BatchDeleteDevicesRequest 请求对象
     * @return SyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> */
    public SyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevicesInvoker(
        BatchDeleteDevicesRequest request) {
        return new SyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse>(request,
            MeetingMeta.batchDeleteDevices, hcClient);
    }

    /** 删除全球窗素材 删除全球窗素材
     *
     * @param BatchDeleteMaterialsRequest 请求对象
     * @return BatchDeleteMaterialsResponse */
    public BatchDeleteMaterialsResponse batchDeleteMaterials(BatchDeleteMaterialsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteMaterials);
    }

    /** 删除全球窗素材 删除全球窗素材
     *
     * @param BatchDeleteMaterialsRequest 请求对象
     * @return SyncInvoker<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> */
    public SyncInvoker<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> batchDeleteMaterialsInvoker(
        BatchDeleteMaterialsRequest request) {
        return new SyncInvoker<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse>(request,
            MeetingMeta.batchDeleteMaterials, hcClient);
    }

    /** 删除全球窗节目 删除全球窗节目
     *
     * @param BatchDeleteProgramsRequest 请求对象
     * @return BatchDeleteProgramsResponse */
    public BatchDeleteProgramsResponse batchDeletePrograms(BatchDeleteProgramsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeletePrograms);
    }

    /** 删除全球窗节目 删除全球窗节目
     *
     * @param BatchDeleteProgramsRequest 请求对象
     * @return SyncInvoker<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> */
    public SyncInvoker<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> batchDeleteProgramsInvoker(
        BatchDeleteProgramsRequest request) {
        return new SyncInvoker<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse>(request,
            MeetingMeta.batchDeletePrograms, hcClient);
    }

    /** 删除全球窗发布 删除全球窗发布
     *
     * @param BatchDeletePublicationsRequest 请求对象
     * @return BatchDeletePublicationsResponse */
    public BatchDeletePublicationsResponse batchDeletePublications(BatchDeletePublicationsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeletePublications);
    }

    /** 删除全球窗发布 删除全球窗发布
     *
     * @param BatchDeletePublicationsRequest 请求对象
     * @return SyncInvoker<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> */
    public SyncInvoker<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> batchDeletePublicationsInvoker(
        BatchDeletePublicationsRequest request) {
        return new SyncInvoker<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse>(request,
            MeetingMeta.batchDeletePublications, hcClient);
    }

    /** 批量删除用户 企业管理员通过该接口批量删除企业用户，全量成功或全量失败。
     *
     * @param BatchDeleteUsersRequest 请求对象
     * @return BatchDeleteUsersResponse */
    public BatchDeleteUsersResponse batchDeleteUsers(BatchDeleteUsersRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteUsers);
    }

    /** 批量删除用户 企业管理员通过该接口批量删除企业用户，全量成功或全量失败。
     *
     * @param BatchDeleteUsersRequest 请求对象
     * @return SyncInvoker<BatchDeleteUsersRequest, BatchDeleteUsersResponse> */
    public SyncInvoker<BatchDeleteUsersRequest, BatchDeleteUsersResponse> batchDeleteUsersInvoker(
        BatchDeleteUsersRequest request) {
        return new SyncInvoker<BatchDeleteUsersRequest, BatchDeleteUsersResponse>(request, MeetingMeta.batchDeleteUsers,
            hcClient);
    }

    /** 批量修改终端状态 批量修改终端状态
     *
     * @param BatchUpdateDevicesStatusRequest 请求对象
     * @return BatchUpdateDevicesStatusResponse */
    public BatchUpdateDevicesStatusResponse batchUpdateDevicesStatus(BatchUpdateDevicesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchUpdateDevicesStatus);
    }

    /** 批量修改终端状态 批量修改终端状态
     *
     * @param BatchUpdateDevicesStatusRequest 请求对象
     * @return SyncInvoker<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> */
    public SyncInvoker<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> batchUpdateDevicesStatusInvoker(
        BatchUpdateDevicesStatusRequest request) {
        return new SyncInvoker<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse>(request,
            MeetingMeta.batchUpdateDevicesStatus, hcClient);
    }

    /** 批量修改用户状态 企业管理员通过该接口批量修改用户状态，当用户账号数资源或者第三方电子白板资源到期后，若企业内对应资源的用户账号超过数量后会被系统随机自动停用，此时可通过该接口修改用户的状态。
     *
     * @param BatchUpdateUserStatusRequest 请求对象
     * @return BatchUpdateUserStatusResponse */
    public BatchUpdateUserStatusResponse batchUpdateUserStatus(BatchUpdateUserStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchUpdateUserStatus);
    }

    /** 批量修改用户状态 企业管理员通过该接口批量修改用户状态，当用户账号数资源或者第三方电子白板资源到期后，若企业内对应资源的用户账号超过数量后会被系统随机自动停用，此时可通过该接口修改用户的状态。
     *
     * @param BatchUpdateUserStatusRequest 请求对象
     * @return SyncInvoker<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> */
    public SyncInvoker<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> batchUpdateUserStatusInvoker(
        BatchUpdateUserStatusRequest request) {
        return new SyncInvoker<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse>(request,
            MeetingMeta.batchUpdateUserStatus, hcClient);
    }

    /** 广播会场 同一时间，只允许一个与会者被广播。
     *
     * @param BroadcastParticipantRequest 请求对象
     * @return BroadcastParticipantResponse */
    public BroadcastParticipantResponse broadcastParticipant(BroadcastParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.broadcastParticipant);
    }

    /** 广播会场 同一时间，只允许一个与会者被广播。
     *
     * @param BroadcastParticipantRequest 请求对象
     * @return SyncInvoker<BroadcastParticipantRequest, BroadcastParticipantResponse> */
    public SyncInvoker<BroadcastParticipantRequest, BroadcastParticipantResponse> broadcastParticipantInvoker(
        BroadcastParticipantRequest request) {
        return new SyncInvoker<BroadcastParticipantRequest, BroadcastParticipantResponse>(request,
            MeetingMeta.broadcastParticipant, hcClient);
    }

    /** 取消预约会议 取消预约会议。
     *
     * @param CancelMeetingRequest 请求对象
     * @return CancelMeetingResponse */
    public CancelMeetingResponse cancelMeeting(CancelMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.cancelMeeting);
    }

    /** 取消预约会议 取消预约会议。
     *
     * @param CancelMeetingRequest 请求对象
     * @return SyncInvoker<CancelMeetingRequest, CancelMeetingResponse> */
    public SyncInvoker<CancelMeetingRequest, CancelMeetingResponse> cancelMeetingInvoker(CancelMeetingRequest request) {
        return new SyncInvoker<CancelMeetingRequest, CancelMeetingResponse>(request, MeetingMeta.cancelMeeting,
            hcClient);
    }

    /** 取消周期会议 管理员或UC账号可以通过该接口取消周期会议
     *
     * @param CancelRecurringMeetingRequest 请求对象
     * @return CancelRecurringMeetingResponse */
    public CancelRecurringMeetingResponse cancelRecurringMeeting(CancelRecurringMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.cancelRecurringMeeting);
    }

    /** 取消周期会议 管理员或UC账号可以通过该接口取消周期会议
     *
     * @param CancelRecurringMeetingRequest 请求对象
     * @return SyncInvoker<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse> */
    public SyncInvoker<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse> cancelRecurringMeetingInvoker(
        CancelRecurringMeetingRequest request) {
        return new SyncInvoker<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse>(request,
            MeetingMeta.cancelRecurringMeeting, hcClient);
    }

    /** 取消周期子会议 管理员或UC账号可以通过该接口取消周期会议
     *
     * @param CancelRecurringSubMeetingRequest 请求对象
     * @return CancelRecurringSubMeetingResponse */
    public CancelRecurringSubMeetingResponse cancelRecurringSubMeeting(CancelRecurringSubMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.cancelRecurringSubMeeting);
    }

    /** 取消周期子会议 管理员或UC账号可以通过该接口取消周期会议
     *
     * @param CancelRecurringSubMeetingRequest 请求对象
     * @return SyncInvoker<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse> */
    public SyncInvoker<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse> cancelRecurringSubMeetingInvoker(
        CancelRecurringSubMeetingRequest request) {
        return new SyncInvoker<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse>(request,
            MeetingMeta.cancelRecurringSubMeeting, hcClient);
    }

    /** 校验滑块验证码 该接口提供校验滑块验证码。服务器收到请求，返回校验结果。用户在前台界面通过滑块操作匹配图形，使得抠图和原图吻合。然后服务器进行校验滑块验证码。
     *
     * @param CheckSlideVerifyCodeRequest 请求对象
     * @return CheckSlideVerifyCodeResponse */
    public CheckSlideVerifyCodeResponse checkSlideVerifyCode(CheckSlideVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkSlideVerifyCode);
    }

    /** 校验滑块验证码 该接口提供校验滑块验证码。服务器收到请求，返回校验结果。用户在前台界面通过滑块操作匹配图形，使得抠图和原图吻合。然后服务器进行校验滑块验证码。
     *
     * @param CheckSlideVerifyCodeRequest 请求对象
     * @return SyncInvoker<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> */
    public SyncInvoker<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> checkSlideVerifyCodeInvoker(
        CheckSlideVerifyCodeRequest request) {
        return new SyncInvoker<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse>(request,
            MeetingMeta.checkSlideVerifyCode, hcClient);
    }

    /** 校验Token 该接口提供校验token合法性功能。服务器收到请求后，验证token合法性并返回结果。如果参数needGenNewToken为true时，生成新的token并返回。
     *
     * @param CheckTokenRequest 请求对象
     * @return CheckTokenResponse */
    public CheckTokenResponse checkToken(CheckTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkToken);
    }

    /** 校验Token 该接口提供校验token合法性功能。服务器收到请求后，验证token合法性并返回结果。如果参数needGenNewToken为true时，生成新的token并返回。
     *
     * @param CheckTokenRequest 请求对象
     * @return SyncInvoker<CheckTokenRequest, CheckTokenResponse> */
    public SyncInvoker<CheckTokenRequest, CheckTokenResponse> checkTokenInvoker(CheckTokenRequest request) {
        return new SyncInvoker<CheckTokenRequest, CheckTokenResponse>(request, MeetingMeta.checkToken, hcClient);
    }

    /** 校验手机和邮箱对应的验证码 企业用户通过该接口校验手机和邮箱对应的验证码，一分钟内记录尝试次数不得超过5次。
     *
     * @param CheckVeriCodeForUpdateUserInfoRequest 请求对象
     * @return CheckVeriCodeForUpdateUserInfoResponse */
    public CheckVeriCodeForUpdateUserInfoResponse checkVeriCodeForUpdateUserInfo(
        CheckVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkVeriCodeForUpdateUserInfo);
    }

    /** 校验手机和邮箱对应的验证码 企业用户通过该接口校验手机和邮箱对应的验证码，一分钟内记录尝试次数不得超过5次。
     *
     * @param CheckVeriCodeForUpdateUserInfoRequest 请求对象
     * @return SyncInvoker<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> */
    public SyncInvoker<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> checkVeriCodeForUpdateUserInfoInvoker(
        CheckVeriCodeForUpdateUserInfoRequest request) {
        return new SyncInvoker<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse>(request,
            MeetingMeta.checkVeriCodeForUpdateUserInfo, hcClient);
    }

    /** 校验验证码 该接口提供校验验证码，服务器收到请求，返回结果。
     *
     * @param CheckVerifyCodeRequest 请求对象
     * @return CheckVerifyCodeResponse */
    public CheckVerifyCodeResponse checkVerifyCode(CheckVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkVerifyCode);
    }

    /** 校验验证码 该接口提供校验验证码，服务器收到请求，返回结果。
     *
     * @param CheckVerifyCodeRequest 请求对象
     * @return SyncInvoker<CheckVerifyCodeRequest, CheckVerifyCodeResponse> */
    public SyncInvoker<CheckVerifyCodeRequest, CheckVerifyCodeResponse> checkVerifyCodeInvoker(
        CheckVerifyCodeRequest request) {
        return new SyncInvoker<CheckVerifyCodeRequest, CheckVerifyCodeResponse>(request, MeetingMeta.checkVerifyCode,
            hcClient);
    }

    /** 匿名用户会议鉴权 未登陆终端，通过输入会议ID进行会议鉴权，返回鉴权随机数。如果需要密码则返回需要会议密码错误码，然后终端弹出输入会议ID输入框，用户输入密码后，终端再次调用该接口进行鉴权。
     *
     * @param CreateAnonymousAuthRandomRequest 请求对象
     * @return CreateAnonymousAuthRandomResponse */
    public CreateAnonymousAuthRandomResponse createAnonymousAuthRandom(CreateAnonymousAuthRandomRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createAnonymousAuthRandom);
    }

    /** 匿名用户会议鉴权 未登陆终端，通过输入会议ID进行会议鉴权，返回鉴权随机数。如果需要密码则返回需要会议密码错误码，然后终端弹出输入会议ID输入框，用户输入密码后，终端再次调用该接口进行鉴权。
     *
     * @param CreateAnonymousAuthRandomRequest 请求对象
     * @return SyncInvoker<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> */
    public SyncInvoker<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> createAnonymousAuthRandomInvoker(
        CreateAnonymousAuthRandomRequest request) {
        return new SyncInvoker<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse>(request,
            MeetingMeta.createAnonymousAuthRandom, hcClient);
    }

    /** 获取会控Token 获取会控授权令牌，然后会议会被拉起。
     *
     * @param CreateConfTokenRequest 请求对象
     * @return CreateConfTokenResponse */
    public CreateConfTokenResponse createConfToken(CreateConfTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createConfToken);
    }

    /** 获取会控Token 获取会控授权令牌，然后会议会被拉起。
     *
     * @param CreateConfTokenRequest 请求对象
     * @return SyncInvoker<CreateConfTokenRequest, CreateConfTokenResponse> */
    public SyncInvoker<CreateConfTokenRequest, CreateConfTokenResponse> createConfTokenInvoker(
        CreateConfTokenRequest request) {
        return new SyncInvoker<CreateConfTokenRequest, CreateConfTokenResponse>(request, MeetingMeta.createConfToken,
            hcClient);
    }

    /** 创建会议 您可根据需要创建立即会议和预约会议。
     *
     * @param CreateMeetingRequest 请求对象
     * @return CreateMeetingResponse */
    public CreateMeetingResponse createMeeting(CreateMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createMeeting);
    }

    /** 创建会议 您可根据需要创建立即会议和预约会议。
     *
     * @param CreateMeetingRequest 请求对象
     * @return SyncInvoker<CreateMeetingRequest, CreateMeetingResponse> */
    public SyncInvoker<CreateMeetingRequest, CreateMeetingResponse> createMeetingInvoker(CreateMeetingRequest request) {
        return new SyncInvoker<CreateMeetingRequest, CreateMeetingResponse>(request, MeetingMeta.createMeeting,
            hcClient);
    }

    /** 获取页面免登陆跳转的nonce信息
     * 通过token生成页面免登陆跳转到华为云会议的Portal的nonce信息。获取到nonce信息后，通过链接https://bmeeting.huaweicloud.com/?lang&#x3D;zh-CN&amp;nonce&#x3D;xxxxxxxxxxxxx#/login进行免登陆跳转。
     *
     * @param CreatePortalRefNonceRequest 请求对象
     * @return CreatePortalRefNonceResponse */
    public CreatePortalRefNonceResponse createPortalRefNonce(CreatePortalRefNonceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createPortalRefNonce);
    }

    /** 获取页面免登陆跳转的nonce信息
     * 通过token生成页面免登陆跳转到华为云会议的Portal的nonce信息。获取到nonce信息后，通过链接https://bmeeting.huaweicloud.com/?lang&#x3D;zh-CN&amp;nonce&#x3D;xxxxxxxxxxxxx#/login进行免登陆跳转。
     *
     * @param CreatePortalRefNonceRequest 请求对象
     * @return SyncInvoker<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> */
    public SyncInvoker<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> createPortalRefNonceInvoker(
        CreatePortalRefNonceRequest request) {
        return new SyncInvoker<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse>(request,
            MeetingMeta.createPortalRefNonce, hcClient);
    }

    /** 创建周期会议 管理员或UC账号可以通过该接口创建周期会议
     *
     * @param CreateRecurringMeetingRequest 请求对象
     * @return CreateRecurringMeetingResponse */
    public CreateRecurringMeetingResponse createRecurringMeeting(CreateRecurringMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createRecurringMeeting);
    }

    /** 创建周期会议 管理员或UC账号可以通过该接口创建周期会议
     *
     * @param CreateRecurringMeetingRequest 请求对象
     * @return SyncInvoker<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse> */
    public SyncInvoker<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse> createRecurringMeetingInvoker(
        CreateRecurringMeetingRequest request) {
        return new SyncInvoker<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse>(request,
            MeetingMeta.createRecurringMeeting, hcClient);
    }

    /** 企业管理员生成激活码 企业管理员生成智慧屏、电子白板、Ideahub的激活码
     *
     * @param CreateVisionActiveCodeRequest 请求对象
     * @return CreateVisionActiveCodeResponse */
    public CreateVisionActiveCodeResponse createVisionActiveCode(CreateVisionActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createVisionActiveCode);
    }

    /** 企业管理员生成激活码 企业管理员生成智慧屏、电子白板、Ideahub的激活码
     *
     * @param CreateVisionActiveCodeRequest 请求对象
     * @return SyncInvoker<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> */
    public SyncInvoker<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> createVisionActiveCodeInvoker(
        CreateVisionActiveCodeRequest request) {
        return new SyncInvoker<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse>(request,
            MeetingMeta.createVisionActiveCode, hcClient);
    }

    /** 获取websocket鉴权token 获取websocket鉴权token。
     *
     * @param CreateWebSocketTokenRequest 请求对象
     * @return CreateWebSocketTokenResponse */
    public CreateWebSocketTokenResponse createWebSocketToken(CreateWebSocketTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createWebSocketToken);
    }

    /** 获取websocket鉴权token 获取websocket鉴权token。
     *
     * @param CreateWebSocketTokenRequest 请求对象
     * @return SyncInvoker<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> */
    public SyncInvoker<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> createWebSocketTokenInvoker(
        CreateWebSocketTokenRequest request) {
        return new SyncInvoker<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse>(request,
            MeetingMeta.createWebSocketToken, hcClient);
    }

    /** 预约网络研讨会 您可根据需要预约网络研讨会。注意：暂不支持添加外部联系人作为与会嘉宾
     *
     * @param CreateWebinarRequest 请求对象
     * @return CreateWebinarResponse */
    public CreateWebinarResponse createWebinar(CreateWebinarRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createWebinar);
    }

    /** 预约网络研讨会 您可根据需要预约网络研讨会。注意：暂不支持添加外部联系人作为与会嘉宾
     *
     * @param CreateWebinarRequest 请求对象
     * @return SyncInvoker<CreateWebinarRequest, CreateWebinarResponse> */
    public SyncInvoker<CreateWebinarRequest, CreateWebinarResponse> createWebinarInvoker(CreateWebinarRequest request) {
        return new SyncInvoker<CreateWebinarRequest, CreateWebinarResponse>(request, MeetingMeta.createWebinar,
            hcClient);
    }

    /** 删除与会者 删除与会者。
     *
     * @param DeleteAttendeesRequest 请求对象
     * @return DeleteAttendeesResponse */
    public DeleteAttendeesResponse deleteAttendees(DeleteAttendeesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteAttendees);
    }

    /** 删除与会者 删除与会者。
     *
     * @param DeleteAttendeesRequest 请求对象
     * @return SyncInvoker<DeleteAttendeesRequest, DeleteAttendeesResponse> */
    public SyncInvoker<DeleteAttendeesRequest, DeleteAttendeesResponse> deleteAttendeesInvoker(
        DeleteAttendeesRequest request) {
        return new SyncInvoker<DeleteAttendeesRequest, DeleteAttendeesResponse>(request, MeetingMeta.deleteAttendees,
            hcClient);
    }

    /** SP管理员删除企业 删除企业
     *
     * @param DeleteCorpRequest 请求对象
     * @return DeleteCorpResponse */
    public DeleteCorpResponse deleteCorp(DeleteCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteCorp);
    }

    /** SP管理员删除企业 删除企业
     *
     * @param DeleteCorpRequest 请求对象
     * @return SyncInvoker<DeleteCorpRequest, DeleteCorpResponse> */
    public SyncInvoker<DeleteCorpRequest, DeleteCorpResponse> deleteCorpInvoker(DeleteCorpRequest request) {
        return new SyncInvoker<DeleteCorpRequest, DeleteCorpResponse>(request, MeetingMeta.deleteCorp, hcClient);
    }

    /** 删除云会议室 企业管理员通过该接口删除企业的云会议室
     *
     * @param DeleteCorpVmrRequest 请求对象
     * @return DeleteCorpVmrResponse */
    public DeleteCorpVmrResponse deleteCorpVmr(DeleteCorpVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteCorpVmr);
    }

    /** 删除云会议室 企业管理员通过该接口删除企业的云会议室
     *
     * @param DeleteCorpVmrRequest 请求对象
     * @return SyncInvoker<DeleteCorpVmrRequest, DeleteCorpVmrResponse> */
    public SyncInvoker<DeleteCorpVmrRequest, DeleteCorpVmrResponse> deleteCorpVmrInvoker(DeleteCorpVmrRequest request) {
        return new SyncInvoker<DeleteCorpVmrRequest, DeleteCorpVmrResponse>(request, MeetingMeta.deleteCorpVmr,
            hcClient);
    }

    /** 删除部门 企业管理员通过该接口删除部门。
     *
     * @param DeleteDepartmentRequest 请求对象
     * @return DeleteDepartmentResponse */
    public DeleteDepartmentResponse deleteDepartment(DeleteDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteDepartment);
    }

    /** 删除部门 企业管理员通过该接口删除部门。
     *
     * @param DeleteDepartmentRequest 请求对象
     * @return SyncInvoker<DeleteDepartmentRequest, DeleteDepartmentResponse> */
    public SyncInvoker<DeleteDepartmentRequest, DeleteDepartmentResponse> deleteDepartmentInvoker(
        DeleteDepartmentRequest request) {
        return new SyncInvoker<DeleteDepartmentRequest, DeleteDepartmentResponse>(request, MeetingMeta.deleteDepartment,
            hcClient);
    }

    /** 批量删除录制 批量删除录制。
     *
     * @param DeleteRecordingsRequest 请求对象
     * @return DeleteRecordingsResponse */
    public DeleteRecordingsResponse deleteRecordings(DeleteRecordingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteRecordings);
    }

    /** 批量删除录制 批量删除录制。
     *
     * @param DeleteRecordingsRequest 请求对象
     * @return SyncInvoker<DeleteRecordingsRequest, DeleteRecordingsResponse> */
    public SyncInvoker<DeleteRecordingsRequest, DeleteRecordingsResponse> deleteRecordingsInvoker(
        DeleteRecordingsRequest request) {
        return new SyncInvoker<DeleteRecordingsRequest, DeleteRecordingsResponse>(request, MeetingMeta.deleteRecordings,
            hcClient);
    }

    /** SP管理员根据删除企业资源 企业删除资源项，删除资源项后，企业资源总数会自动减少
     *
     * @param DeleteResourceRequest 请求对象
     * @return DeleteResourceResponse */
    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteResource);
    }

    /** SP管理员根据删除企业资源 企业删除资源项，删除资源项后，企业资源总数会自动减少
     *
     * @param DeleteResourceRequest 请求对象
     * @return SyncInvoker<DeleteResourceRequest, DeleteResourceResponse> */
    public SyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceInvoker(
        DeleteResourceRequest request) {
        return new SyncInvoker<DeleteResourceRequest, DeleteResourceResponse>(request, MeetingMeta.deleteResource,
            hcClient);
    }

    /** 企业管理员删除激活码 企业管理员批量删除激活码
     *
     * @param DeleteVisionActiveCodeRequest 请求对象
     * @return DeleteVisionActiveCodeResponse */
    public DeleteVisionActiveCodeResponse deleteVisionActiveCode(DeleteVisionActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteVisionActiveCode);
    }

    /** 企业管理员删除激活码 企业管理员批量删除激活码
     *
     * @param DeleteVisionActiveCodeRequest 请求对象
     * @return SyncInvoker<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> */
    public SyncInvoker<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> deleteVisionActiveCodeInvoker(
        DeleteVisionActiveCodeRequest request) {
        return new SyncInvoker<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse>(request,
            MeetingMeta.deleteVisionActiveCode, hcClient);
    }

    /** 取消网络研讨会 您可根据需要取消网络研讨会。
     *
     * @param DeleteWebinarRequest 请求对象
     * @return DeleteWebinarResponse */
    public DeleteWebinarResponse deleteWebinar(DeleteWebinarRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteWebinar);
    }

    /** 取消网络研讨会 您可根据需要取消网络研讨会。
     *
     * @param DeleteWebinarRequest 请求对象
     * @return SyncInvoker<DeleteWebinarRequest, DeleteWebinarResponse> */
    public SyncInvoker<DeleteWebinarRequest, DeleteWebinarResponse> deleteWebinarInvoker(DeleteWebinarRequest request) {
        return new SyncInvoker<DeleteWebinarRequest, DeleteWebinarResponse>(request, MeetingMeta.deleteWebinar,
            hcClient);
    }

    /** 回收云会议室 企业管理员通过该接口回收云会议室
     *
     * @param DisassociateVmrRequest 请求对象
     * @return DisassociateVmrResponse */
    public DisassociateVmrResponse disassociateVmr(DisassociateVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.disassociateVmr);
    }

    /** 回收云会议室 企业管理员通过该接口回收云会议室
     *
     * @param DisassociateVmrRequest 请求对象
     * @return SyncInvoker<DisassociateVmrRequest, DisassociateVmrResponse> */
    public SyncInvoker<DisassociateVmrRequest, DisassociateVmrResponse> disassociateVmrInvoker(
        DisassociateVmrRequest request) {
        return new SyncInvoker<DisassociateVmrRequest, DisassociateVmrResponse>(request, MeetingMeta.disassociateVmr,
            hcClient);
    }

    /** 举手 所有来宾可以举手。来宾举手后，可以取消自己的举手。主持人可以取消所有来宾的举手。
     *
     * @param HandRequest 请求对象
     * @return HandResponse */
    public HandResponse hand(HandRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.hand);
    }

    /** 举手 所有来宾可以举手。来宾举手后，可以取消自己的举手。主持人可以取消所有来宾的举手。
     *
     * @param HandRequest 请求对象
     * @return SyncInvoker<HandRequest, HandResponse> */
    public SyncInvoker<HandRequest, HandResponse> handInvoker(HandRequest request) {
        return new SyncInvoker<HandRequest, HandResponse>(request, MeetingMeta.hand, hcClient);
    }

    /** 挂断与会者 挂断正在通话中的与会者。
     *
     * @param HangUpRequest 请求对象
     * @return HangUpResponse */
    public HangUpResponse hangUp(HangUpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.hangUp);
    }

    /** 挂断与会者 挂断正在通话中的与会者。
     *
     * @param HangUpRequest 请求对象
     * @return SyncInvoker<HangUpRequest, HangUpResponse> */
    public SyncInvoker<HangUpRequest, HangUpResponse> hangUpInvoker(HangUpRequest request) {
        return new SyncInvoker<HangUpRequest, HangUpResponse>(request, MeetingMeta.hangUp, hcClient);
    }

    /** 邀请与会者 邀请与会者加入会议。
     *
     * @param InviteParticipantRequest 请求对象
     * @return InviteParticipantResponse */
    public InviteParticipantResponse inviteParticipant(InviteParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteParticipant);
    }

    /** 邀请与会者 邀请与会者加入会议。
     *
     * @param InviteParticipantRequest 请求对象
     * @return SyncInvoker<InviteParticipantRequest, InviteParticipantResponse> */
    public SyncInvoker<InviteParticipantRequest, InviteParticipantResponse> inviteParticipantInvoker(
        InviteParticipantRequest request) {
        return new SyncInvoker<InviteParticipantRequest, InviteParticipantResponse>(request,
            MeetingMeta.inviteParticipant, hcClient);
    }

    /** 邀请共享 场景描述：主席邀请、取消邀请会场共享 功能描述：主席邀请、取消邀请会场共享
     *
     * @param InviteShareRequest 请求对象
     * @return InviteShareResponse */
    public InviteShareResponse inviteShare(InviteShareRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteShare);
    }

    /** 邀请共享 场景描述：主席邀请、取消邀请会场共享 功能描述：主席邀请、取消邀请会场共享
     *
     * @param InviteShareRequest 请求对象
     * @return SyncInvoker<InviteShareRequest, InviteShareResponse> */
    public SyncInvoker<InviteShareRequest, InviteShareResponse> inviteShareInvoker(InviteShareRequest request) {
        return new SyncInvoker<InviteShareRequest, InviteShareResponse>(request, MeetingMeta.inviteShare, hcClient);
    }

    /** 邀请用户 通过手机号码或者邮箱地址邀请用户加入企业。 * 若被邀请用户在华为云会议系统中不存在，则： - 华为云会议免费版和华为云会议标准版发送短信/邮件邀请用户完成注册后加入企业。用户注册成功后，加入该企业。 -
     * 华为云会议旗舰版在企业内直接添加该用户。用户会收到华为云会议的初始密码，用户第一次以手机号或者邮箱登录时，需要修改密码。 *
     * 若被邀请用户在华为云会议系统中存在，则该用户会收到短信或者邮件确认。确认完成后改用户加入企业内。该用户的密码保持原来的密码不变。
     *
     * @param InviteUserRequest 请求对象
     * @return InviteUserResponse */
    public InviteUserResponse inviteUser(InviteUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteUser);
    }

    /** 邀请用户 通过手机号码或者邮箱地址邀请用户加入企业。 * 若被邀请用户在华为云会议系统中不存在，则： - 华为云会议免费版和华为云会议标准版发送短信/邮件邀请用户完成注册后加入企业。用户注册成功后，加入该企业。 -
     * 华为云会议旗舰版在企业内直接添加该用户。用户会收到华为云会议的初始密码，用户第一次以手机号或者邮箱登录时，需要修改密码。 *
     * 若被邀请用户在华为云会议系统中存在，则该用户会收到短信或者邮件确认。确认完成后改用户加入企业内。该用户的密码保持原来的密码不变。
     *
     * @param InviteUserRequest 请求对象
     * @return SyncInvoker<InviteUserRequest, InviteUserResponse> */
    public SyncInvoker<InviteUserRequest, InviteUserResponse> inviteUserInvoker(InviteUserRequest request) {
        return new SyncInvoker<InviteUserRequest, InviteUserResponse>(request, MeetingMeta.inviteUser, hcClient);
    }

    /** 通过会议ID和密码邀请与会者 通过会议ID和密码邀请与会者
     *
     * @param InviteWithPwdRequest 请求对象
     * @return InviteWithPwdResponse */
    public InviteWithPwdResponse inviteWithPwd(InviteWithPwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteWithPwd);
    }

    /** 通过会议ID和密码邀请与会者 通过会议ID和密码邀请与会者
     *
     * @param InviteWithPwdRequest 请求对象
     * @return SyncInvoker<InviteWithPwdRequest, InviteWithPwdResponse> */
    public SyncInvoker<InviteWithPwdRequest, InviteWithPwdResponse> inviteWithPwdInvoker(InviteWithPwdRequest request) {
        return new SyncInvoker<InviteWithPwdRequest, InviteWithPwdResponse>(request, MeetingMeta.inviteWithPwd,
            hcClient);
    }

    /** 查询历史召开的网络研讨会列表 查询历史召开的网络研讨会列表，企业管理员可查询企业内所有历史召开的网络研讨会，普通账号查询自己历史召开的网络研讨会
     *
     * @param ListHistoryWebinarsRequest 请求对象
     * @return ListHistoryWebinarsResponse */
    public ListHistoryWebinarsResponse listHistoryWebinars(ListHistoryWebinarsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.listHistoryWebinars);
    }

    /** 查询历史召开的网络研讨会列表 查询历史召开的网络研讨会列表，企业管理员可查询企业内所有历史召开的网络研讨会，普通账号查询自己历史召开的网络研讨会
     *
     * @param ListHistoryWebinarsRequest 请求对象
     * @return SyncInvoker<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse> */
    public SyncInvoker<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse> listHistoryWebinarsInvoker(
        ListHistoryWebinarsRequest request) {
        return new SyncInvoker<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse>(request,
            MeetingMeta.listHistoryWebinars, hcClient);
    }

    /** 查询正在召开的网络研讨会列表 查询正在召开的网络研讨会列表：企业管理员可查询企业内所有正在召开的网络研讨会，普通账号查询自己正在召开的网络研讨会
     *
     * @param ListOngoingWebinarsRequest 请求对象
     * @return ListOngoingWebinarsResponse */
    public ListOngoingWebinarsResponse listOngoingWebinars(ListOngoingWebinarsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.listOngoingWebinars);
    }

    /** 查询正在召开的网络研讨会列表 查询正在召开的网络研讨会列表：企业管理员可查询企业内所有正在召开的网络研讨会，普通账号查询自己正在召开的网络研讨会
     *
     * @param ListOngoingWebinarsRequest 请求对象
     * @return SyncInvoker<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse> */
    public SyncInvoker<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse> listOngoingWebinarsInvoker(
        ListOngoingWebinarsRequest request) {
        return new SyncInvoker<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse>(request,
            MeetingMeta.listOngoingWebinars, hcClient);
    }

    /** 查询即将召开的网络研讨会列表 查询即将召开的网络研讨会列表：企业管理员可查询企业内所有即将召开的网络研讨会，普通账号查询自己即将召开的网络研讨会
     *
     * @param ListUpComingWebinarsRequest 请求对象
     * @return ListUpComingWebinarsResponse */
    public ListUpComingWebinarsResponse listUpComingWebinars(ListUpComingWebinarsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.listUpComingWebinars);
    }

    /** 查询即将召开的网络研讨会列表 查询即将召开的网络研讨会列表：企业管理员可查询企业内所有即将召开的网络研讨会，普通账号查询自己即将召开的网络研讨会
     *
     * @param ListUpComingWebinarsRequest 请求对象
     * @return SyncInvoker<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse> */
    public SyncInvoker<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse> listUpComingWebinarsInvoker(
        ListUpComingWebinarsRequest request) {
        return new SyncInvoker<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse>(request,
            MeetingMeta.listUpComingWebinars, hcClient);
    }

    /** 启停会议直播 启动或停止会议直播。
     *
     * @param LiveRequest 请求对象
     * @return LiveResponse */
    public LiveResponse live(LiveRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.live);
    }

    /** 启停会议直播 启动或停止会议直播。
     *
     * @param LiveRequest 请求对象
     * @return SyncInvoker<LiveRequest, LiveResponse> */
    public SyncInvoker<LiveRequest, LiveResponse> liveInvoker(LiveRequest request) {
        return new SyncInvoker<LiveRequest, LiveResponse>(request, MeetingMeta.live, hcClient);
    }

    /** 锁定会议 锁定或解锁会议。锁定会议后，不允许与会者加入会议。
     *
     * @param LockMeetingRequest 请求对象
     * @return LockMeetingResponse */
    public LockMeetingResponse lockMeeting(LockMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.lockMeeting);
    }

    /** 锁定会议 锁定或解锁会议。锁定会议后，不允许与会者加入会议。
     *
     * @param LockMeetingRequest 请求对象
     * @return SyncInvoker<LockMeetingRequest, LockMeetingResponse> */
    public SyncInvoker<LockMeetingRequest, LockMeetingResponse> lockMeetingInvoker(LockMeetingRequest request) {
        return new SyncInvoker<LockMeetingRequest, LockMeetingResponse>(request, MeetingMeta.lockMeeting, hcClient);
    }

    /** 锁定会场视频源 锁定或者解锁某在线会场的视频源。
     *
     * @param LockViewRequest 请求对象
     * @return LockViewResponse */
    public LockViewResponse lockView(LockViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.lockView);
    }

    /** 锁定会场视频源 锁定或者解锁某在线会场的视频源。
     *
     * @param LockViewRequest 请求对象
     * @return SyncInvoker<LockViewRequest, LockViewResponse> */
    public SyncInvoker<LockViewRequest, LockViewResponse> lockViewInvoker(LockViewRequest request) {
        return new SyncInvoker<LockViewRequest, LockViewResponse>(request, MeetingMeta.lockView, hcClient);
    }

    /** 全场静音 主持人可以通过该接口静音/取消静音整个会议所有与会者（主持人除外）。
     *
     * @param MuteMeetingRequest 请求对象
     * @return MuteMeetingResponse */
    public MuteMeetingResponse muteMeeting(MuteMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.muteMeeting);
    }

    /** 全场静音 主持人可以通过该接口静音/取消静音整个会议所有与会者（主持人除外）。
     *
     * @param MuteMeetingRequest 请求对象
     * @return SyncInvoker<MuteMeetingRequest, MuteMeetingResponse> */
    public SyncInvoker<MuteMeetingRequest, MuteMeetingResponse> muteMeetingInvoker(MuteMeetingRequest request) {
        return new SyncInvoker<MuteMeetingRequest, MuteMeetingResponse>(request, MeetingMeta.muteMeeting, hcClient);
    }

    /** 静音与会者 主持人可以静音/取消静音任意与会者，来宾也可静音/取消静音自己。
     *
     * @param MuteParticipantRequest 请求对象
     * @return MuteParticipantResponse */
    public MuteParticipantResponse muteParticipant(MuteParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.muteParticipant);
    }

    /** 静音与会者 主持人可以静音/取消静音任意与会者，来宾也可静音/取消静音自己。
     *
     * @param MuteParticipantRequest 请求对象
     * @return SyncInvoker<MuteParticipantRequest, MuteParticipantResponse> */
    public SyncInvoker<MuteParticipantRequest, MuteParticipantResponse> muteParticipantInvoker(
        MuteParticipantRequest request) {
        return new SyncInvoker<MuteParticipantRequest, MuteParticipantResponse>(request, MeetingMeta.muteParticipant,
            hcClient);
    }

    /** 延长会议 延长会议。
     *
     * @param ProlongMeetingRequest 请求对象
     * @return ProlongMeetingResponse */
    public ProlongMeetingResponse prolongMeeting(ProlongMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.prolongMeeting);
    }

    /** 延长会议 延长会议。
     *
     * @param ProlongMeetingRequest 请求对象
     * @return SyncInvoker<ProlongMeetingRequest, ProlongMeetingResponse> */
    public SyncInvoker<ProlongMeetingRequest, ProlongMeetingResponse> prolongMeetingInvoker(
        ProlongMeetingRequest request) {
        return new SyncInvoker<ProlongMeetingRequest, ProlongMeetingResponse>(request, MeetingMeta.prolongMeeting,
            hcClient);
    }

    /** 启停会议录制 启动或停止会议录制。
     *
     * @param RecordRequest 请求对象
     * @return RecordResponse */
    public RecordResponse record(RecordRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.record);
    }

    /** 启停会议录制 启动或停止会议录制。
     *
     * @param RecordRequest 请求对象
     * @return SyncInvoker<RecordRequest, RecordResponse> */
    public SyncInvoker<RecordRequest, RecordResponse> recordInvoker(RecordRequest request) {
        return new SyncInvoker<RecordRequest, RecordResponse>(request, MeetingMeta.record, hcClient);
    }

    /** 重命名与会者 重命名某个与会者。
     *
     * @param RenameParticipantRequest 请求对象
     * @return RenameParticipantResponse */
    public RenameParticipantResponse renameParticipant(RenameParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.renameParticipant);
    }

    /** 重命名与会者 重命名某个与会者。
     *
     * @param RenameParticipantRequest 请求对象
     * @return SyncInvoker<RenameParticipantRequest, RenameParticipantResponse> */
    public SyncInvoker<RenameParticipantRequest, RenameParticipantResponse> renameParticipantInvoker(
        RenameParticipantRequest request) {
        return new SyncInvoker<RenameParticipantRequest, RenameParticipantResponse>(request,
            MeetingMeta.renameParticipant, hcClient);
    }

    /** 企业管理员重置硬终端激活码 当硬终端激活码失效时，企业管理员可以通过该接口重置激活码，使用重新获取的激活码激活终端，每24小时可重新激活5次。
     *
     * @param ResetActivecodeRequest 请求对象
     * @return ResetActivecodeResponse */
    public ResetActivecodeResponse resetActivecode(ResetActivecodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetActivecode);
    }

    /** 企业管理员重置硬终端激活码 当硬终端激活码失效时，企业管理员可以通过该接口重置激活码，使用重新获取的激活码激活终端，每24小时可重新激活5次。
     *
     * @param ResetActivecodeRequest 请求对象
     * @return SyncInvoker<ResetActivecodeRequest, ResetActivecodeResponse> */
    public SyncInvoker<ResetActivecodeRequest, ResetActivecodeResponse> resetActivecodeInvoker(
        ResetActivecodeRequest request) {
        return new SyncInvoker<ResetActivecodeRequest, ResetActivecodeResponse>(request, MeetingMeta.resetActivecode,
            hcClient);
    }

    /** 用户重置密码 该接口提供给用户重置密码功能，服务器收到请求，重新设置用户密码并返回结果。
     *
     * @param ResetPwdRequest 请求对象
     * @return ResetPwdResponse */
    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetPwd);
    }

    /** 用户重置密码 该接口提供给用户重置密码功能，服务器收到请求，重新设置用户密码并返回结果。
     *
     * @param ResetPwdRequest 请求对象
     * @return SyncInvoker<ResetPwdRequest, ResetPwdResponse> */
    public SyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdInvoker(ResetPwdRequest request) {
        return new SyncInvoker<ResetPwdRequest, ResetPwdResponse>(request, MeetingMeta.resetPwd, hcClient);
    }

    /** 企业管理员重置企业成员密码 企业管理员通过该接口提供企业管理员重置企业成员密码的功能。当服务器收到重置密码的请求时，发送新的密码到企业成员的邮箱或者短信，并返回结果。
     *
     * @param ResetPwdByAdminRequest 请求对象
     * @return ResetPwdByAdminResponse */
    public ResetPwdByAdminResponse resetPwdByAdmin(ResetPwdByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetPwdByAdmin);
    }

    /** 企业管理员重置企业成员密码 企业管理员通过该接口提供企业管理员重置企业成员密码的功能。当服务器收到重置密码的请求时，发送新的密码到企业成员的邮箱或者短信，并返回结果。
     *
     * @param ResetPwdByAdminRequest 请求对象
     * @return SyncInvoker<ResetPwdByAdminRequest, ResetPwdByAdminResponse> */
    public SyncInvoker<ResetPwdByAdminRequest, ResetPwdByAdminResponse> resetPwdByAdminInvoker(
        ResetPwdByAdminRequest request) {
        return new SyncInvoker<ResetPwdByAdminRequest, ResetPwdByAdminResponse>(request, MeetingMeta.resetPwdByAdmin,
            hcClient);
    }

    /** 企业管理员重置账号的激活码 企业管理员重置账号的激活码，重置后，原设备直接解绑，必须重新激活使用,若手机邮箱不填，则不会发送新的激活码
     *
     * @param ResetVisionActiveCodeRequest 请求对象
     * @return ResetVisionActiveCodeResponse */
    public ResetVisionActiveCodeResponse resetVisionActiveCode(ResetVisionActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetVisionActiveCode);
    }

    /** 企业管理员重置账号的激活码 企业管理员重置账号的激活码，重置后，原设备直接解绑，必须重新激活使用,若手机邮箱不填，则不会发送新的激活码
     *
     * @param ResetVisionActiveCodeRequest 请求对象
     * @return SyncInvoker<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> */
    public SyncInvoker<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> resetVisionActiveCodeInvoker(
        ResetVisionActiveCodeRequest request) {
        return new SyncInvoker<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse>(request,
            MeetingMeta.resetVisionActiveCode, hcClient);
    }

    /** 点名会场 同一时间，只允许一个与会者被点名。点名会场的效果是除了主持人外，点名与会者为非静音状态，未点名的与会者统一为静音状态。
     *
     * @param RollcallParticipantRequest 请求对象
     * @return RollcallParticipantResponse */
    public RollcallParticipantResponse rollcallParticipant(RollcallParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.rollcallParticipant);
    }

    /** 点名会场 同一时间，只允许一个与会者被点名。点名会场的效果是除了主持人外，点名与会者为非静音状态，未点名的与会者统一为静音状态。
     *
     * @param RollcallParticipantRequest 请求对象
     * @return SyncInvoker<RollcallParticipantRequest, RollcallParticipantResponse> */
    public SyncInvoker<RollcallParticipantRequest, RollcallParticipantResponse> rollcallParticipantInvoker(
        RollcallParticipantRequest request) {
        return new SyncInvoker<RollcallParticipantRequest, RollcallParticipantResponse>(request,
            MeetingMeta.rollcallParticipant, hcClient);
    }

    /** 查询历史会议的与会者记录 查询指定历史会议的与会者记录。
     *
     * @param SearchAttendanceRecordsOfHisMeetingRequest 请求对象
     * @return SearchAttendanceRecordsOfHisMeetingResponse */
    public SearchAttendanceRecordsOfHisMeetingResponse searchAttendanceRecordsOfHisMeeting(
        SearchAttendanceRecordsOfHisMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchAttendanceRecordsOfHisMeeting);
    }

    /** 查询历史会议的与会者记录 查询指定历史会议的与会者记录。
     *
     * @param SearchAttendanceRecordsOfHisMeetingRequest 请求对象
     * @return SyncInvoker<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> */
    public SyncInvoker<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> searchAttendanceRecordsOfHisMeetingInvoker(
        SearchAttendanceRecordsOfHisMeetingRequest request) {
        return new SyncInvoker<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse>(
            request, MeetingMeta.searchAttendanceRecordsOfHisMeeting, hcClient);
    }

    /** SP管理员分页搜索企业 分页搜索企业,支持名称、企业ID搜索
     *
     * @param SearchCorpRequest 请求对象
     * @return SearchCorpResponse */
    public SearchCorpResponse searchCorp(SearchCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorp);
    }

    /** SP管理员分页搜索企业 分页搜索企业,支持名称、企业ID搜索
     *
     * @param SearchCorpRequest 请求对象
     * @return SyncInvoker<SearchCorpRequest, SearchCorpResponse> */
    public SyncInvoker<SearchCorpRequest, SearchCorpResponse> searchCorpInvoker(SearchCorpRequest request) {
        return new SyncInvoker<SearchCorpRequest, SearchCorpResponse>(request, MeetingMeta.searchCorp, hcClient);
    }

    /** 分页查询企业管理员 通过该接口分页查询企业管理员。
     *
     * @param SearchCorpAdminsRequest 请求对象
     * @return SearchCorpAdminsResponse */
    public SearchCorpAdminsResponse searchCorpAdmins(SearchCorpAdminsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpAdmins);
    }

    /** 分页查询企业管理员 通过该接口分页查询企业管理员。
     *
     * @param SearchCorpAdminsRequest 请求对象
     * @return SyncInvoker<SearchCorpAdminsRequest, SearchCorpAdminsResponse> */
    public SyncInvoker<SearchCorpAdminsRequest, SearchCorpAdminsResponse> searchCorpAdminsInvoker(
        SearchCorpAdminsRequest request) {
        return new SyncInvoker<SearchCorpAdminsRequest, SearchCorpAdminsResponse>(request, MeetingMeta.searchCorpAdmins,
            hcClient);
    }

    /** 查询企业通讯录 企业用户（含管理员）通过该接口查询该企业的通讯录。
     *
     * @param SearchCorpDirRequest 请求对象
     * @return SearchCorpDirResponse */
    public SearchCorpDirResponse searchCorpDir(SearchCorpDirRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpDir);
    }

    /** 查询企业通讯录 企业用户（含管理员）通过该接口查询该企业的通讯录。
     *
     * @param SearchCorpDirRequest 请求对象
     * @return SyncInvoker<SearchCorpDirRequest, SearchCorpDirResponse> */
    public SyncInvoker<SearchCorpDirRequest, SearchCorpDirResponse> searchCorpDirInvoker(SearchCorpDirRequest request) {
        return new SyncInvoker<SearchCorpDirRequest, SearchCorpDirResponse>(request, MeetingMeta.searchCorpDir,
            hcClient);
    }

    /** 企业管理员分页查询企业资源订单列表 企业管理员根据条件查询企业资源订单列表
     *
     * @param SearchCorpResourcesRequest 请求对象
     * @return SearchCorpResourcesResponse */
    public SearchCorpResourcesResponse searchCorpResources(SearchCorpResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpResources);
    }

    /** 企业管理员分页查询企业资源订单列表 企业管理员根据条件查询企业资源订单列表
     *
     * @param SearchCorpResourcesRequest 请求对象
     * @return SyncInvoker<SearchCorpResourcesRequest, SearchCorpResourcesResponse> */
    public SyncInvoker<SearchCorpResourcesRequest, SearchCorpResourcesResponse> searchCorpResourcesInvoker(
        SearchCorpResourcesRequest request) {
        return new SyncInvoker<SearchCorpResourcesRequest, SearchCorpResourcesResponse>(request,
            MeetingMeta.searchCorpResources, hcClient);
    }

    /** 企业管理员分页查询企业云会议室 企业管理员通过该接口分页查询企业的云会议室。
     *
     * @param SearchCorpVmrRequest 请求对象
     * @return SearchCorpVmrResponse */
    public SearchCorpVmrResponse searchCorpVmr(SearchCorpVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpVmr);
    }

    /** 企业管理员分页查询企业云会议室 企业管理员通过该接口分页查询企业的云会议室。
     *
     * @param SearchCorpVmrRequest 请求对象
     * @return SyncInvoker<SearchCorpVmrRequest, SearchCorpVmrResponse> */
    public SyncInvoker<SearchCorpVmrRequest, SearchCorpVmrResponse> searchCorpVmrInvoker(SearchCorpVmrRequest request) {
        return new SyncInvoker<SearchCorpVmrRequest, SearchCorpVmrResponse>(request, MeetingMeta.searchCorpVmr,
            hcClient);
    }

    /** 查询历史会议的会控记录 查询指定历史会议的会控记录。
     *
     * @param SearchCtlRecordsOfHisMeetingRequest 请求对象
     * @return SearchCtlRecordsOfHisMeetingResponse */
    public SearchCtlRecordsOfHisMeetingResponse searchCtlRecordsOfHisMeeting(
        SearchCtlRecordsOfHisMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCtlRecordsOfHisMeeting);
    }

    /** 查询历史会议的会控记录 查询指定历史会议的会控记录。
     *
     * @param SearchCtlRecordsOfHisMeetingRequest 请求对象
     * @return SyncInvoker<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> */
    public SyncInvoker<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> searchCtlRecordsOfHisMeetingInvoker(
        SearchCtlRecordsOfHisMeetingRequest request) {
        return new SyncInvoker<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse>(request,
            MeetingMeta.searchCtlRecordsOfHisMeeting, hcClient);
    }

    /** 按名称查询所有的部门 企业管理员通过该接口按名称查询所有的部门。
     *
     * @param SearchDepartmentByNameRequest 请求对象
     * @return SearchDepartmentByNameResponse */
    public SearchDepartmentByNameResponse searchDepartmentByName(SearchDepartmentByNameRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchDepartmentByName);
    }

    /** 按名称查询所有的部门 企业管理员通过该接口按名称查询所有的部门。
     *
     * @param SearchDepartmentByNameRequest 请求对象
     * @return SyncInvoker<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> */
    public SyncInvoker<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> searchDepartmentByNameInvoker(
        SearchDepartmentByNameRequest request) {
        return new SyncInvoker<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse>(request,
            MeetingMeta.searchDepartmentByName, hcClient);
    }

    /** 分页查询终端 企业管理员通过该接口分页查询终端信息。
     *
     * @param SearchDevicesRequest 请求对象
     * @return SearchDevicesResponse */
    public SearchDevicesResponse searchDevices(SearchDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchDevices);
    }

    /** 分页查询终端 企业管理员通过该接口分页查询终端信息。
     *
     * @param SearchDevicesRequest 请求对象
     * @return SyncInvoker<SearchDevicesRequest, SearchDevicesResponse> */
    public SyncInvoker<SearchDevicesRequest, SearchDevicesResponse> searchDevicesInvoker(SearchDevicesRequest request) {
        return new SyncInvoker<SearchDevicesRequest, SearchDevicesResponse>(request, MeetingMeta.searchDevices,
            hcClient);
    }

    /** 查询历史会议列表 管理员可以查询管理权限域内所有的历史会议，普通用户仅能查询当前帐号管理的历史会议。不带查询参数时，默认查询权限范围内的历史会议。
     *
     * @param SearchHisMeetingsRequest 请求对象
     * @return SearchHisMeetingsResponse */
    public SearchHisMeetingsResponse searchHisMeetings(SearchHisMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchHisMeetings);
    }

    /** 查询历史会议列表 管理员可以查询管理权限域内所有的历史会议，普通用户仅能查询当前帐号管理的历史会议。不带查询参数时，默认查询权限范围内的历史会议。
     *
     * @param SearchHisMeetingsRequest 请求对象
     * @return SyncInvoker<SearchHisMeetingsRequest, SearchHisMeetingsResponse> */
    public SyncInvoker<SearchHisMeetingsRequest, SearchHisMeetingsResponse> searchHisMeetingsInvoker(
        SearchHisMeetingsRequest request) {
        return new SyncInvoker<SearchHisMeetingsRequest, SearchHisMeetingsResponse>(request,
            MeetingMeta.searchHisMeetings, hcClient);
    }

    /** 分页查询全球窗素材 分页查询全球窗素材
     *
     * @param SearchMaterialsRequest 请求对象
     * @return SearchMaterialsResponse */
    public SearchMaterialsResponse searchMaterials(SearchMaterialsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMaterials);
    }

    /** 分页查询全球窗素材 分页查询全球窗素材
     *
     * @param SearchMaterialsRequest 请求对象
     * @return SyncInvoker<SearchMaterialsRequest, SearchMaterialsResponse> */
    public SyncInvoker<SearchMaterialsRequest, SearchMaterialsResponse> searchMaterialsInvoker(
        SearchMaterialsRequest request) {
        return new SyncInvoker<SearchMaterialsRequest, SearchMaterialsResponse>(request, MeetingMeta.searchMaterials,
            hcClient);
    }

    /** 查询会议纪要列表 用户查询自己的会议纪要列表
     *
     * @param SearchMeetingFileListRequest 请求对象
     * @return SearchMeetingFileListResponse */
    public SearchMeetingFileListResponse searchMeetingFileList(SearchMeetingFileListRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMeetingFileList);
    }

    /** 查询会议纪要列表 用户查询自己的会议纪要列表
     *
     * @param SearchMeetingFileListRequest 请求对象
     * @return SyncInvoker<SearchMeetingFileListRequest, SearchMeetingFileListResponse> */
    public SyncInvoker<SearchMeetingFileListRequest, SearchMeetingFileListResponse> searchMeetingFileListInvoker(
        SearchMeetingFileListRequest request) {
        return new SyncInvoker<SearchMeetingFileListRequest, SearchMeetingFileListResponse>(request,
            MeetingMeta.searchMeetingFileList, hcClient);
    }

    /** 查询会议列表 管理员可以查询管理权限域内所有的会议，普通用户仅能查询当前帐号管理的会议。不带查询参数时，默认查询权限范围内正在召开或还未召开的会议。
     *
     * @param SearchMeetingsRequest 请求对象
     * @return SearchMeetingsResponse */
    public SearchMeetingsResponse searchMeetings(SearchMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMeetings);
    }

    /** 查询会议列表 管理员可以查询管理权限域内所有的会议，普通用户仅能查询当前帐号管理的会议。不带查询参数时，默认查询权限范围内正在召开或还未召开的会议。
     *
     * @param SearchMeetingsRequest 请求对象
     * @return SyncInvoker<SearchMeetingsRequest, SearchMeetingsResponse> */
    public SyncInvoker<SearchMeetingsRequest, SearchMeetingsResponse> searchMeetingsInvoker(
        SearchMeetingsRequest request) {
        return new SyncInvoker<SearchMeetingsRequest, SearchMeetingsResponse>(request, MeetingMeta.searchMeetings,
            hcClient);
    }

    /** 普通用户分页查询云会议室及个人会议ID 企业用户通过该接口查询个人已分配的云会议室及个人会议ID。
     *
     * @param SearchMemberVmrRequest 请求对象
     * @return SearchMemberVmrResponse */
    public SearchMemberVmrResponse searchMemberVmr(SearchMemberVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMemberVmr);
    }

    /** 普通用户分页查询云会议室及个人会议ID 企业用户通过该接口查询个人已分配的云会议室及个人会议ID。
     *
     * @param SearchMemberVmrRequest 请求对象
     * @return SyncInvoker<SearchMemberVmrRequest, SearchMemberVmrResponse> */
    public SyncInvoker<SearchMemberVmrRequest, SearchMemberVmrResponse> searchMemberVmrInvoker(
        SearchMemberVmrRequest request) {
        return new SyncInvoker<SearchMemberVmrRequest, SearchMemberVmrResponse>(request, MeetingMeta.searchMemberVmr,
            hcClient);
    }

    /** 查询在线会议列表 管理员可以查询管理权限域内所有在线会议，普通用户仅能查询当前自己帐号管理的在线会议。不带查询参数时，默认查询权限范围内的在线会议，按开始时间升序排列。
     *
     * @param SearchOnlineMeetingsRequest 请求对象
     * @return SearchOnlineMeetingsResponse */
    public SearchOnlineMeetingsResponse searchOnlineMeetings(SearchOnlineMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchOnlineMeetings);
    }

    /** 查询在线会议列表 管理员可以查询管理权限域内所有在线会议，普通用户仅能查询当前自己帐号管理的在线会议。不带查询参数时，默认查询权限范围内的在线会议，按开始时间升序排列。
     *
     * @param SearchOnlineMeetingsRequest 请求对象
     * @return SyncInvoker<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> */
    public SyncInvoker<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> searchOnlineMeetingsInvoker(
        SearchOnlineMeetingsRequest request) {
        return new SyncInvoker<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse>(request,
            MeetingMeta.searchOnlineMeetings, hcClient);
    }

    /** 查询全球窗节目 获取全球窗节目
     *
     * @param SearchProgramsRequest 请求对象
     * @return SearchProgramsResponse */
    public SearchProgramsResponse searchPrograms(SearchProgramsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchPrograms);
    }

    /** 查询全球窗节目 获取全球窗节目
     *
     * @param SearchProgramsRequest 请求对象
     * @return SyncInvoker<SearchProgramsRequest, SearchProgramsResponse> */
    public SyncInvoker<SearchProgramsRequest, SearchProgramsResponse> searchProgramsInvoker(
        SearchProgramsRequest request) {
        return new SyncInvoker<SearchProgramsRequest, SearchProgramsResponse>(request, MeetingMeta.searchPrograms,
            hcClient);
    }

    /** 查询全球窗发布 获取全球窗发布
     *
     * @param SearchPublicationsRequest 请求对象
     * @return SearchPublicationsResponse */
    public SearchPublicationsResponse searchPublications(SearchPublicationsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchPublications);
    }

    /** 查询全球窗发布 获取全球窗发布
     *
     * @param SearchPublicationsRequest 请求对象
     * @return SyncInvoker<SearchPublicationsRequest, SearchPublicationsResponse> */
    public SyncInvoker<SearchPublicationsRequest, SearchPublicationsResponse> searchPublicationsInvoker(
        SearchPublicationsRequest request) {
        return new SyncInvoker<SearchPublicationsRequest, SearchPublicationsResponse>(request,
            MeetingMeta.searchPublications, hcClient);
    }

    /** 查询录制列表 管理员可以查询管理权限域内所有的录制，普通用户仅能查询当前帐号管理的录制。不带查询参数时，默认查询权限范围内的录制。
     *
     * @param SearchRecordingsRequest 请求对象
     * @return SearchRecordingsResponse */
    public SearchRecordingsResponse searchRecordings(SearchRecordingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchRecordings);
    }

    /** 查询录制列表 管理员可以查询管理权限域内所有的录制，普通用户仅能查询当前帐号管理的录制。不带查询参数时，默认查询权限范围内的录制。
     *
     * @param SearchRecordingsRequest 请求对象
     * @return SyncInvoker<SearchRecordingsRequest, SearchRecordingsResponse> */
    public SyncInvoker<SearchRecordingsRequest, SearchRecordingsResponse> searchRecordingsInvoker(
        SearchRecordingsRequest request) {
        return new SyncInvoker<SearchRecordingsRequest, SearchRecordingsResponse>(request, MeetingMeta.searchRecordings,
            hcClient);
    }

    /** SP管理员根据分页查询企业资源 SP根据条件查询企业的资源项
     *
     * @param SearchResourceRequest 请求对象
     * @return SearchResourceResponse */
    public SearchResourceResponse searchResource(SearchResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchResource);
    }

    /** SP管理员根据分页查询企业资源 SP根据条件查询企业的资源项
     *
     * @param SearchResourceRequest 请求对象
     * @return SyncInvoker<SearchResourceRequest, SearchResourceResponse> */
    public SyncInvoker<SearchResourceRequest, SearchResourceResponse> searchResourceInvoker(
        SearchResourceRequest request) {
        return new SyncInvoker<SearchResourceRequest, SearchResourceResponse>(request, MeetingMeta.searchResource,
            hcClient);
    }

    /** SP管理员根据分页查询企业资源操作记录 SP根据根据条件查询企业的资源操作记录，支持根据resourceId模糊搜索
     *
     * @param SearchResourceOpRecordRequest 请求对象
     * @return SearchResourceOpRecordResponse */
    public SearchResourceOpRecordResponse searchResourceOpRecord(SearchResourceOpRecordRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchResourceOpRecord);
    }

    /** SP管理员根据分页查询企业资源操作记录 SP根据根据条件查询企业的资源操作记录，支持根据resourceId模糊搜索
     *
     * @param SearchResourceOpRecordRequest 请求对象
     * @return SyncInvoker<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> */
    public SyncInvoker<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> searchResourceOpRecordInvoker(
        SearchResourceOpRecordRequest request) {
        return new SyncInvoker<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse>(request,
            MeetingMeta.searchResourceOpRecord, hcClient);
    }

    /** 分页查询用户 企业管理员通过该接口分页查询企业用户。
     *
     * @param SearchUsersRequest 请求对象
     * @return SearchUsersResponse */
    public SearchUsersResponse searchUsers(SearchUsersRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchUsers);
    }

    /** 分页查询用户 企业管理员通过该接口分页查询企业用户。
     *
     * @param SearchUsersRequest 请求对象
     * @return SyncInvoker<SearchUsersRequest, SearchUsersResponse> */
    public SyncInvoker<SearchUsersRequest, SearchUsersResponse> searchUsersInvoker(SearchUsersRequest request) {
        return new SyncInvoker<SearchUsersRequest, SearchUsersResponse>(request, MeetingMeta.searchUsers, hcClient);
    }

    /** 企业管理员分页查询激活码 企业管理员分页查询激活码，支持激活码、终端名称模糊查询。
     *
     * @param SearchVisionActiveCodeRequest 请求对象
     * @return SearchVisionActiveCodeResponse */
    public SearchVisionActiveCodeResponse searchVisionActiveCode(SearchVisionActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchVisionActiveCode);
    }

    /** 企业管理员分页查询激活码 企业管理员分页查询激活码，支持激活码、终端名称模糊查询。
     *
     * @param SearchVisionActiveCodeRequest 请求对象
     * @return SyncInvoker<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> */
    public SyncInvoker<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> searchVisionActiveCodeInvoker(
        SearchVisionActiveCodeRequest request) {
        return new SyncInvoker<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse>(request,
            MeetingMeta.searchVisionActiveCode, hcClient);
    }

    /** 发送滑块验证码 该接口提供发送滑块验证码。服务器收到请求，返回抠图以及抠图后的原图等结果。需要在前台界面显示出抠图以及抠图后的原图，用户通过滑块操作来匹配图形。
     *
     * @param SendSlideVerifyCodeRequest 请求对象
     * @return SendSlideVerifyCodeResponse */
    public SendSlideVerifyCodeResponse sendSlideVerifyCode(SendSlideVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendSlideVerifyCode);
    }

    /** 发送滑块验证码 该接口提供发送滑块验证码。服务器收到请求，返回抠图以及抠图后的原图等结果。需要在前台界面显示出抠图以及抠图后的原图，用户通过滑块操作来匹配图形。
     *
     * @param SendSlideVerifyCodeRequest 请求对象
     * @return SyncInvoker<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> */
    public SyncInvoker<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> sendSlideVerifyCodeInvoker(
        SendSlideVerifyCodeRequest request) {
        return new SyncInvoker<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse>(request,
            MeetingMeta.sendSlideVerifyCode, hcClient);
    }

    /** 发送验证码 该接口提供发送验证码，服务器收到请求，发送验证码到邮箱或者短信并返回结果。用户在前台界面通过滑块验证后，再进行发送验证码操作。
     *
     * @param SendVeriCodeForChangePwdRequest 请求对象
     * @return SendVeriCodeForChangePwdResponse */
    public SendVeriCodeForChangePwdResponse sendVeriCodeForChangePwd(SendVeriCodeForChangePwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendVeriCodeForChangePwd);
    }

    /** 发送验证码 该接口提供发送验证码，服务器收到请求，发送验证码到邮箱或者短信并返回结果。用户在前台界面通过滑块验证后，再进行发送验证码操作。
     *
     * @param SendVeriCodeForChangePwdRequest 请求对象
     * @return SyncInvoker<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> */
    public SyncInvoker<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> sendVeriCodeForChangePwdInvoker(
        SendVeriCodeForChangePwdRequest request) {
        return new SyncInvoker<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse>(request,
            MeetingMeta.sendVeriCodeForChangePwd, hcClient);
    }

    /** 获取验证码 获取验证码，向手机或邮箱发送，一分钟内只会发送一次。
     *
     * @param SendVeriCodeForUpdateUserInfoRequest 请求对象
     * @return SendVeriCodeForUpdateUserInfoResponse */
    public SendVeriCodeForUpdateUserInfoResponse sendVeriCodeForUpdateUserInfo(
        SendVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendVeriCodeForUpdateUserInfo);
    }

    /** 获取验证码 获取验证码，向手机或邮箱发送，一分钟内只会发送一次。
     *
     * @param SendVeriCodeForUpdateUserInfoRequest 请求对象
     * @return SyncInvoker<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> */
    public SyncInvoker<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> sendVeriCodeForUpdateUserInfoInvoker(
        SendVeriCodeForUpdateUserInfoRequest request) {
        return new SyncInvoker<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse>(request,
            MeetingMeta.sendVeriCodeForUpdateUserInfo, hcClient);
    }

    /** 设置自定义多画面 场景描述：会议管理员在confportal手动设置多画面 功能描述：提供给会议管理员手动设置多画面的功能
     *
     * @param SetCustomMultiPictureRequest 请求对象
     * @return SetCustomMultiPictureResponse */
    public SetCustomMultiPictureResponse setCustomMultiPicture(SetCustomMultiPictureRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setCustomMultiPicture);
    }

    /** 设置自定义多画面 场景描述：会议管理员在confportal手动设置多画面 功能描述：提供给会议管理员手动设置多画面的功能
     *
     * @param SetCustomMultiPictureRequest 请求对象
     * @return SyncInvoker<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> */
    public SyncInvoker<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> setCustomMultiPictureInvoker(
        SetCustomMultiPictureRequest request) {
        return new SyncInvoker<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse>(request,
            MeetingMeta.setCustomMultiPicture, hcClient);
    }

    /** 主持人选看 用于主持人轮询、主持人选看多画面、主持人选看会场操作。目前只适用于硬终端为主持人的场景。
     *
     * @param SetHostViewRequest 请求对象
     * @return SetHostViewResponse */
    public SetHostViewResponse setHostView(SetHostViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setHostView);
    }

    /** 主持人选看 用于主持人轮询、主持人选看多画面、主持人选看会场操作。目前只适用于硬终端为主持人的场景。
     *
     * @param SetHostViewRequest 请求对象
     * @return SyncInvoker<SetHostViewRequest, SetHostViewResponse> */
    public SyncInvoker<SetHostViewRequest, SetHostViewResponse> setHostViewInvoker(SetHostViewRequest request) {
        return new SyncInvoker<SetHostViewRequest, SetHostViewResponse>(request, MeetingMeta.setHostView, hcClient);
    }

    /** 设置多画面 设置会议多画面。
     *
     * @param SetMultiPictureRequest 请求对象
     * @return SetMultiPictureResponse */
    public SetMultiPictureResponse setMultiPicture(SetMultiPictureRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setMultiPicture);
    }

    /** 设置多画面 设置会议多画面。
     *
     * @param SetMultiPictureRequest 请求对象
     * @return SyncInvoker<SetMultiPictureRequest, SetMultiPictureResponse> */
    public SyncInvoker<SetMultiPictureRequest, SetMultiPictureResponse> setMultiPictureInvoker(
        SetMultiPictureRequest request) {
        return new SyncInvoker<SetMultiPictureRequest, SetMultiPictureResponse>(request, MeetingMeta.setMultiPicture,
            hcClient);
    }

    /** 会场选看 目前只适用于硬终端选看其他会场人的场景。
     *
     * @param SetParticipantViewRequest 请求对象
     * @return SetParticipantViewResponse */
    public SetParticipantViewResponse setParticipantView(SetParticipantViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setParticipantView);
    }

    /** 会场选看 目前只适用于硬终端选看其他会场人的场景。
     *
     * @param SetParticipantViewRequest 请求对象
     * @return SyncInvoker<SetParticipantViewRequest, SetParticipantViewResponse> */
    public SyncInvoker<SetParticipantViewRequest, SetParticipantViewResponse> setParticipantViewInvoker(
        SetParticipantViewRequest request) {
        return new SyncInvoker<SetParticipantViewRequest, SetParticipantViewResponse>(request,
            MeetingMeta.setParticipantView, hcClient);
    }

    /** 申请主持人 申请或释放主持人。普通用户可申请主持人，主持人可释放主持人权限。
     *
     * @param SetRoleRequest 请求对象
     * @return SetRoleResponse */
    public SetRoleResponse setRole(SetRoleRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setRole);
    }

    /** 申请主持人 申请或释放主持人。普通用户可申请主持人，主持人可释放主持人权限。
     *
     * @param SetRoleRequest 请求对象
     * @return SyncInvoker<SetRoleRequest, SetRoleResponse> */
    public SyncInvoker<SetRoleRequest, SetRoleResponse> setRoleInvoker(SetRoleRequest request) {
        return new SyncInvoker<SetRoleRequest, SetRoleResponse>(request, MeetingMeta.setRole, hcClient);
    }

    /** 通过会议ID查询企业ID 与某个会议在同一个SP下的用户，可以通过会议ID查询到该会议对应的企业ID。
     *
     * @param ShowConfOrgRequest 请求对象
     * @return ShowConfOrgResponse */
    public ShowConfOrgResponse showConfOrg(ShowConfOrgRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showConfOrg);
    }

    /** 通过会议ID查询企业ID 与某个会议在同一个SP下的用户，可以通过会议ID查询到该会议对应的企业ID。
     *
     * @param ShowConfOrgRequest 请求对象
     * @return SyncInvoker<ShowConfOrgRequest, ShowConfOrgResponse> */
    public SyncInvoker<ShowConfOrgRequest, ShowConfOrgResponse> showConfOrgInvoker(ShowConfOrgRequest request) {
        return new SyncInvoker<ShowConfOrgRequest, ShowConfOrgResponse>(request, MeetingMeta.showConfOrg, hcClient);
    }

    /** SP管理员查询企业 获取企业
     *
     * @param ShowCorpRequest 请求对象
     * @return ShowCorpResponse */
    public ShowCorpResponse showCorp(ShowCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorp);
    }

    /** SP管理员查询企业 获取企业
     *
     * @param ShowCorpRequest 请求对象
     * @return SyncInvoker<ShowCorpRequest, ShowCorpResponse> */
    public SyncInvoker<ShowCorpRequest, ShowCorpResponse> showCorpInvoker(ShowCorpRequest request) {
        return new SyncInvoker<ShowCorpRequest, ShowCorpResponse>(request, MeetingMeta.showCorp, hcClient);
    }

    /** 查询企业管理员 通过该接口查询企业管理员。
     *
     * @param ShowCorpAdminRequest 请求对象
     * @return ShowCorpAdminResponse */
    public ShowCorpAdminResponse showCorpAdmin(ShowCorpAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpAdmin);
    }

    /** 查询企业管理员 通过该接口查询企业管理员。
     *
     * @param ShowCorpAdminRequest 请求对象
     * @return SyncInvoker<ShowCorpAdminRequest, ShowCorpAdminResponse> */
    public SyncInvoker<ShowCorpAdminRequest, ShowCorpAdminResponse> showCorpAdminInvoker(ShowCorpAdminRequest request) {
        return new SyncInvoker<ShowCorpAdminRequest, ShowCorpAdminResponse>(request, MeetingMeta.showCorpAdmin,
            hcClient);
    }

    /** 企业管理员查询企业注册信息 企业管理员通过该接口查询企业注册信息。
     *
     * @param ShowCorpBasicInfoRequest 请求对象
     * @return ShowCorpBasicInfoResponse */
    public ShowCorpBasicInfoResponse showCorpBasicInfo(ShowCorpBasicInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpBasicInfo);
    }

    /** 企业管理员查询企业注册信息 企业管理员通过该接口查询企业注册信息。
     *
     * @param ShowCorpBasicInfoRequest 请求对象
     * @return SyncInvoker<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> */
    public SyncInvoker<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> showCorpBasicInfoInvoker(
        ShowCorpBasicInfoRequest request) {
        return new SyncInvoker<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse>(request,
            MeetingMeta.showCorpBasicInfo, hcClient);
    }

    /** 企业管理员查询企业内资源及业务权限 企业管理员通过该接口查询企业内资源及业务权限，包括查询已使用的资源情况。
     *
     * @param ShowCorpResourceRequest 请求对象
     * @return ShowCorpResourceResponse */
    public ShowCorpResourceResponse showCorpResource(ShowCorpResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpResource);
    }

    /** 企业管理员查询企业内资源及业务权限 企业管理员通过该接口查询企业内资源及业务权限，包括查询已使用的资源情况。
     *
     * @param ShowCorpResourceRequest 请求对象
     * @return SyncInvoker<ShowCorpResourceRequest, ShowCorpResourceResponse> */
    public SyncInvoker<ShowCorpResourceRequest, ShowCorpResourceResponse> showCorpResourceInvoker(
        ShowCorpResourceRequest request) {
        return new SyncInvoker<ShowCorpResourceRequest, ShowCorpResourceResponse>(request, MeetingMeta.showCorpResource,
            hcClient);
    }

    /** 查询部门及其一级子部门列表 企业管理员通过该接口查询部门及其一级子部门列表。
     *
     * @param ShowDeptAndChildDeptRequest 请求对象
     * @return ShowDeptAndChildDeptResponse */
    public ShowDeptAndChildDeptResponse showDeptAndChildDept(ShowDeptAndChildDeptRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeptAndChildDept);
    }

    /** 查询部门及其一级子部门列表 企业管理员通过该接口查询部门及其一级子部门列表。
     *
     * @param ShowDeptAndChildDeptRequest 请求对象
     * @return SyncInvoker<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> */
    public SyncInvoker<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> showDeptAndChildDeptInvoker(
        ShowDeptAndChildDeptRequest request) {
        return new SyncInvoker<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse>(request,
            MeetingMeta.showDeptAndChildDept, hcClient);
    }

    /** 查询终端详情 企业管理员通过该接口查询终端详情。
     *
     * @param ShowDeviceDetailRequest 请求对象
     * @return ShowDeviceDetailResponse */
    public ShowDeviceDetailResponse showDeviceDetail(ShowDeviceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceDetail);
    }

    /** 查询终端详情 企业管理员通过该接口查询终端详情。
     *
     * @param ShowDeviceDetailRequest 请求对象
     * @return SyncInvoker<ShowDeviceDetailRequest, ShowDeviceDetailResponse> */
    public SyncInvoker<ShowDeviceDetailRequest, ShowDeviceDetailResponse> showDeviceDetailInvoker(
        ShowDeviceDetailRequest request) {
        return new SyncInvoker<ShowDeviceDetailRequest, ShowDeviceDetailResponse>(request, MeetingMeta.showDeviceDetail,
            hcClient);
    }

    /** 查询设备状态 调用本接口可以查询硬终端的状态。 硬终端与发起查询请求的帐号需在同一企业下，否则会鉴权失败。
     *
     * @param ShowDeviceStatusRequest 请求对象
     * @return ShowDeviceStatusResponse */
    public ShowDeviceStatusResponse showDeviceStatus(ShowDeviceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceStatus);
    }

    /** 查询设备状态 调用本接口可以查询硬终端的状态。 硬终端与发起查询请求的帐号需在同一企业下，否则会鉴权失败。
     *
     * @param ShowDeviceStatusRequest 请求对象
     * @return SyncInvoker<ShowDeviceStatusRequest, ShowDeviceStatusResponse> */
    public SyncInvoker<ShowDeviceStatusRequest, ShowDeviceStatusResponse> showDeviceStatusInvoker(
        ShowDeviceStatusRequest request) {
        return new SyncInvoker<ShowDeviceStatusRequest, ShowDeviceStatusResponse>(request, MeetingMeta.showDeviceStatus,
            hcClient);
    }

    /** 获取所有终端类型 企业管理员通过该接口获取所有的终端类型。
     *
     * @param ShowDeviceTypesRequest 请求对象
     * @return ShowDeviceTypesResponse */
    public ShowDeviceTypesResponse showDeviceTypes(ShowDeviceTypesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceTypes);
    }

    /** 获取所有终端类型 企业管理员通过该接口获取所有的终端类型。
     *
     * @param ShowDeviceTypesRequest 请求对象
     * @return SyncInvoker<ShowDeviceTypesRequest, ShowDeviceTypesResponse> */
    public SyncInvoker<ShowDeviceTypesRequest, ShowDeviceTypesResponse> showDeviceTypesInvoker(
        ShowDeviceTypesRequest request) {
        return new SyncInvoker<ShowDeviceTypesRequest, ShowDeviceTypesResponse>(request, MeetingMeta.showDeviceTypes,
            hcClient);
    }

    /** 查询历史会议详情 管理员可以查询管理权限域内所有的历史会议详情，普通用户仅能查询当前帐号管理的历史会议详情。
     *
     * @param ShowHisMeetingDetailRequest 请求对象
     * @return ShowHisMeetingDetailResponse */
    public ShowHisMeetingDetailResponse showHisMeetingDetail(ShowHisMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showHisMeetingDetail);
    }

    /** 查询历史会议详情 管理员可以查询管理权限域内所有的历史会议详情，普通用户仅能查询当前帐号管理的历史会议详情。
     *
     * @param ShowHisMeetingDetailRequest 请求对象
     * @return SyncInvoker<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> */
    public SyncInvoker<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> showHisMeetingDetailInvoker(
        ShowHisMeetingDetailRequest request) {
        return new SyncInvoker<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse>(request,
            MeetingMeta.showHisMeetingDetail, hcClient);
    }

    /** 查询会议详情 管理员可以查询管理权限域内所有会议的详情，普通用户仅能查询当前帐号管理的会议详情。
     *
     * @param ShowMeetingDetailRequest 请求对象
     * @return ShowMeetingDetailResponse */
    public ShowMeetingDetailResponse showMeetingDetail(ShowMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMeetingDetail);
    }

    /** 查询会议详情 管理员可以查询管理权限域内所有会议的详情，普通用户仅能查询当前帐号管理的会议详情。
     *
     * @param ShowMeetingDetailRequest 请求对象
     * @return SyncInvoker<ShowMeetingDetailRequest, ShowMeetingDetailResponse> */
    public SyncInvoker<ShowMeetingDetailRequest, ShowMeetingDetailResponse> showMeetingDetailInvoker(
        ShowMeetingDetailRequest request) {
        return new SyncInvoker<ShowMeetingDetailRequest, ShowMeetingDetailResponse>(request,
            MeetingMeta.showMeetingDetail, hcClient);
    }

    /** 查询会议纪要详情 用户查询单个会议纪要详情（主要目的是为了得到外链）。 IdeaHub是使用fileCode来查，所以终端保持一致。
     *
     * @param ShowMeetingFileRequest 请求对象
     * @return ShowMeetingFileResponse */
    public ShowMeetingFileResponse showMeetingFile(ShowMeetingFileRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMeetingFile);
    }

    /** 查询会议纪要详情 用户查询单个会议纪要详情（主要目的是为了得到外链）。 IdeaHub是使用fileCode来查，所以终端保持一致。
     *
     * @param ShowMeetingFileRequest 请求对象
     * @return SyncInvoker<ShowMeetingFileRequest, ShowMeetingFileResponse> */
    public SyncInvoker<ShowMeetingFileRequest, ShowMeetingFileResponse> showMeetingFileInvoker(
        ShowMeetingFileRequest request) {
        return new SyncInvoker<ShowMeetingFileRequest, ShowMeetingFileResponse>(request, MeetingMeta.showMeetingFile,
            hcClient);
    }

    /** 打开会议纪要文件列表 用户使用手机扫码后，手机端请求服务端，让服务端通知指定IdeaHub打开指定用户的会议纪要文件列表。二维码内容
     * cloudlink://cloudlink.huawei.com/h5page?action&#x3D;OPEN_MEETING_FILE_LIST&amp;key1&#x3D;value1&amp;key2&#x3D;value2
     * key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     *
     * @param ShowMeetingFileListRequest 请求对象
     * @return ShowMeetingFileListResponse */
    public ShowMeetingFileListResponse showMeetingFileList(ShowMeetingFileListRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMeetingFileList);
    }

    /** 打开会议纪要文件列表 用户使用手机扫码后，手机端请求服务端，让服务端通知指定IdeaHub打开指定用户的会议纪要文件列表。二维码内容
     * cloudlink://cloudlink.huawei.com/h5page?action&#x3D;OPEN_MEETING_FILE_LIST&amp;key1&#x3D;value1&amp;key2&#x3D;value2
     * key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     *
     * @param ShowMeetingFileListRequest 请求对象
     * @return SyncInvoker<ShowMeetingFileListRequest, ShowMeetingFileListResponse> */
    public SyncInvoker<ShowMeetingFileListRequest, ShowMeetingFileListResponse> showMeetingFileListInvoker(
        ShowMeetingFileListRequest request) {
        return new SyncInvoker<ShowMeetingFileListRequest, ShowMeetingFileListResponse>(request,
            MeetingMeta.showMeetingFileList, hcClient);
    }

    /** 用户查询自己的信息 企业用户通过该接口查询自己的信息。
     *
     * @param ShowMyInfoRequest 请求对象
     * @return ShowMyInfoResponse */
    public ShowMyInfoResponse showMyInfo(ShowMyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMyInfo);
    }

    /** 用户查询自己的信息 企业用户通过该接口查询自己的信息。
     *
     * @param ShowMyInfoRequest 请求对象
     * @return SyncInvoker<ShowMyInfoRequest, ShowMyInfoResponse> */
    public SyncInvoker<ShowMyInfoRequest, ShowMyInfoResponse> showMyInfoInvoker(ShowMyInfoRequest request) {
        return new SyncInvoker<ShowMyInfoRequest, ShowMyInfoResponse>(request, MeetingMeta.showMyInfo, hcClient);
    }

    /** 查询在线会议详情 管理员可以查询管理权限域内所有的在线会议详情，普通用户仅能查询当前自己的帐号管理的在线会议详情。
     *
     * @param ShowOnlineMeetingDetailRequest 请求对象
     * @return ShowOnlineMeetingDetailResponse */
    public ShowOnlineMeetingDetailResponse showOnlineMeetingDetail(ShowOnlineMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showOnlineMeetingDetail);
    }

    /** 查询在线会议详情 管理员可以查询管理权限域内所有的在线会议详情，普通用户仅能查询当前自己的帐号管理的在线会议详情。
     *
     * @param ShowOnlineMeetingDetailRequest 请求对象
     * @return SyncInvoker<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> */
    public SyncInvoker<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> showOnlineMeetingDetailInvoker(
        ShowOnlineMeetingDetailRequest request) {
        return new SyncInvoker<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse>(request,
            MeetingMeta.showOnlineMeetingDetail, hcClient);
    }

    /** 查询企业的资源使用信息 企业管理员查询资源使用信息
     *
     * @param ShowOrgResRequest 请求对象
     * @return ShowOrgResResponse */
    public ShowOrgResResponse showOrgRes(ShowOrgResRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showOrgRes);
    }

    /** 查询企业的资源使用信息 企业管理员查询资源使用信息
     *
     * @param ShowOrgResRequest 请求对象
     * @return SyncInvoker<ShowOrgResRequest, ShowOrgResResponse> */
    public SyncInvoker<ShowOrgResRequest, ShowOrgResResponse> showOrgResInvoker(ShowOrgResRequest request) {
        return new SyncInvoker<ShowOrgResRequest, ShowOrgResResponse>(request, MeetingMeta.showOrgRes, hcClient);
    }

    /** 根据ID查询节目详情 根据ID获取节目详情
     *
     * @param ShowProgramRequest 请求对象
     * @return ShowProgramResponse */
    public ShowProgramResponse showProgram(ShowProgramRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showProgram);
    }

    /** 根据ID查询节目详情 根据ID获取节目详情
     *
     * @param ShowProgramRequest 请求对象
     * @return SyncInvoker<ShowProgramRequest, ShowProgramResponse> */
    public SyncInvoker<ShowProgramRequest, ShowProgramResponse> showProgramInvoker(ShowProgramRequest request) {
        return new SyncInvoker<ShowProgramRequest, ShowProgramResponse>(request, MeetingMeta.showProgram, hcClient);
    }

    /** 根据ID查询全球窗发布详情 根据ID获取发布详情
     *
     * @param ShowPublicationRequest 请求对象
     * @return ShowPublicationResponse */
    public ShowPublicationResponse showPublication(ShowPublicationRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showPublication);
    }

    /** 根据ID查询全球窗发布详情 根据ID获取发布详情
     *
     * @param ShowPublicationRequest 请求对象
     * @return SyncInvoker<ShowPublicationRequest, ShowPublicationResponse> */
    public SyncInvoker<ShowPublicationRequest, ShowPublicationResponse> showPublicationInvoker(
        ShowPublicationRequest request) {
        return new SyncInvoker<ShowPublicationRequest, ShowPublicationResponse>(request, MeetingMeta.showPublication,
            hcClient);
    }

    /** 查询会议实时信息 查询会议实时信息
     *
     * @param ShowRealTimeInfoOfMeetingRequest 请求对象
     * @return ShowRealTimeInfoOfMeetingResponse */
    public ShowRealTimeInfoOfMeetingResponse showRealTimeInfoOfMeeting(ShowRealTimeInfoOfMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRealTimeInfoOfMeeting);
    }

    /** 查询会议实时信息 查询会议实时信息
     *
     * @param ShowRealTimeInfoOfMeetingRequest 请求对象
     * @return SyncInvoker<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> */
    public SyncInvoker<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> showRealTimeInfoOfMeetingInvoker(
        ShowRealTimeInfoOfMeetingRequest request) {
        return new SyncInvoker<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse>(request,
            MeetingMeta.showRealTimeInfoOfMeeting, hcClient);
    }

    /** 查询录制详情 查询某个录制详情。
     *
     * @param ShowRecordingDetailRequest 请求对象
     * @return ShowRecordingDetailResponse */
    public ShowRecordingDetailResponse showRecordingDetail(ShowRecordingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRecordingDetail);
    }

    /** 查询录制详情 查询某个录制详情。
     *
     * @param ShowRecordingDetailRequest 请求对象
     * @return SyncInvoker<ShowRecordingDetailRequest, ShowRecordingDetailResponse> */
    public SyncInvoker<ShowRecordingDetailRequest, ShowRecordingDetailResponse> showRecordingDetailInvoker(
        ShowRecordingDetailRequest request) {
        return new SyncInvoker<ShowRecordingDetailRequest, ShowRecordingDetailResponse>(request,
            MeetingMeta.showRecordingDetail, hcClient);
    }

    /** 查询录制文件下载链接 查询某个录制文件下载链接。
     *
     * @param ShowRecordingFileDownloadUrlsRequest 请求对象
     * @return ShowRecordingFileDownloadUrlsResponse */
    public ShowRecordingFileDownloadUrlsResponse showRecordingFileDownloadUrls(
        ShowRecordingFileDownloadUrlsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRecordingFileDownloadUrls);
    }

    /** 查询录制文件下载链接 查询某个录制文件下载链接。
     *
     * @param ShowRecordingFileDownloadUrlsRequest 请求对象
     * @return SyncInvoker<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> */
    public SyncInvoker<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> showRecordingFileDownloadUrlsInvoker(
        ShowRecordingFileDownloadUrlsRequest request) {
        return new SyncInvoker<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse>(request,
            MeetingMeta.showRecordingFileDownloadUrls, hcClient);
    }

    /** 查询会议所在区域信息 查询会议所在区域信息，如果会议不存在或者会议未召开，返回对应的错误码。
     *
     * @param ShowRegionInfoOfMeetingRequest 请求对象
     * @return ShowRegionInfoOfMeetingResponse */
    public ShowRegionInfoOfMeetingResponse showRegionInfoOfMeeting(ShowRegionInfoOfMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRegionInfoOfMeeting);
    }

    /** 查询会议所在区域信息 查询会议所在区域信息，如果会议不存在或者会议未召开，返回对应的错误码。
     *
     * @param ShowRegionInfoOfMeetingRequest 请求对象
     * @return SyncInvoker<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> */
    public SyncInvoker<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> showRegionInfoOfMeetingInvoker(
        ShowRegionInfoOfMeetingRequest request) {
        return new SyncInvoker<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse>(request,
            MeetingMeta.showRegionInfoOfMeeting, hcClient);
    }

    /** 查询直播间高级设置 查询直播间高级设置
     *
     * @param ShowRoomSettingRequest 请求对象
     * @return ShowRoomSettingResponse */
    public ShowRoomSettingResponse showRoomSetting(ShowRoomSettingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRoomSetting);
    }

    /** 查询直播间高级设置 查询直播间高级设置
     *
     * @param ShowRoomSettingRequest 请求对象
     * @return SyncInvoker<ShowRoomSettingRequest, ShowRoomSettingResponse> */
    public SyncInvoker<ShowRoomSettingRequest, ShowRoomSettingResponse> showRoomSettingInvoker(
        ShowRoomSettingRequest request) {
        return new SyncInvoker<ShowRoomSettingRequest, ShowRoomSettingResponse>(request, MeetingMeta.showRoomSetting,
            hcClient);
    }

    /** 查询SP的共享资源使用信息 SP管理查询所属SP的共享资源使用信息
     *
     * @param ShowSpResRequest 请求对象
     * @return ShowSpResResponse */
    public ShowSpResResponse showSpRes(ShowSpResRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showSpRes);
    }

    /** 查询SP的共享资源使用信息 SP管理查询所属SP的共享资源使用信息
     *
     * @param ShowSpResRequest 请求对象
     * @return SyncInvoker<ShowSpResRequest, ShowSpResResponse> */
    public SyncInvoker<ShowSpResRequest, ShowSpResResponse> showSpResInvoker(ShowSpResRequest request) {
        return new SyncInvoker<ShowSpResRequest, ShowSpResResponse>(request, MeetingMeta.showSpRes, hcClient);
    }

    /** SP管理员查询资源信息 SP管理员查询SP的所有资源，包括已使用的资源
     *
     * @param ShowSpResourceRequest 请求对象
     * @return ShowSpResourceResponse */
    public ShowSpResourceResponse showSpResource(ShowSpResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showSpResource);
    }

    /** SP管理员查询资源信息 SP管理员查询SP的所有资源，包括已使用的资源
     *
     * @param ShowSpResourceRequest 请求对象
     * @return SyncInvoker<ShowSpResourceRequest, ShowSpResourceResponse> */
    public SyncInvoker<ShowSpResourceRequest, ShowSpResourceResponse> showSpResourceInvoker(
        ShowSpResourceRequest request) {
        return new SyncInvoker<ShowSpResourceRequest, ShowSpResourceResponse>(request, MeetingMeta.showSpResource,
            hcClient);
    }

    /** 查询用户详情 企业管理员通过该接口查询企业用户详情
     *
     * @param ShowUserDetailRequest 请求对象
     * @return ShowUserDetailResponse */
    public ShowUserDetailResponse showUserDetail(ShowUserDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showUserDetail);
    }

    /** 查询用户详情 企业管理员通过该接口查询企业用户详情
     *
     * @param ShowUserDetailRequest 请求对象
     * @return SyncInvoker<ShowUserDetailRequest, ShowUserDetailResponse> */
    public SyncInvoker<ShowUserDetailRequest, ShowUserDetailResponse> showUserDetailInvoker(
        ShowUserDetailRequest request) {
        return new SyncInvoker<ShowUserDetailRequest, ShowUserDetailResponse>(request, MeetingMeta.showUserDetail,
            hcClient);
    }

    /** 查询网络研讨会详情 根据conference_id查询网络研讨会详情。
     *
     * @param ShowWebinarRequest 请求对象
     * @return ShowWebinarResponse */
    public ShowWebinarResponse showWebinar(ShowWebinarRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showWebinar);
    }

    /** 查询网络研讨会详情 根据conference_id查询网络研讨会详情。
     *
     * @param ShowWebinarRequest 请求对象
     * @return SyncInvoker<ShowWebinarRequest, ShowWebinarResponse> */
    public SyncInvoker<ShowWebinarRequest, ShowWebinarResponse> showWebinarInvoker(ShowWebinarRequest request) {
        return new SyncInvoker<ShowWebinarRequest, ShowWebinarResponse>(request, MeetingMeta.showWebinar, hcClient);
    }

    /** 结束会议 结束会议。
     *
     * @param StopMeetingRequest 请求对象
     * @return StopMeetingResponse */
    public StopMeetingResponse stopMeeting(StopMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.stopMeeting);
    }

    /** 结束会议 结束会议。
     *
     * @param StopMeetingRequest 请求对象
     * @return SyncInvoker<StopMeetingRequest, StopMeetingResponse> */
    public SyncInvoker<StopMeetingRequest, StopMeetingResponse> stopMeetingInvoker(StopMeetingRequest request) {
        return new SyncInvoker<StopMeetingRequest, StopMeetingResponse>(request, MeetingMeta.stopMeeting, hcClient);
    }

    /** 切换视频显示策略 切换视频显示策略
     *
     * @param SwitchModeRequest 请求对象
     * @return SwitchModeResponse */
    public SwitchModeResponse switchMode(SwitchModeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.switchMode);
    }

    /** 切换视频显示策略 切换视频显示策略
     *
     * @param SwitchModeRequest 请求对象
     * @return SyncInvoker<SwitchModeRequest, SwitchModeResponse> */
    public SyncInvoker<SwitchModeRequest, SwitchModeResponse> switchModeInvoker(SwitchModeRequest request) {
        return new SyncInvoker<SwitchModeRequest, SwitchModeResponse>(request, MeetingMeta.switchMode, hcClient);
    }

    /** 修改手机或邮箱 企业用户通过该接口修改手机或邮箱，需要先获取验证码，验证多次失败会禁止修改。
     *
     * @param UpdateContactRequest 请求对象
     * @return UpdateContactResponse */
    public UpdateContactResponse updateContact(UpdateContactRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateContact);
    }

    /** 修改手机或邮箱 企业用户通过该接口修改手机或邮箱，需要先获取验证码，验证多次失败会禁止修改。
     *
     * @param UpdateContactRequest 请求对象
     * @return SyncInvoker<UpdateContactRequest, UpdateContactResponse> */
    public SyncInvoker<UpdateContactRequest, UpdateContactResponse> updateContactInvoker(UpdateContactRequest request) {
        return new SyncInvoker<UpdateContactRequest, UpdateContactResponse>(request, MeetingMeta.updateContact,
            hcClient);
    }

    /** SP管理员修改企业 修改企业，若任一参数为null或者不携带则不修改
     *
     * @param UpdateCorpRequest 请求对象
     * @return UpdateCorpResponse */
    public UpdateCorpResponse updateCorp(UpdateCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateCorp);
    }

    /** SP管理员修改企业 修改企业，若任一参数为null或者不携带则不修改
     *
     * @param UpdateCorpRequest 请求对象
     * @return SyncInvoker<UpdateCorpRequest, UpdateCorpResponse> */
    public SyncInvoker<UpdateCorpRequest, UpdateCorpResponse> updateCorpInvoker(UpdateCorpRequest request) {
        return new SyncInvoker<UpdateCorpRequest, UpdateCorpResponse>(request, MeetingMeta.updateCorp, hcClient);
    }

    /** 企业管理员修改企业注册信息 企业管理员通过该接口修改企业注册信息。当前只支持修改地址。
     *
     * @param UpdateCorpBasicInfoRequest 请求对象
     * @return UpdateCorpBasicInfoResponse */
    public UpdateCorpBasicInfoResponse updateCorpBasicInfo(UpdateCorpBasicInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateCorpBasicInfo);
    }

    /** 企业管理员修改企业注册信息 企业管理员通过该接口修改企业注册信息。当前只支持修改地址。
     *
     * @param UpdateCorpBasicInfoRequest 请求对象
     * @return SyncInvoker<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> */
    public SyncInvoker<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> updateCorpBasicInfoInvoker(
        UpdateCorpBasicInfoRequest request) {
        return new SyncInvoker<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse>(request,
            MeetingMeta.updateCorpBasicInfo, hcClient);
    }

    /** 修改部门 企业管理员通过该接口修改部门。
     *
     * @param UpdateDepartmentRequest 请求对象
     * @return UpdateDepartmentResponse */
    public UpdateDepartmentResponse updateDepartment(UpdateDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateDepartment);
    }

    /** 修改部门 企业管理员通过该接口修改部门。
     *
     * @param UpdateDepartmentRequest 请求对象
     * @return SyncInvoker<UpdateDepartmentRequest, UpdateDepartmentResponse> */
    public SyncInvoker<UpdateDepartmentRequest, UpdateDepartmentResponse> updateDepartmentInvoker(
        UpdateDepartmentRequest request) {
        return new SyncInvoker<UpdateDepartmentRequest, UpdateDepartmentResponse>(request, MeetingMeta.updateDepartment,
            hcClient);
    }

    /** 修改终端 企业管理员通过该接口修改终端。
     *
     * @param UpdateDeviceRequest 请求对象
     * @return UpdateDeviceResponse */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateDevice);
    }

    /** 修改终端 企业管理员通过该接口修改终端。
     *
     * @param UpdateDeviceRequest 请求对象
     * @return SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> */
    public SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceInvoker(UpdateDeviceRequest request) {
        return new SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>(request, MeetingMeta.updateDevice, hcClient);
    }

    /** 更新全球窗素材 更新全球窗素材
     *
     * @param UpdateMaterialRequest 请求对象
     * @return UpdateMaterialResponse */
    public UpdateMaterialResponse updateMaterial(UpdateMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMaterial);
    }

    /** 更新全球窗素材 更新全球窗素材
     *
     * @param UpdateMaterialRequest 请求对象
     * @return SyncInvoker<UpdateMaterialRequest, UpdateMaterialResponse> */
    public SyncInvoker<UpdateMaterialRequest, UpdateMaterialResponse> updateMaterialInvoker(
        UpdateMaterialRequest request) {
        return new SyncInvoker<UpdateMaterialRequest, UpdateMaterialResponse>(request, MeetingMeta.updateMaterial,
            hcClient);
    }

    /** 编辑预约会议 编辑预约会议。会议开始后，不能被编辑。
     *
     * @param UpdateMeetingRequest 请求对象
     * @return UpdateMeetingResponse */
    public UpdateMeetingResponse updateMeeting(UpdateMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMeeting);
    }

    /** 编辑预约会议 编辑预约会议。会议开始后，不能被编辑。
     *
     * @param UpdateMeetingRequest 请求对象
     * @return SyncInvoker<UpdateMeetingRequest, UpdateMeetingResponse> */
    public SyncInvoker<UpdateMeetingRequest, UpdateMeetingResponse> updateMeetingInvoker(UpdateMeetingRequest request) {
        return new SyncInvoker<UpdateMeetingRequest, UpdateMeetingResponse>(request, MeetingMeta.updateMeeting,
            hcClient);
    }

    /** 修改用会议室及个人会议ID信息 企业用户登录后可以修改分配给用户的云会议室及个人会议ID。
     *
     * @param UpdateMemberVmrRequest 请求对象
     * @return UpdateMemberVmrResponse */
    public UpdateMemberVmrResponse updateMemberVmr(UpdateMemberVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMemberVmr);
    }

    /** 修改用会议室及个人会议ID信息 企业用户登录后可以修改分配给用户的云会议室及个人会议ID。
     *
     * @param UpdateMemberVmrRequest 请求对象
     * @return SyncInvoker<UpdateMemberVmrRequest, UpdateMemberVmrResponse> */
    public SyncInvoker<UpdateMemberVmrRequest, UpdateMemberVmrResponse> updateMemberVmrInvoker(
        UpdateMemberVmrRequest request) {
        return new SyncInvoker<UpdateMemberVmrRequest, UpdateMemberVmrResponse>(request, MeetingMeta.updateMemberVmr,
            hcClient);
    }

    /** 用户修改自己的信息 企业用户通过该接口修改自己的信息。
     *
     * @param UpdateMyInfoRequest 请求对象
     * @return UpdateMyInfoResponse */
    public UpdateMyInfoResponse updateMyInfo(UpdateMyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMyInfo);
    }

    /** 用户修改自己的信息 企业用户通过该接口修改自己的信息。
     *
     * @param UpdateMyInfoRequest 请求对象
     * @return SyncInvoker<UpdateMyInfoRequest, UpdateMyInfoResponse> */
    public SyncInvoker<UpdateMyInfoRequest, UpdateMyInfoResponse> updateMyInfoInvoker(UpdateMyInfoRequest request) {
        return new SyncInvoker<UpdateMyInfoRequest, UpdateMyInfoResponse>(request, MeetingMeta.updateMyInfo, hcClient);
    }

    /** 更新全球窗节目 更新全球窗节目
     *
     * @param UpdateProgramRequest 请求对象
     * @return UpdateProgramResponse */
    public UpdateProgramResponse updateProgram(UpdateProgramRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateProgram);
    }

    /** 更新全球窗节目 更新全球窗节目
     *
     * @param UpdateProgramRequest 请求对象
     * @return SyncInvoker<UpdateProgramRequest, UpdateProgramResponse> */
    public SyncInvoker<UpdateProgramRequest, UpdateProgramResponse> updateProgramInvoker(UpdateProgramRequest request) {
        return new SyncInvoker<UpdateProgramRequest, UpdateProgramResponse>(request, MeetingMeta.updateProgram,
            hcClient);
    }

    /** 修改全球窗发布 修改全球窗发布
     *
     * @param UpdatePublicationRequest 请求对象
     * @return UpdatePublicationResponse */
    public UpdatePublicationResponse updatePublication(UpdatePublicationRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updatePublication);
    }

    /** 修改全球窗发布 修改全球窗发布
     *
     * @param UpdatePublicationRequest 请求对象
     * @return SyncInvoker<UpdatePublicationRequest, UpdatePublicationResponse> */
    public SyncInvoker<UpdatePublicationRequest, UpdatePublicationResponse> updatePublicationInvoker(
        UpdatePublicationRequest request) {
        return new SyncInvoker<UpdatePublicationRequest, UpdatePublicationResponse>(request,
            MeetingMeta.updatePublication, hcClient);
    }

    /** 修改密码 企业成员通过该接口提供用户修改密码功能，服务器收到请求，修改用户密码并返回结果。
     *
     * @param UpdatePwdRequest 请求对象
     * @return UpdatePwdResponse */
    public UpdatePwdResponse updatePwd(UpdatePwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updatePwd);
    }

    /** 修改密码 企业成员通过该接口提供用户修改密码功能，服务器收到请求，修改用户密码并返回结果。
     *
     * @param UpdatePwdRequest 请求对象
     * @return SyncInvoker<UpdatePwdRequest, UpdatePwdResponse> */
    public SyncInvoker<UpdatePwdRequest, UpdatePwdResponse> updatePwdInvoker(UpdatePwdRequest request) {
        return new SyncInvoker<UpdatePwdRequest, UpdatePwdResponse>(request, MeetingMeta.updatePwd, hcClient);
    }

    /** 修改预定周期会议 修改预定的周期会议；会议开始时，不能修改会议
     *
     * @param UpdateRecurringMeetingRequest 请求对象
     * @return UpdateRecurringMeetingResponse */
    public UpdateRecurringMeetingResponse updateRecurringMeeting(UpdateRecurringMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateRecurringMeeting);
    }

    /** 修改预定周期会议 修改预定的周期会议；会议开始时，不能修改会议
     *
     * @param UpdateRecurringMeetingRequest 请求对象
     * @return SyncInvoker<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse> */
    public SyncInvoker<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse> updateRecurringMeetingInvoker(
        UpdateRecurringMeetingRequest request) {
        return new SyncInvoker<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse>(request,
            MeetingMeta.updateRecurringMeeting, hcClient);
    }

    /** 修改预定周期子会议 修改预定的周期子会议；会议开始时，不能修改会议
     *
     * @param UpdateRecurringSubMeetingRequest 请求对象
     * @return UpdateRecurringSubMeetingResponse */
    public UpdateRecurringSubMeetingResponse updateRecurringSubMeeting(UpdateRecurringSubMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateRecurringSubMeeting);
    }

    /** 修改预定周期子会议 修改预定的周期子会议；会议开始时，不能修改会议
     *
     * @param UpdateRecurringSubMeetingRequest 请求对象
     * @return SyncInvoker<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse> */
    public SyncInvoker<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse> updateRecurringSubMeetingInvoker(
        UpdateRecurringSubMeetingRequest request) {
        return new SyncInvoker<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse>(request,
            MeetingMeta.updateRecurringSubMeeting, hcClient);
    }

    /** SP管理员根据修改企业资源 企业修改资源的过期时间、停用状态
     *
     * @param UpdateResourceRequest 请求对象
     * @return UpdateResourceResponse */
    public UpdateResourceResponse updateResource(UpdateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateResource);
    }

    /** SP管理员根据修改企业资源 企业修改资源的过期时间、停用状态
     *
     * @param UpdateResourceRequest 请求对象
     * @return SyncInvoker<UpdateResourceRequest, UpdateResourceResponse> */
    public SyncInvoker<UpdateResourceRequest, UpdateResourceResponse> updateResourceInvoker(
        UpdateResourceRequest request) {
        return new SyncInvoker<UpdateResourceRequest, UpdateResourceResponse>(request, MeetingMeta.updateResource,
            hcClient);
    }

    /** 高级设置 - 直播间设置 保存直播间高级设置。如有部分配置信息修改，则其他未修改的原始值也需要传入，否则部分字段会替换为默认值(即：只支持全量保存)
     *
     * @param UpdateRoomSettingRequest 请求对象
     * @return UpdateRoomSettingResponse */
    public UpdateRoomSettingResponse updateRoomSetting(UpdateRoomSettingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateRoomSetting);
    }

    /** 高级设置 - 直播间设置 保存直播间高级设置。如有部分配置信息修改，则其他未修改的原始值也需要传入，否则部分字段会替换为默认值(即：只支持全量保存)
     *
     * @param UpdateRoomSettingRequest 请求对象
     * @return SyncInvoker<UpdateRoomSettingRequest, UpdateRoomSettingResponse> */
    public SyncInvoker<UpdateRoomSettingRequest, UpdateRoomSettingResponse> updateRoomSettingInvoker(
        UpdateRoomSettingRequest request) {
        return new SyncInvoker<UpdateRoomSettingRequest, UpdateRoomSettingResponse>(request,
            MeetingMeta.updateRoomSetting, hcClient);
    }

    /** 会中修改配置 会中修改配置。
     *
     * @param UpdateStartedConfConfigRequest 请求对象
     * @return UpdateStartedConfConfigResponse */
    public UpdateStartedConfConfigResponse updateStartedConfConfig(UpdateStartedConfConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateStartedConfConfig);
    }

    /** 会中修改配置 会中修改配置。
     *
     * @param UpdateStartedConfConfigRequest 请求对象
     * @return SyncInvoker<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> */
    public SyncInvoker<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> updateStartedConfConfigInvoker(
        UpdateStartedConfConfigRequest request) {
        return new SyncInvoker<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse>(request,
            MeetingMeta.updateStartedConfConfig, hcClient);
    }

    /** 刷新Token 该接口提供刷新Token功能，根据传入的Token，刷新Token失效时间并返回结果。
     *
     * @param UpdateTokenRequest 请求对象
     * @return UpdateTokenResponse */
    public UpdateTokenResponse updateToken(UpdateTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateToken);
    }

    /** 刷新Token 该接口提供刷新Token功能，根据传入的Token，刷新Token失效时间并返回结果。
     *
     * @param UpdateTokenRequest 请求对象
     * @return SyncInvoker<UpdateTokenRequest, UpdateTokenResponse> */
    public SyncInvoker<UpdateTokenRequest, UpdateTokenResponse> updateTokenInvoker(UpdateTokenRequest request) {
        return new SyncInvoker<UpdateTokenRequest, UpdateTokenResponse>(request, MeetingMeta.updateToken, hcClient);
    }

    /** 修改用户 企业管理员通过该接口修改企业用户。
     *
     * @param UpdateUserRequest 请求对象
     * @return UpdateUserResponse */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateUser);
    }

    /** 修改用户 企业管理员通过该接口修改企业用户。
     *
     * @param UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse> */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<UpdateUserRequest, UpdateUserResponse>(request, MeetingMeta.updateUser, hcClient);
    }

    /** 编辑网络研讨会 您可根据需要修改普通网络研讨会和周期网络研讨会。注意：暂不支持添加外部联系人作为与会嘉宾
     *
     * @param UpdateWebinarRequest 请求对象
     * @return UpdateWebinarResponse */
    public UpdateWebinarResponse updateWebinar(UpdateWebinarRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateWebinar);
    }

    /** 编辑网络研讨会 您可根据需要修改普通网络研讨会和周期网络研讨会。注意：暂不支持添加外部联系人作为与会嘉宾
     *
     * @param UpdateWebinarRequest 请求对象
     * @return SyncInvoker<UpdateWebinarRequest, UpdateWebinarResponse> */
    public SyncInvoker<UpdateWebinarRequest, UpdateWebinarResponse> updateWebinarInvoker(UpdateWebinarRequest request) {
        return new SyncInvoker<UpdateWebinarRequest, UpdateWebinarResponse>(request, MeetingMeta.updateWebinar,
            hcClient);
    }

    /** 开放接口 - 文件上传 文件上传的开放接口
     *
     * @param UploadFileRequest 请求对象
     * @return UploadFileResponse */
    public UploadFileResponse uploadFile(UploadFileRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.uploadFile);
    }

    /** 开放接口 - 文件上传 文件上传的开放接口
     *
     * @param UploadFileRequest 请求对象
     * @return SyncInvoker<UploadFileRequest, UploadFileResponse> */
    public SyncInvoker<UploadFileRequest, UploadFileResponse> uploadFileInvoker(UploadFileRequest request) {
        return new SyncInvoker<UploadFileRequest, UploadFileResponse>(request, MeetingMeta.uploadFile, hcClient);
    }

    /** 查询QoS历史会议列表 * 查询企业内QoS历史会议列表。 * 支持按照时间范围查询，可查询最近3个月内数据。 * 权限角色&#x3D;旗舰版企业 + 管理员。
     *
     * @param SearchQosHistoryMeetingsRequest 请求对象
     * @return SearchQosHistoryMeetingsResponse */
    public SearchQosHistoryMeetingsResponse searchQosHistoryMeetings(SearchQosHistoryMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchQosHistoryMeetings);
    }

    /** 查询QoS历史会议列表 * 查询企业内QoS历史会议列表。 * 支持按照时间范围查询，可查询最近3个月内数据。 * 权限角色&#x3D;旗舰版企业 + 管理员。
     *
     * @param SearchQosHistoryMeetingsRequest 请求对象
     * @return SyncInvoker<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> */
    public SyncInvoker<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> searchQosHistoryMeetingsInvoker(
        SearchQosHistoryMeetingsRequest request) {
        return new SyncInvoker<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse>(request,
            MeetingMeta.searchQosHistoryMeetings, hcClient);
    }

    /** 查询QoS在线会议列表 * 查询企业内QoS在线会议列表。 * 权限角色&#x3D;旗舰版企业 + 管理员。
     *
     * @param SearchQosOnlineMeetingsRequest 请求对象
     * @return SearchQosOnlineMeetingsResponse */
    public SearchQosOnlineMeetingsResponse searchQosOnlineMeetings(SearchQosOnlineMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchQosOnlineMeetings);
    }

    /** 查询QoS在线会议列表 * 查询企业内QoS在线会议列表。 * 权限角色&#x3D;旗舰版企业 + 管理员。
     *
     * @param SearchQosOnlineMeetingsRequest 请求对象
     * @return SyncInvoker<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> */
    public SyncInvoker<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> searchQosOnlineMeetingsInvoker(
        SearchQosOnlineMeetingsRequest request) {
        return new SyncInvoker<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse>(request,
            MeetingMeta.searchQosOnlineMeetings, hcClient);
    }

    /** 查询与会者的QoS数据 * 查询企业内指定与会者的QoS数据，按照音频，视频，屏幕共享，CPU分类查询QoS数据。 * QoS数据的打点周期为5秒。 * 权限角色&#x3D;旗舰版企业 + 管理员。
     *
     * @param SearchQosParticipantDetailRequest 请求对象
     * @return SearchQosParticipantDetailResponse */
    public SearchQosParticipantDetailResponse searchQosParticipantDetail(SearchQosParticipantDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchQosParticipantDetail);
    }

    /** 查询与会者的QoS数据 * 查询企业内指定与会者的QoS数据，按照音频，视频，屏幕共享，CPU分类查询QoS数据。 * QoS数据的打点周期为5秒。 * 权限角色&#x3D;旗舰版企业 + 管理员。
     *
     * @param SearchQosParticipantDetailRequest 请求对象
     * @return SyncInvoker<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> */
    public SyncInvoker<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> searchQosParticipantDetailInvoker(
        SearchQosParticipantDetailRequest request) {
        return new SyncInvoker<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse>(request,
            MeetingMeta.searchQosParticipantDetail, hcClient);
    }

    /** 查询QoS会议与会者列表 * 查询企业内QoS会议与会者列表。 * 权限角色&#x3D;旗舰版企业 + 管理员。
     *
     * @param SearchQosParticipantsRequest 请求对象
     * @return SearchQosParticipantsResponse */
    public SearchQosParticipantsResponse searchQosParticipants(SearchQosParticipantsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchQosParticipants);
    }

    /** 查询QoS会议与会者列表 * 查询企业内QoS会议与会者列表。 * 权限角色&#x3D;旗舰版企业 + 管理员。
     *
     * @param SearchQosParticipantsRequest 请求对象
     * @return SyncInvoker<SearchQosParticipantsRequest, SearchQosParticipantsResponse> */
    public SyncInvoker<SearchQosParticipantsRequest, SearchQosParticipantsResponse> searchQosParticipantsInvoker(
        SearchQosParticipantsRequest request) {
        return new SyncInvoker<SearchQosParticipantsRequest, SearchQosParticipantsResponse>(request,
            MeetingMeta.searchQosParticipants, hcClient);
    }

    /** 查询企业级会议总体统计数据 * 查询企业级会议指定时间范围内总体统计数据，按日/按月统计。 * 查询企业级会议单日内总体统计数据，按小时统计。 * 权限角色 &#x3D; 旗舰版企业 + 管理员。
     *
     * @param SearchStatisticConferenceInfoRequest 请求对象
     * @return SearchStatisticConferenceInfoResponse */
    public SearchStatisticConferenceInfoResponse searchStatisticConferenceInfo(
        SearchStatisticConferenceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchStatisticConferenceInfo);
    }

    /** 查询企业级会议总体统计数据 * 查询企业级会议指定时间范围内总体统计数据，按日/按月统计。 * 查询企业级会议单日内总体统计数据，按小时统计。 * 权限角色 &#x3D; 旗舰版企业 + 管理员。
     *
     * @param SearchStatisticConferenceInfoRequest 请求对象
     * @return SyncInvoker<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse> */
    public SyncInvoker<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse> searchStatisticConferenceInfoInvoker(
        SearchStatisticConferenceInfoRequest request) {
        return new SyncInvoker<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse>(request,
            MeetingMeta.searchStatisticConferenceInfo, hcClient);
    }

    /** 查询企业级会议与会统计数据 * 查询企业级会议与会用户统计数据，按日/按月统计。 * 查询企业级会议与会硬件终端统计数据，按日/按月统计。 * 查询企业级会议与会设备统计数据，按日/按月统计。 * 权限角色 &#x3D;
     * 旗舰版企业 + 管理员。
     *
     * @param SearchStatisticConferenceParticipantRequest 请求对象
     * @return SearchStatisticConferenceParticipantResponse */
    public SearchStatisticConferenceParticipantResponse searchStatisticConferenceParticipant(
        SearchStatisticConferenceParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchStatisticConferenceParticipant);
    }

    /** 查询企业级会议与会统计数据 * 查询企业级会议与会用户统计数据，按日/按月统计。 * 查询企业级会议与会硬件终端统计数据，按日/按月统计。 * 查询企业级会议与会设备统计数据，按日/按月统计。 * 权限角色 &#x3D;
     * 旗舰版企业 + 管理员。
     *
     * @param SearchStatisticConferenceParticipantRequest 请求对象
     * @return SyncInvoker<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse> */
    public SyncInvoker<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse> searchStatisticConferenceParticipantInvoker(
        SearchStatisticConferenceParticipantRequest request) {
        return new SyncInvoker<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse>(
            request, MeetingMeta.searchStatisticConferenceParticipant, hcClient);
    }

    /** 查询企业级会议已购资源使用统计数据 * 查询企业级会议的已购资源使用状况，按日/按月统计。 * 权限角色 &#x3D; 旗舰版企业 + 管理员。
     *
     * @param SearchStatisticResourceInfoRequest 请求对象
     * @return SearchStatisticResourceInfoResponse */
    public SearchStatisticResourceInfoResponse searchStatisticResourceInfo(SearchStatisticResourceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchStatisticResourceInfo);
    }

    /** 查询企业级会议已购资源使用统计数据 * 查询企业级会议的已购资源使用状况，按日/按月统计。 * 权限角色 &#x3D; 旗舰版企业 + 管理员。
     *
     * @param SearchStatisticResourceInfoRequest 请求对象
     * @return SyncInvoker<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse> */
    public SyncInvoker<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse> searchStatisticResourceInfoInvoker(
        SearchStatisticResourceInfoRequest request) {
        return new SyncInvoker<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse>(request,
            MeetingMeta.searchStatisticResourceInfo, hcClient);
    }

    /** 查询企业级会议的用户统计数据 * 查询企业级会议用户登录数据，按日/按月统计。 * 查询企业级会议用户激活数据，按日/按月统计。 * 查询企业级会议用户登录设备数据，按日/按月统计。 * 权限角色 &#x3D; 旗舰版企业
     * + 管理员。
     *
     * @param SearchStatisticUserInfoRequest 请求对象
     * @return SearchStatisticUserInfoResponse */
    public SearchStatisticUserInfoResponse searchStatisticUserInfo(SearchStatisticUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchStatisticUserInfo);
    }

    /** 查询企业级会议的用户统计数据 * 查询企业级会议用户登录数据，按日/按月统计。 * 查询企业级会议用户激活数据，按日/按月统计。 * 查询企业级会议用户登录设备数据，按日/按月统计。 * 权限角色 &#x3D; 旗舰版企业
     * + 管理员。
     *
     * @param SearchStatisticUserInfoRequest 请求对象
     * @return SyncInvoker<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse> */
    public SyncInvoker<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse> searchStatisticUserInfoInvoker(
        SearchStatisticUserInfoRequest request) {
        return new SyncInvoker<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse>(request,
            MeetingMeta.searchStatisticUserInfo, hcClient);
    }

}
