package com.huaweicloud.sdk.meeting.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.meeting.v1.model.*;

public class MeetingClient {
    protected HcClient hcClient;

    public MeetingClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MeetingClient> newBuilder() {
        return new ClientBuilder<>(MeetingClient::new);
    }

    public AddCorpResponse addCorp(AddCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addCorp);
    }

    public AddCorpAdminResponse addCorpAdmin(AddCorpAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addCorpAdmin);
    }

    public AddDepartmentResponse addDepartment(AddDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addDepartment);
    }

    public AddDeviceResponse addDevice(AddDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addDevice);
    }

    public AddResourceResponse addResource(AddResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addResource);
    }

    public AddUserResponse addUser(AddUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addUser);
    }

    public AssociateVmrResponse associateVmr(AssociateVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.associateVmr);
    }

    public BatchDeleteCorpAdminsResponse batchDeleteCorpAdmins(BatchDeleteCorpAdminsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteCorpAdmins);
    }

    public BatchDeleteDevicesResponse batchDeleteDevices(BatchDeleteDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteDevices);
    }

    public BatchDeleteUsersResponse batchDeleteUsers(BatchDeleteUsersRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteUsers);
    }

    public BatchUpdateDevicesStatusResponse batchUpdateDevicesStatus(BatchUpdateDevicesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchUpdateDevicesStatus);
    }

    public BatchUpdateUserStatusResponse batchUpdateUserStatus(BatchUpdateUserStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchUpdateUserStatus);
    }

    public CheckSlideVerifyCodeResponse checkSlideVerifyCode(CheckSlideVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkSlideVerifyCode);
    }

    public CheckTokenResponse checkToken(CheckTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkToken);
    }

    public CheckVeriCodeForUpdateUserInfoResponse checkVeriCodeForUpdateUserInfo(CheckVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkVeriCodeForUpdateUserInfo);
    }

    public CheckVerifyCodeResponse checkVerifyCode(CheckVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkVerifyCode);
    }

    public DeleteCorpResponse deleteCorp(DeleteCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteCorp);
    }

    public DeleteCorpVmrResponse deleteCorpVmr(DeleteCorpVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteCorpVmr);
    }

    public DeleteDepartmentResponse deleteDepartment(DeleteDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteDepartment);
    }

    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteResource);
    }

    public DisassociateVmrResponse disassociateVmr(DisassociateVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.disassociateVmr);
    }

    public ResetActivecodeResponse resetActivecode(ResetActivecodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetActivecode);
    }

    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetPwd);
    }

    public ResetPwdByAdminResponse resetPwdByAdmin(ResetPwdByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetPwdByAdmin);
    }

    public SearchCorpResponse searchCorp(SearchCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorp);
    }

    public SearchCorpAdminsResponse searchCorpAdmins(SearchCorpAdminsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpAdmins);
    }

    public SearchCorpDirResponse searchCorpDir(SearchCorpDirRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpDir);
    }

    public SearchCorpVmrResponse searchCorpVmr(SearchCorpVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpVmr);
    }

    public SearchDepartmentByNameResponse searchDepartmentByName(SearchDepartmentByNameRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchDepartmentByName);
    }

    public SearchDevicesResponse searchDevices(SearchDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchDevices);
    }

    public SearchMemberVmrResponse searchMemberVmr(SearchMemberVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMemberVmr);
    }

    public SearchResourceResponse searchResource(SearchResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchResource);
    }

    public SearchResourceOpRecordResponse searchResourceOpRecord(SearchResourceOpRecordRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchResourceOpRecord);
    }

    public SearchUsersResponse searchUsers(SearchUsersRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchUsers);
    }

    public SendSlideVerifyCodeResponse sendSlideVerifyCode(SendSlideVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendSlideVerifyCode);
    }

    public SendVeriCodeForChangePwdResponse sendVeriCodeForChangePwd(SendVeriCodeForChangePwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendVeriCodeForChangePwd);
    }

    public SendVeriCodeForUpdateUserInfoResponse sendVeriCodeForUpdateUserInfo(SendVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendVeriCodeForUpdateUserInfo);
    }

    public ShowCorpResponse showCorp(ShowCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorp);
    }

    public ShowCorpAdminResponse showCorpAdmin(ShowCorpAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpAdmin);
    }

    public ShowCorpBasicInfoResponse showCorpBasicInfo(ShowCorpBasicInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpBasicInfo);
    }

    public ShowCorpResourceResponse showCorpResource(ShowCorpResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpResource);
    }

    public ShowDeptAndChildDeptResponse showDeptAndChildDept(ShowDeptAndChildDeptRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeptAndChildDept);
    }

    public ShowDeviceDetailResponse showDeviceDetail(ShowDeviceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceDetail);
    }

    public ShowDeviceStatusResponse showDeviceStatus(ShowDeviceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceStatus);
    }

    public ShowDeviceTypesResponse showDeviceTypes(ShowDeviceTypesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceTypes);
    }

    public ShowMyInfoResponse showMyInfo(ShowMyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMyInfo);
    }

    public ShowUserDetailResponse showUserDetail(ShowUserDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showUserDetail);
    }

    public UpdateContactResponse updateContact(UpdateContactRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateContact);
    }

    public UpdateCorpResponse updateCorp(UpdateCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateCorp);
    }

    public UpdateCorpBasicInfoResponse updateCorpBasicInfo(UpdateCorpBasicInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateCorpBasicInfo);
    }

    public UpdateDepartmentResponse updateDepartment(UpdateDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateDepartment);
    }

    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateDevice);
    }

    public UpdateMemberVmrResponse updateMemberVmr(UpdateMemberVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMemberVmr);
    }

    public UpdateMyInfoResponse updateMyInfo(UpdateMyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMyInfo);
    }

    public UpdatePwdResponse updatePwd(UpdatePwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updatePwd);
    }

    public UpdateResourceResponse updateResource(UpdateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateResource);
    }

    public UpdateTokenResponse updateToken(UpdateTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateToken);
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateUser);
    }

}