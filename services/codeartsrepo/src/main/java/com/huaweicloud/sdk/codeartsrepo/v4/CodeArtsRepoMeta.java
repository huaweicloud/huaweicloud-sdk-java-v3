package com.huaweicloud.sdk.codeartsrepo.v4;

import com.huaweicloud.sdk.codeartsrepo.v4.model.AddGroupWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddGroupWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddProjectWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddProjectWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddRepositoryMembersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddRepositoryMembersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddRepositoryWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddRepositoryWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddSshKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddSshKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddSubmoduleRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddSubmoduleResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddTrustedIpAddressRequestBody;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ApprovalActionTypeDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ApprovalApproverInfoDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ApprovalMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ApprovalMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ApprovalReviewerInfoDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ApproverBasicDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateGroupUserGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateGroupUserGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateRemoteMirrorRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateRemoteMirrorResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateRepositoryUserGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateRepositoryUserGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BasicRepositoryDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchCreateProtectedBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchCreateProtectedBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchCreateProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchCreateProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchCreateRepositoryMemberBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchCreateRepositoryMemberDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteBranchDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteFilePushPermissionDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteProtectedBranchesBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteProtectedBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteProtectedBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteProtectedTagsBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteRepositoryFilePushPermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteRepositoryFilePushPermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateFilePushPermissionBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateProtectedBranchesBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateProtectedBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateProtectedBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateProtectedTagsBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateRepositoryFilePushPermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateRepositoryFilePushPermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchValidateRepoNamesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchValidateRepoNamesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchValidateUserGroupPermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchValidateUserGroupPermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BlameDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BodyPutLabelDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BranchSimpleDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BussinessGroupTransferBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ChangesTreeDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CheckDeployKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CheckDeployKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CheckGroupDeployKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CheckGroupDeployKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CommentPathDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CommitDiscussionDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CommitMergeRequestDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CommitParams;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CommitRevetOrCherryPickDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CommitRuleCreateBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CommitRuleDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CommitRuleUpdateBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ContributorDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateBranchDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCherryPickMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCherryPickMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCommitRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCommitResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCommitRevertRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCommitRevertResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateDirRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateDirResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateFilePushPermissionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateFilePushPermissionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupRequestBody;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestApproverSettingDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestDiscussionResponseRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestDiscussionResponseResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestNoteDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestTemplateDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectProtectedBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectProtectedBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositoryCommitRuleRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositoryCommitRuleResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositoryFilePushPermissionDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositoryLabelRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositoryLabelResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositorySystemLabelsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositorySystemLabelsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateReviewSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateReviewSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateTagDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestVoteRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestVoteResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProjectMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProjectMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProjectMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProjectMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProtectedBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProtectedBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProtectedTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProtectedTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteRepositoryLabelRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteRepositoryLabelResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteSshKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteSshKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeployKeyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeployKeyParamsDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeployKeyValueDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DiscussionTemplateDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DownloadArchiveRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DownloadArchiveResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DownloadBlobsRawRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DownloadBlobsRawResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ExecuteRepositoryStatisticsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ExecuteRepositoryStatisticsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ExportTenantRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ExportTenantRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ExportTenantRepositoryBody;
import com.huaweicloud.sdk.codeartsrepo.v4.model.FileBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.FileDiffDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ForkRepositoryDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.GeneralCommitRuleBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.GeneralPolicyBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.GrantedUsersDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.GroupBaseDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.GroupBatchAddMemberDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.GroupMemberDetailDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.GroupMergeRequestTemplateDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.GroupPermissionsDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ImpersonationToken;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ImportMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ImportMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ImportMrParamsDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ItemCommitDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.JobWithStageDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.LabelBasicDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.LabelCreateDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.LabelDetailDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListBranchRelatedWorkItemsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListBranchRelatedWorkItemsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitAssociatedMergeRequestsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitAssociatedMergeRequestsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitAssociatedRefsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitAssociatedRefsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitDiscussionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitDiscussionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCurrentUserRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCurrentUserRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListDefaultReviewCategoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListDefaultReviewCategoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListDiscussionTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListDiscussionTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFileBlameLinesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFileBlameLinesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFileUpperTreeEntriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFileUpperTreeEntriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFilesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFilesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupAddableMembersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupAddableMembersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupAddableUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupAddableUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupDeployKeysRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupDeployKeysResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMembersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMembersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestApproverSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestApproverSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestCanBeAssignedReviewersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestCanBeAssignedReviewersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestValidAssignedCandidatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestValidAssignedCandidatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupPermissionResourcesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupPermissionResourcesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupProtectedRefsUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupProtectedRefsUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupSubgroupsAndRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupSubgroupsAndRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupWebhookLogsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupWebhookLogsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupWebhooksRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupWebhooksResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListImpersonationTokensRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListImpersonationTokensResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListItemCommitsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListItemCommitsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListLatestPipelineJobsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListLatestPipelineJobsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListLogsTreeRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListLogsTreeResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListManageableGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListManageableGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMembersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMembersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestApproverSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestApproverSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestApproversRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestApproversResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestChangesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestChangesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestChangesTreesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestChangesTreesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestCommitsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestCommitsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestConflictFilesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestConflictFilesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestDiscussionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestDiscussionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestEvaluationsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestEvaluationsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestParticipantsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestParticipantsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestReviewersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestReviewersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestSystemNotesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestSystemNotesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestValidAssignedCandidatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestValidAssignedCandidatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestVersionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestVersionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalMergeRequestsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalMergeRequestsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalRecentPushEventsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalRecentPushEventsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalRepositoryImportRecordsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalRepositoryImportRecordsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPipelineJobsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPipelineJobsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProductPermissionResourcesGrantedUsersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProductPermissionResourcesGrantedUsersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectDeployKeysRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectDeployKeysResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestApproverSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestApproverSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestCanBeAssignedReviewersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestCanBeAssignedReviewersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestCanBeAssignedUsersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestCanBeAssignedUsersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedRefsUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedRefsUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectSubgroupsAndRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectSubgroupsAndRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectWebhookLogsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectWebhookLogsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectWebhooksRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectWebhooksResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProtectedBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProtectedBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRefsListRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRefsListResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryCommitRulesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryCommitRulesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryContributorsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryContributorsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryDeployKeysRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryDeployKeysResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryEventsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryEventsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryFilePushPermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryFilePushPermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryForksRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryForksResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryLabelsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryLabelsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryLanguagesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryLanguagesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryMergeRequestsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryMergeRequestsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryProtectedRefsUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryProtectedRefsUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryResourcePermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryResourcePermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryReviewAuthorsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryReviewAuthorsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryReviewsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryReviewsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWebhookLogsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWebhookLogsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWebhooksRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWebhooksResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWorkItemsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWorkItemsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListSubmodulesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListSubmodulesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTenantRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTenantRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTenantTrustedIpAddressesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTenantTrustedIpAddressesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTreesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTreesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTrustedIpAddressesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTrustedIpAddressesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListUserGpgKeysRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListUserGpgKeysResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListUserKeysRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListUserKeysResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.LockRepositoryRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.LockRepositoryResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.LogTreeDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MRConflictFileDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MRVoteReviewerDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ManageableGroupDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeMergeRequestBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeRequestApproverSettingResultDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeRequestCommitDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeRequestDiscussionDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeRequestListBasicDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeRequestStatisticDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeRequestVoteBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeRequestVoteReviewerDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ModifyEmailAddressDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MrCherryRevertDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.NoteDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.NoteRequiredAttributeDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.PermissionDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.PermissionInheritEnabledDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.PersonalPushEventDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.PostMergeRequestParamsDtoForOpenApi;
import com.huaweicloud.sdk.codeartsrepo.v4.model.PostNoteRequiredAttributeDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ProjectMergeRequestTemplateDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ProjectProtectedBranchApiDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ProjectProtectedTagDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ProjectProtectedTagPo;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ProjectSettingsInheritCfgDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ProjectUserGroupDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ProtectedBranchBodyApiDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ProtectedBranchProtectedActionBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ProtectedRefsUserGroupBasicDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.PutMergeRequestParamsDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RebaseMergeRequestForOpenApiRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RebaseMergeRequestForOpenApiResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoteMirrorDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoteMirrorSyncInfoDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoteMirrorUpdateBody;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveDeployKeyFromSubmodulesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveDeployKeyFromSubmodulesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveDeployKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveDeployKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveGroupWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveGroupWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveProjectWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveProjectWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveRepositoryWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveRepositoryWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RenameFileBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RenameFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RenameFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ReplyMergeRequestNoteDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryDirDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryFilePushPermissionDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryImportRecordDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryInheritSettingDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryInheritSettingsBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryMemberDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryMergeRequestTemplateDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryProtectedBranchBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryProtectedBranchDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryProtectedTagActionBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryProtectedTagBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryProtectedTagDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryPushEventDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositorySimplestDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryTemplateDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RepositoryUserGroupDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ReqWorkItemDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ResolveConflictDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ResolveMergeRequestConflictsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ResolveMergeRequestConflictsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ResponsePermissionInfo;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ReviewDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ReviewMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ReviewMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ReviewSettingParamDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SendUserEmailVerifyCodeRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SendUserEmailVerifyCodeResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SettingsInheritCfgBodyApiDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowActualHeadPipelineRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowActualHeadPipelineResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowAverageEvaluationRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowAverageEvaluationResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBlobsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBlobsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBranchConflictRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBranchConflictResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitCommentsByLineRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitCommentsByLineResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitDiffMetadataRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitDiffMetadataResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitFileDiffRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitFileDiffResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitStatisticsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitStatisticsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowDiffCommitRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowDiffCommitResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowDiffLinesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowDiffLinesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileContentRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileContentResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileRawRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileRawResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupE2eSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupE2eSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupInheritSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupInheritSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupMergeRequestSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupMergeRequestSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupPermissionInheritEnabledRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupPermissionInheritEnabledResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupReviewSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupReviewSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupSettingsInheritCfgRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupSettingsInheritCfgResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWebhookLogRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWebhookLogResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupsGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupsGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupsInheritRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupsInheritResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowHttpsPasswordSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowHttpsPasswordSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowLastPushEventInRepositoryRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowLastPushEventInRepositoryResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestCommentsByLineRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestCommentsByLineResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestDetailRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestDetailResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestVotesDetailRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestVotesDetailResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeableStateOuterRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeableStateOuterResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNotificationSubscriptionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNotificationSubscriptionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNotificationSubscriptionsStatusRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNotificationSubscriptionsStatusResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectE2eSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectE2eSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectMemberSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectMemberSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectMergeRequestSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectMergeRequestSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectReviewSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectReviewSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectSettingsInheritCfgRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectSettingsInheritCfgResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWebhookLogRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWebhookLogResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectsGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectsGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProtectedBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProtectedBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProtectedTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProtectedTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowReadmeFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowReadmeFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRefCompareRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRefCompareResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRemoteMirrorRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRemoteMirrorResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryE2eSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryE2eSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryGeneralCommitRuleRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryGeneralCommitRuleResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryInheritSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryInheritSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryInheritSettingSourceRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryInheritSettingSourceResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryMergeRequestsStatisticRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryMergeRequestsStatisticResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryPermissionInheritEnabledRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryPermissionInheritEnabledResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryStatisticsStatusRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryStatisticsStatusResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryStatisticsSummaryRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryStatisticsSummaryResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWebhookLogRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWebhookLogResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowResourcePermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowResourcePermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowReviewSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowReviewSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowUserEmailsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowUserEmailsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowUserRefPermissionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowUserRefPermissionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SimpleMergeRequestChangesDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SimpleTagDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.StartHouseKeepingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.StartHouseKeepingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.StartRemoteMirrorSynchronizationRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.StartRemoteMirrorSynchronizationResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.StatisticsParamsDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SubgroupAndProjectBaseDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SubmoduleDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SubmoduleReqDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SyncDeployKeyToSubmodulesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SyncDeployKeyToSubmodulesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.TenantRepositoryDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.TenantTrustedIpAddressDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.TransferGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.TransferGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.TreeDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.TreeObjectDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.TrustedIpAddressDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UnlockRepositoryRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UnlockRepositoryResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateBranchDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateBranchNameRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateBranchNameResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateFileBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGeneralPolicyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupReviewSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupReviewSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateHttpsPasswordSetting;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateHttpsPasswordSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateHttpsPasswordSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestApproversRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestApproversResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestDiscussionInfoRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestDiscussionInfoResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestNoteDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestReviewersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestReviewersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestSettingDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestVoteRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestVoteResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateNotificationSubscriptionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateNotificationSubscriptionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdatePermissionBodyDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectReviewSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectReviewSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectSettingsInheritCfgRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectSettingsInheritCfgResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProtectedBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProtectedBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProtectedTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProtectedTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepoNotificationSubscriptionDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryCommitRuleRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryCommitRuleResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryGeneralCommitRuleRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryGeneralCommitRuleResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryInheritSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryInheritSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryLabelRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryLabelResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryPermissionInheritEnabledRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryPermissionInheritEnabledResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryRemoteMirrorRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryRemoteMirrorResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryResourcePermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryResourcePermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateUserEmailsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateUserEmailsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateWatermarkDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UserBasicDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UserGroupDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UserGroupPermissionDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ValidateRepoNameDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ValidateRepoNameResultDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.WebhookDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.WebhookLogDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.WebhookLogExtendDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.WebhookParamsDto;
import com.huaweicloud.sdk.codeartsrepo.v4.model.WorkItemSimpleDto;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unchecked")
public class CodeArtsRepoMeta {

    public static final HttpRequestDef<CreateCommitRequest, CreateCommitResponse> createCommit = genForCreateCommit();

    private static HttpRequestDef<CreateCommitRequest, CreateCommitResponse> genForCreateCommit() {
        // basic
        HttpRequestDef.Builder<CreateCommitRequest, CreateCommitResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCommitRequest.class, CreateCommitResponse.class)
                .withName("CreateCommit")
                .withUri("/v4/repositories/{repository_id}/repository/commits")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateCommitRequest::getRepositoryId, CreateCommitRequest::setRepositoryId));
        builder.<CommitParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommitParams.class),
            f -> f.withMarshaller(CreateCommitRequest::getBody, CreateCommitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCommitRevertRequest, CreateCommitRevertResponse> createCommitRevert =
        genForCreateCommitRevert();

    private static HttpRequestDef<CreateCommitRevertRequest, CreateCommitRevertResponse> genForCreateCommitRevert() {
        // basic
        HttpRequestDef.Builder<CreateCommitRevertRequest, CreateCommitRevertResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCommitRevertRequest.class, CreateCommitRevertResponse.class)
                .withName("CreateCommitRevert")
                .withUri("/v4/repositories/{repository_id}/repository/commits/{sha}/revert")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateCommitRevertRequest::getRepositoryId,
                CreateCommitRevertRequest::setRepositoryId));
        builder.<String>withRequestField("sha",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCommitRevertRequest::getSha, CreateCommitRevertRequest::setSha));
        builder.<CommitRevetOrCherryPickDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommitRevetOrCherryPickDto.class),
            f -> f.withMarshaller(CreateCommitRevertRequest::getBody, CreateCommitRevertRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommitAssociatedRefsRequest, ListCommitAssociatedRefsResponse> listCommitAssociatedRefs =
        genForListCommitAssociatedRefs();

    private static HttpRequestDef<ListCommitAssociatedRefsRequest, ListCommitAssociatedRefsResponse> genForListCommitAssociatedRefs() {
        // basic
        HttpRequestDef.Builder<ListCommitAssociatedRefsRequest, ListCommitAssociatedRefsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListCommitAssociatedRefsRequest.class, ListCommitAssociatedRefsResponse.class)
                .withName("ListCommitAssociatedRefs")
                .withUri("/v4/repositories/{repository_id}/repository/commits/{sha}/refs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitAssociatedRefsRequest::getRepositoryId,
                ListCommitAssociatedRefsRequest::setRepositoryId));
        builder.<String>withRequestField("sha",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitAssociatedRefsRequest::getSha, ListCommitAssociatedRefsRequest::setSha));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitAssociatedRefsRequest::getOffset,
                ListCommitAssociatedRefsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitAssociatedRefsRequest::getLimit,
                ListCommitAssociatedRefsRequest::setLimit));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCommitAssociatedRefsResponse::getBody, ListCommitAssociatedRefsResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListCommitsRequest, ListCommitsResponse> listCommits = genForListCommits();

    private static HttpRequestDef<ListCommitsRequest, ListCommitsResponse> genForListCommits() {
        // basic
        HttpRequestDef.Builder<ListCommitsRequest, ListCommitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCommitsRequest.class, ListCommitsResponse.class)
                .withName("ListCommits")
                .withUri("/v4/repositories/{repository_id}/repository/commit-list")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitsRequest::getRepositoryId, ListCommitsRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitsRequest::getOffset, ListCommitsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitsRequest::getLimit, ListCommitsRequest::setLimit));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getRefName, ListCommitsRequest::setRefName));
        builder.<String>withRequestField("since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getSince, ListCommitsRequest::setSince));
        builder.<String>withRequestField("until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getUntil, ListCommitsRequest::setUntil));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getPath, ListCommitsRequest::setPath));
        builder.<String>withRequestField("message",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getMessage, ListCommitsRequest::setMessage));
        builder.<String>withRequestField("author",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getAuthor, ListCommitsRequest::setAuthor));
        builder.<Boolean>withRequestField("order_by_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCommitsRequest::getOrderByDate, ListCommitsRequest::setOrderByDate));
        builder.<Boolean>withRequestField("follow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCommitsRequest::getFollow, ListCommitsRequest::setFollow));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommitRequest, ShowCommitResponse> showCommit = genForShowCommit();

    private static HttpRequestDef<ShowCommitRequest, ShowCommitResponse> genForShowCommit() {
        // basic
        HttpRequestDef.Builder<ShowCommitRequest, ShowCommitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommitRequest.class, ShowCommitResponse.class)
                .withName("ShowCommit")
                .withUri("/v4/repositories/{repository_id}/repository/commits")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitRequest::getRepositoryId, ShowCommitRequest::setRepositoryId));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitRequest::getSha, ShowCommitRequest::setSha));
        builder.<Boolean>withRequestField("stats",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowCommitRequest::getStats, ShowCommitRequest::setStats));
        builder.<Boolean>withRequestField("show_code_changes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowCommitRequest::getShowCodeChanges, ShowCommitRequest::setShowCodeChanges));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommitDiffMetadataRequest, ShowCommitDiffMetadataResponse> showCommitDiffMetadata =
        genForShowCommitDiffMetadata();

    private static HttpRequestDef<ShowCommitDiffMetadataRequest, ShowCommitDiffMetadataResponse> genForShowCommitDiffMetadata() {
        // basic
        HttpRequestDef.Builder<ShowCommitDiffMetadataRequest, ShowCommitDiffMetadataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCommitDiffMetadataRequest.class, ShowCommitDiffMetadataResponse.class)
            .withName("ShowCommitDiffMetadata")
            .withUri("/v4/repositories/{repository_id}/repository/commits/diff-metadata")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitDiffMetadataRequest::getRepositoryId,
                ShowCommitDiffMetadataRequest::setRepositoryId));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitDiffMetadataRequest::getSha, ShowCommitDiffMetadataRequest::setSha));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommitFileDiffRequest, ShowCommitFileDiffResponse> showCommitFileDiff =
        genForShowCommitFileDiff();

    private static HttpRequestDef<ShowCommitFileDiffRequest, ShowCommitFileDiffResponse> genForShowCommitFileDiff() {
        // basic
        HttpRequestDef.Builder<ShowCommitFileDiffRequest, ShowCommitFileDiffResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommitFileDiffRequest.class, ShowCommitFileDiffResponse.class)
                .withName("ShowCommitFileDiff")
                .withUri("/v4/repositories/{repository_id}/repository/commits/file-diff")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitFileDiffRequest::getRepositoryId,
                ShowCommitFileDiffRequest::setRepositoryId));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitFileDiffRequest::getSha, ShowCommitFileDiffRequest::setSha));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitFileDiffRequest::getPath, ShowCommitFileDiffRequest::setPath));
        builder.<String>withRequestField("old_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitFileDiffRequest::getOldPath, ShowCommitFileDiffRequest::setOldPath));
        builder.<Boolean>withRequestField("ignore_whitespace_change",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowCommitFileDiffRequest::getIgnoreWhitespaceChange,
                ShowCommitFileDiffRequest::setIgnoreWhitespaceChange));

        // response
        builder.<List<FileDiffDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowCommitFileDiffResponse::getBody, ShowCommitFileDiffResponse::setBody)
                .withInnerContainerType(FileDiffDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiffCommitRequest, ShowDiffCommitResponse> showDiffCommit =
        genForShowDiffCommit();

    private static HttpRequestDef<ShowDiffCommitRequest, ShowDiffCommitResponse> genForShowDiffCommit() {
        // basic
        HttpRequestDef.Builder<ShowDiffCommitRequest, ShowDiffCommitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDiffCommitRequest.class, ShowDiffCommitResponse.class)
                .withName("ShowDiffCommit")
                .withUri("/v4/repositories/{repository_id}/repository/commits/diff")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDiffCommitRequest::getRepositoryId, ShowDiffCommitRequest::setRepositoryId));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiffCommitRequest::getSha, ShowDiffCommitRequest::setSha));
        builder.<Boolean>withRequestField("ignore_whitespace_change",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDiffCommitRequest::getIgnoreWhitespaceChange,
                ShowDiffCommitRequest::setIgnoreWhitespaceChange));
        builder.<Boolean>withRequestField("not_statistic",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDiffCommitRequest::getNotStatistic, ShowDiffCommitRequest::setNotStatistic));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDiffCommitRequest::getOffset, ShowDiffCommitRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDiffCommitRequest::getLimit, ShowDiffCommitRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse> createMergeRequestDiscussion =
        genForCreateMergeRequestDiscussion();

    private static HttpRequestDef<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse> genForCreateMergeRequestDiscussion() {
        // basic
        HttpRequestDef.Builder<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateMergeRequestDiscussionRequest.class,
                    CreateMergeRequestDiscussionResponse.class)
                .withName("CreateMergeRequestDiscussion")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/discussions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionRequest::getRepositoryId,
                CreateMergeRequestDiscussionRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionRequest::getMergeRequestIid,
                CreateMergeRequestDiscussionRequest::setMergeRequestIid));
        builder.<CreateMergeRequestNoteDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeRequestNoteDto.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionRequest::getBody,
                CreateMergeRequestDiscussionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMergeRequestDiscussionResponseRequest, CreateMergeRequestDiscussionResponseResponse> createMergeRequestDiscussionResponse =
        genForCreateMergeRequestDiscussionResponse();

    private static HttpRequestDef<CreateMergeRequestDiscussionResponseRequest, CreateMergeRequestDiscussionResponseResponse> genForCreateMergeRequestDiscussionResponse() {
        // basic
        HttpRequestDef.Builder<CreateMergeRequestDiscussionResponseRequest, CreateMergeRequestDiscussionResponseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateMergeRequestDiscussionResponseRequest.class,
                    CreateMergeRequestDiscussionResponseResponse.class)
                .withName("CreateMergeRequestDiscussionResponse")
                .withUri(
                    "/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/discussions/{discussion_id}/notes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionResponseRequest::getRepositoryId,
                CreateMergeRequestDiscussionResponseRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionResponseRequest::getMergeRequestIid,
                CreateMergeRequestDiscussionResponseRequest::setMergeRequestIid));
        builder.<String>withRequestField("discussion_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionResponseRequest::getDiscussionId,
                CreateMergeRequestDiscussionResponseRequest::setDiscussionId));
        builder.<ReplyMergeRequestNoteDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReplyMergeRequestNoteDto.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionResponseRequest::getBody,
                CreateMergeRequestDiscussionResponseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReviewSettingRequest, CreateReviewSettingResponse> createReviewSetting =
        genForCreateReviewSetting();

    private static HttpRequestDef<CreateReviewSettingRequest, CreateReviewSettingResponse> genForCreateReviewSetting() {
        // basic
        HttpRequestDef.Builder<CreateReviewSettingRequest, CreateReviewSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateReviewSettingRequest.class, CreateReviewSettingResponse.class)
                .withName("CreateReviewSetting")
                .withUri("/v4/repositories/{repository_id}/review-settings")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateReviewSettingRequest::getRepositoryId,
                CreateReviewSettingRequest::setRepositoryId));
        builder.<ReviewSettingParamDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReviewSettingParamDto.class),
            f -> f.withMarshaller(CreateReviewSettingRequest::getBody, CreateReviewSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMergeRequestDiscussionRequest, DeleteMergeRequestDiscussionResponse> deleteMergeRequestDiscussion =
        genForDeleteMergeRequestDiscussion();

    private static HttpRequestDef<DeleteMergeRequestDiscussionRequest, DeleteMergeRequestDiscussionResponse> genForDeleteMergeRequestDiscussion() {
        // basic
        HttpRequestDef.Builder<DeleteMergeRequestDiscussionRequest, DeleteMergeRequestDiscussionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteMergeRequestDiscussionRequest.class,
                    DeleteMergeRequestDiscussionResponse.class)
                .withName("DeleteMergeRequestDiscussion")
                .withUri(
                    "/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/discussions/{discussion_id}/notes/{note_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteMergeRequestDiscussionRequest::getRepositoryId,
                DeleteMergeRequestDiscussionRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteMergeRequestDiscussionRequest::getMergeRequestIid,
                DeleteMergeRequestDiscussionRequest::setMergeRequestIid));
        builder.<String>withRequestField("discussion_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMergeRequestDiscussionRequest::getDiscussionId,
                DeleteMergeRequestDiscussionRequest::setDiscussionId));
        builder.<Integer>withRequestField("note_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteMergeRequestDiscussionRequest::getNoteId,
                DeleteMergeRequestDiscussionRequest::setNoteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommitDiscussionsRequest, ListCommitDiscussionsResponse> listCommitDiscussions =
        genForListCommitDiscussions();

    private static HttpRequestDef<ListCommitDiscussionsRequest, ListCommitDiscussionsResponse> genForListCommitDiscussions() {
        // basic
        HttpRequestDef.Builder<ListCommitDiscussionsRequest, ListCommitDiscussionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCommitDiscussionsRequest.class, ListCommitDiscussionsResponse.class)
            .withName("ListCommitDiscussions")
            .withUri("/v4/repositories/{repository_id}/commits/{sha}/discussions")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitDiscussionsRequest::getRepositoryId,
                ListCommitDiscussionsRequest::setRepositoryId));
        builder.<String>withRequestField("sha",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitDiscussionsRequest::getSha, ListCommitDiscussionsRequest::setSha));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitDiscussionsRequest::getSort, ListCommitDiscussionsRequest::setSort));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitDiscussionsRequest::getOffset, ListCommitDiscussionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitDiscussionsRequest::getLimit, ListCommitDiscussionsRequest::setLimit));

        // response
        builder.<List<CommitDiscussionDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCommitDiscussionsResponse::getBody, ListCommitDiscussionsResponse::setBody)
                .withInnerContainerType(CommitDiscussionDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListDefaultReviewCategoriesRequest, ListDefaultReviewCategoriesResponse> listDefaultReviewCategories =
        genForListDefaultReviewCategories();

    private static HttpRequestDef<ListDefaultReviewCategoriesRequest, ListDefaultReviewCategoriesResponse> genForListDefaultReviewCategories() {
        // basic
        HttpRequestDef.Builder<ListDefaultReviewCategoriesRequest, ListDefaultReviewCategoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDefaultReviewCategoriesRequest.class,
                    ListDefaultReviewCategoriesResponse.class)
                .withName("ListDefaultReviewCategories")
                .withUri("/v4/default-review-categories")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestDiscussionsRequest, ListMergeRequestDiscussionsResponse> listMergeRequestDiscussions =
        genForListMergeRequestDiscussions();

    private static HttpRequestDef<ListMergeRequestDiscussionsRequest, ListMergeRequestDiscussionsResponse> genForListMergeRequestDiscussions() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestDiscussionsRequest, ListMergeRequestDiscussionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestDiscussionsRequest.class,
                    ListMergeRequestDiscussionsResponse.class)
                .withName("ListMergeRequestDiscussions")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/discussions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestDiscussionsRequest::getRepositoryId,
                ListMergeRequestDiscussionsRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestDiscussionsRequest::getMergeRequestIid,
                ListMergeRequestDiscussionsRequest::setMergeRequestIid));
        builder.<String>withRequestField("unresolved",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestDiscussionsRequest::getUnresolved,
                ListMergeRequestDiscussionsRequest::setUnresolved));
        builder.<Integer>withRequestField("author_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestDiscussionsRequest::getAuthorId,
                ListMergeRequestDiscussionsRequest::setAuthorId));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestDiscussionsRequest::getSort,
                ListMergeRequestDiscussionsRequest::setSort));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestDiscussionsRequest::getOffset,
                ListMergeRequestDiscussionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestDiscussionsRequest::getLimit,
                ListMergeRequestDiscussionsRequest::setLimit));

        // response
        builder.<List<MergeRequestDiscussionDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListMergeRequestDiscussionsResponse::getBody,
                    ListMergeRequestDiscussionsResponse::setBody)
                .withInnerContainerType(MergeRequestDiscussionDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestSystemNotesRequest, ListMergeRequestSystemNotesResponse> listMergeRequestSystemNotes =
        genForListMergeRequestSystemNotes();

    private static HttpRequestDef<ListMergeRequestSystemNotesRequest, ListMergeRequestSystemNotesResponse> genForListMergeRequestSystemNotes() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestSystemNotesRequest, ListMergeRequestSystemNotesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestSystemNotesRequest.class,
                    ListMergeRequestSystemNotesResponse.class)
                .withName("ListMergeRequestSystemNotes")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/system-notes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestSystemNotesRequest::getRepositoryId,
                ListMergeRequestSystemNotesRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestSystemNotesRequest::getMergeRequestIid,
                ListMergeRequestSystemNotesRequest::setMergeRequestIid));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestSystemNotesRequest::getOffset,
                ListMergeRequestSystemNotesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestSystemNotesRequest::getLimit,
                ListMergeRequestSystemNotesRequest::setLimit));

        // response
        builder.<List<NoteDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListMergeRequestSystemNotesResponse::getBody,
                    ListMergeRequestSystemNotesResponse::setBody)
                .withInnerContainerType(NoteDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectNoteRequiredAttributesRequest, ListProjectNoteRequiredAttributesResponse> listProjectNoteRequiredAttributes =
        genForListProjectNoteRequiredAttributes();

    private static HttpRequestDef<ListProjectNoteRequiredAttributesRequest, ListProjectNoteRequiredAttributesResponse> genForListProjectNoteRequiredAttributes() {
        // basic
        HttpRequestDef.Builder<ListProjectNoteRequiredAttributesRequest, ListProjectNoteRequiredAttributesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectNoteRequiredAttributesRequest.class,
                    ListProjectNoteRequiredAttributesResponse.class)
                .withName("ListProjectNoteRequiredAttributes")
                .withUri("/v4/projects/{project_id}/setting/note-required-attributes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectNoteRequiredAttributesRequest::getProjectId,
                ListProjectNoteRequiredAttributesRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryReviewAuthorsRequest, ListRepositoryReviewAuthorsResponse> listRepositoryReviewAuthors =
        genForListRepositoryReviewAuthors();

    private static HttpRequestDef<ListRepositoryReviewAuthorsRequest, ListRepositoryReviewAuthorsResponse> genForListRepositoryReviewAuthors() {
        // basic
        HttpRequestDef.Builder<ListRepositoryReviewAuthorsRequest, ListRepositoryReviewAuthorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRepositoryReviewAuthorsRequest.class,
                    ListRepositoryReviewAuthorsResponse.class)
                .withName("ListRepositoryReviewAuthors")
                .withUri("/v4/repositories/{repository_id}/review-authors")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryReviewAuthorsRequest::getRepositoryId,
                ListRepositoryReviewAuthorsRequest::setRepositoryId));
        builder.<ListRepositoryReviewAuthorsRequest.NoteableTypeEnum>withRequestField("noteable_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRepositoryReviewAuthorsRequest.NoteableTypeEnum.class),
            f -> f.withMarshaller(ListRepositoryReviewAuthorsRequest::getNoteableType,
                ListRepositoryReviewAuthorsRequest::setNoteableType));
        builder.<ListRepositoryReviewAuthorsRequest.ResolvedStatusEnum>withRequestField("resolved_status",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRepositoryReviewAuthorsRequest.ResolvedStatusEnum.class),
            f -> f.withMarshaller(ListRepositoryReviewAuthorsRequest::getResolvedStatus,
                ListRepositoryReviewAuthorsRequest::setResolvedStatus));
        builder.<String>withRequestField("reviewers_filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryReviewAuthorsRequest::getReviewersFilter,
                ListRepositoryReviewAuthorsRequest::setReviewersFilter));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryReviewAuthorsRequest::getOffset,
                ListRepositoryReviewAuthorsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryReviewAuthorsRequest::getLimit,
                ListRepositoryReviewAuthorsRequest::setLimit));

        // response
        builder.<List<UserBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListRepositoryReviewAuthorsResponse::getBody,
                    ListRepositoryReviewAuthorsResponse::setBody)
                .withInnerContainerType(UserBasicDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryReviewsRequest, ListRepositoryReviewsResponse> listRepositoryReviews =
        genForListRepositoryReviews();

    private static HttpRequestDef<ListRepositoryReviewsRequest, ListRepositoryReviewsResponse> genForListRepositoryReviews() {
        // basic
        HttpRequestDef.Builder<ListRepositoryReviewsRequest, ListRepositoryReviewsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRepositoryReviewsRequest.class, ListRepositoryReviewsResponse.class)
            .withName("ListRepositoryReviews")
            .withUri("/v4/repositories/{repository_id}/reviews")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getRepositoryId,
                ListRepositoryReviewsRequest::setRepositoryId));
        builder.<ListRepositoryReviewsRequest.NoteableTypeEnum>withRequestField("noteable_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRepositoryReviewsRequest.NoteableTypeEnum.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getNoteableType,
                ListRepositoryReviewsRequest::setNoteableType));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getSearch, ListRepositoryReviewsRequest::setSearch));
        builder.<OffsetDateTime>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getStartDate,
                ListRepositoryReviewsRequest::setStartDate));
        builder.<OffsetDateTime>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getEndDate, ListRepositoryReviewsRequest::setEndDate));
        builder.<Boolean>withRequestField("only_count",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getOnlyCount,
                ListRepositoryReviewsRequest::setOnlyCount));
        builder.<String>withRequestField("review_categories",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getReviewCategories,
                ListRepositoryReviewsRequest::setReviewCategories));
        builder.<String>withRequestField("review_modules",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getReviewModules,
                ListRepositoryReviewsRequest::setReviewModules));
        builder.<ListRepositoryReviewsRequest.SeverityEnum>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryReviewsRequest.SeverityEnum.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getSeverity,
                ListRepositoryReviewsRequest::setSeverity));
        builder.<Integer>withRequestField("assignee_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getAssigneeId,
                ListRepositoryReviewsRequest::setAssigneeId));
        builder.<Integer>withRequestField("proposer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getProposerId,
                ListRepositoryReviewsRequest::setProposerId));
        builder.<String>withRequestField("target_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getTargetBranch,
                ListRepositoryReviewsRequest::setTargetBranch));
        builder.<Boolean>withRequestField("include_reply",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getIncludeReply,
                ListRepositoryReviewsRequest::setIncludeReply));
        builder.<ListRepositoryReviewsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryReviewsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getOrderBy, ListRepositoryReviewsRequest::setOrderBy));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getSort, ListRepositoryReviewsRequest::setSort));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getOffset, ListRepositoryReviewsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryReviewsRequest::getLimit, ListRepositoryReviewsRequest::setLimit));

        // response
        builder.<List<ReviewDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepositoryReviewsResponse::getBody, ListRepositoryReviewsResponse::setBody)
                .withInnerContainerType(ReviewDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupNoteRequiredAttributesRequest, ShowGroupNoteRequiredAttributesResponse> showGroupNoteRequiredAttributes =
        genForShowGroupNoteRequiredAttributes();

    private static HttpRequestDef<ShowGroupNoteRequiredAttributesRequest, ShowGroupNoteRequiredAttributesResponse> genForShowGroupNoteRequiredAttributes() {
        // basic
        HttpRequestDef.Builder<ShowGroupNoteRequiredAttributesRequest, ShowGroupNoteRequiredAttributesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGroupNoteRequiredAttributesRequest.class,
                    ShowGroupNoteRequiredAttributesResponse.class)
                .withName("ShowGroupNoteRequiredAttributes")
                .withUri("/v4/groups/{group_id}/setting/note-required-attributes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupNoteRequiredAttributesRequest::getGroupId,
                ShowGroupNoteRequiredAttributesRequest::setGroupId));

        // response
        builder.<List<NoteRequiredAttributeDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowGroupNoteRequiredAttributesResponse::getBody,
                    ShowGroupNoteRequiredAttributesResponse::setBody)
                .withInnerContainerType(NoteRequiredAttributeDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupReviewSettingsRequest, ShowGroupReviewSettingsResponse> showGroupReviewSettings =
        genForShowGroupReviewSettings();

    private static HttpRequestDef<ShowGroupReviewSettingsRequest, ShowGroupReviewSettingsResponse> genForShowGroupReviewSettings() {
        // basic
        HttpRequestDef.Builder<ShowGroupReviewSettingsRequest, ShowGroupReviewSettingsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGroupReviewSettingsRequest.class, ShowGroupReviewSettingsResponse.class)
            .withName("ShowGroupReviewSettings")
            .withUri("/v4/groups/{group_id}/review-settings")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupReviewSettingsRequest::getGroupId,
                ShowGroupReviewSettingsRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeRequestDiscussionRequest, ShowMergeRequestDiscussionResponse> showMergeRequestDiscussion =
        genForShowMergeRequestDiscussion();

    private static HttpRequestDef<ShowMergeRequestDiscussionRequest, ShowMergeRequestDiscussionResponse> genForShowMergeRequestDiscussion() {
        // basic
        HttpRequestDef.Builder<ShowMergeRequestDiscussionRequest, ShowMergeRequestDiscussionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMergeRequestDiscussionRequest.class,
                    ShowMergeRequestDiscussionResponse.class)
                .withName("ShowMergeRequestDiscussion")
                .withUri(
                    "/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/discussions/{discussion_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestDiscussionRequest::getRepositoryId,
                ShowMergeRequestDiscussionRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestDiscussionRequest::getMergeRequestIid,
                ShowMergeRequestDiscussionRequest::setMergeRequestIid));
        builder.<String>withRequestField("discussion_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMergeRequestDiscussionRequest::getDiscussionId,
                ShowMergeRequestDiscussionRequest::setDiscussionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNoteRequiredAttributesRequest, ShowNoteRequiredAttributesResponse> showNoteRequiredAttributes =
        genForShowNoteRequiredAttributes();

    private static HttpRequestDef<ShowNoteRequiredAttributesRequest, ShowNoteRequiredAttributesResponse> genForShowNoteRequiredAttributes() {
        // basic
        HttpRequestDef.Builder<ShowNoteRequiredAttributesRequest, ShowNoteRequiredAttributesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowNoteRequiredAttributesRequest.class,
                    ShowNoteRequiredAttributesResponse.class)
                .withName("ShowNoteRequiredAttributes")
                .withUri("/v4/repositories/{repository_id}/setting/note-required-attributes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowNoteRequiredAttributesRequest::getRepositoryId,
                ShowNoteRequiredAttributesRequest::setRepositoryId));

        // response
        builder.<List<NoteRequiredAttributeDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowNoteRequiredAttributesResponse::getBody,
                    ShowNoteRequiredAttributesResponse::setBody)
                .withInnerContainerType(NoteRequiredAttributeDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectReviewSettingsRequest, ShowProjectReviewSettingsResponse> showProjectReviewSettings =
        genForShowProjectReviewSettings();

    private static HttpRequestDef<ShowProjectReviewSettingsRequest, ShowProjectReviewSettingsResponse> genForShowProjectReviewSettings() {
        // basic
        HttpRequestDef.Builder<ShowProjectReviewSettingsRequest, ShowProjectReviewSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProjectReviewSettingsRequest.class,
                    ShowProjectReviewSettingsResponse.class)
                .withName("ShowProjectReviewSettings")
                .withUri("/v4/projects/{project_id}/review-settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectReviewSettingsRequest::getProjectId,
                ShowProjectReviewSettingsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReviewSettingRequest, ShowReviewSettingResponse> showReviewSetting =
        genForShowReviewSetting();

    private static HttpRequestDef<ShowReviewSettingRequest, ShowReviewSettingResponse> genForShowReviewSetting() {
        // basic
        HttpRequestDef.Builder<ShowReviewSettingRequest, ShowReviewSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReviewSettingRequest.class, ShowReviewSettingResponse.class)
                .withName("ShowReviewSetting")
                .withUri("/v4/repositories/{repository_id}/review-setting")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReviewSettingRequest::getRepositoryId,
                ShowReviewSettingRequest::setRepositoryId));
        builder.<Boolean>withRequestField("with_default_review_categories",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowReviewSettingRequest::getWithDefaultReviewCategories,
                ShowReviewSettingRequest::setWithDefaultReviewCategories));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupNoteRequiredAttributesRequest, UpdateGroupNoteRequiredAttributesResponse> updateGroupNoteRequiredAttributes =
        genForUpdateGroupNoteRequiredAttributes();

    private static HttpRequestDef<UpdateGroupNoteRequiredAttributesRequest, UpdateGroupNoteRequiredAttributesResponse> genForUpdateGroupNoteRequiredAttributes() {
        // basic
        HttpRequestDef.Builder<UpdateGroupNoteRequiredAttributesRequest, UpdateGroupNoteRequiredAttributesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateGroupNoteRequiredAttributesRequest.class,
                    UpdateGroupNoteRequiredAttributesResponse.class)
                .withName("UpdateGroupNoteRequiredAttributes")
                .withUri("/v4/groups/{group_id}/setting/note-required-attributes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateGroupNoteRequiredAttributesRequest::getGroupId,
                UpdateGroupNoteRequiredAttributesRequest::setGroupId));
        builder.<PostNoteRequiredAttributeDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostNoteRequiredAttributeDto.class),
            f -> f.withMarshaller(UpdateGroupNoteRequiredAttributesRequest::getBody,
                UpdateGroupNoteRequiredAttributesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupReviewSettingsRequest, UpdateGroupReviewSettingsResponse> updateGroupReviewSettings =
        genForUpdateGroupReviewSettings();

    private static HttpRequestDef<UpdateGroupReviewSettingsRequest, UpdateGroupReviewSettingsResponse> genForUpdateGroupReviewSettings() {
        // basic
        HttpRequestDef.Builder<UpdateGroupReviewSettingsRequest, UpdateGroupReviewSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateGroupReviewSettingsRequest.class,
                    UpdateGroupReviewSettingsResponse.class)
                .withName("UpdateGroupReviewSettings")
                .withUri("/v4/groups/{group_id}/review-settings")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateGroupReviewSettingsRequest::getGroupId,
                UpdateGroupReviewSettingsRequest::setGroupId));
        builder.<ReviewSettingParamDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReviewSettingParamDto.class),
            f -> f.withMarshaller(UpdateGroupReviewSettingsRequest::getBody,
                UpdateGroupReviewSettingsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMergeRequestDiscussionRequest, UpdateMergeRequestDiscussionResponse> updateMergeRequestDiscussion =
        genForUpdateMergeRequestDiscussion();

    private static HttpRequestDef<UpdateMergeRequestDiscussionRequest, UpdateMergeRequestDiscussionResponse> genForUpdateMergeRequestDiscussion() {
        // basic
        HttpRequestDef.Builder<UpdateMergeRequestDiscussionRequest, UpdateMergeRequestDiscussionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateMergeRequestDiscussionRequest.class,
                    UpdateMergeRequestDiscussionResponse.class)
                .withName("UpdateMergeRequestDiscussion")
                .withUri(
                    "/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/discussions/{discussion_id}/notes/{note_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestDiscussionRequest::getRepositoryId,
                UpdateMergeRequestDiscussionRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestDiscussionRequest::getMergeRequestIid,
                UpdateMergeRequestDiscussionRequest::setMergeRequestIid));
        builder.<String>withRequestField("discussion_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMergeRequestDiscussionRequest::getDiscussionId,
                UpdateMergeRequestDiscussionRequest::setDiscussionId));
        builder.<Integer>withRequestField("note_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestDiscussionRequest::getNoteId,
                UpdateMergeRequestDiscussionRequest::setNoteId));
        builder.<UpdateMergeRequestNoteDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMergeRequestNoteDto.class),
            f -> f.withMarshaller(UpdateMergeRequestDiscussionRequest::getBody,
                UpdateMergeRequestDiscussionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMergeRequestDiscussionInfoRequest, UpdateMergeRequestDiscussionInfoResponse> updateMergeRequestDiscussionInfo =
        genForUpdateMergeRequestDiscussionInfo();

    private static HttpRequestDef<UpdateMergeRequestDiscussionInfoRequest, UpdateMergeRequestDiscussionInfoResponse> genForUpdateMergeRequestDiscussionInfo() {
        // basic
        HttpRequestDef.Builder<UpdateMergeRequestDiscussionInfoRequest, UpdateMergeRequestDiscussionInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateMergeRequestDiscussionInfoRequest.class,
                    UpdateMergeRequestDiscussionInfoResponse.class)
                .withName("UpdateMergeRequestDiscussionInfo")
                .withUri(
                    "/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/discussions/{discussion_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestDiscussionInfoRequest::getRepositoryId,
                UpdateMergeRequestDiscussionInfoRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestDiscussionInfoRequest::getMergeRequestIid,
                UpdateMergeRequestDiscussionInfoRequest::setMergeRequestIid));
        builder.<String>withRequestField("discussion_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMergeRequestDiscussionInfoRequest::getDiscussionId,
                UpdateMergeRequestDiscussionInfoRequest::setDiscussionId));
        builder.<UpdateMergeRequestNoteDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMergeRequestNoteDto.class),
            f -> f.withMarshaller(UpdateMergeRequestDiscussionInfoRequest::getBody,
                UpdateMergeRequestDiscussionInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNoteRequiredAttributesRequest, UpdateNoteRequiredAttributesResponse> updateNoteRequiredAttributes =
        genForUpdateNoteRequiredAttributes();

    private static HttpRequestDef<UpdateNoteRequiredAttributesRequest, UpdateNoteRequiredAttributesResponse> genForUpdateNoteRequiredAttributes() {
        // basic
        HttpRequestDef.Builder<UpdateNoteRequiredAttributesRequest, UpdateNoteRequiredAttributesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateNoteRequiredAttributesRequest.class,
                    UpdateNoteRequiredAttributesResponse.class)
                .withName("UpdateNoteRequiredAttributes")
                .withUri("/v4/repositories/{repository_id}/setting/note-required-attributes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateNoteRequiredAttributesRequest::getRepositoryId,
                UpdateNoteRequiredAttributesRequest::setRepositoryId));
        builder.<PostNoteRequiredAttributeDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostNoteRequiredAttributeDto.class),
            f -> f.withMarshaller(UpdateNoteRequiredAttributesRequest::getBody,
                UpdateNoteRequiredAttributesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectNoteRequiredAttributesRequest, UpdateProjectNoteRequiredAttributesResponse> updateProjectNoteRequiredAttributes =
        genForUpdateProjectNoteRequiredAttributes();

    private static HttpRequestDef<UpdateProjectNoteRequiredAttributesRequest, UpdateProjectNoteRequiredAttributesResponse> genForUpdateProjectNoteRequiredAttributes() {
        // basic
        HttpRequestDef.Builder<UpdateProjectNoteRequiredAttributesRequest, UpdateProjectNoteRequiredAttributesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateProjectNoteRequiredAttributesRequest.class,
                    UpdateProjectNoteRequiredAttributesResponse.class)
                .withName("UpdateProjectNoteRequiredAttributes")
                .withUri("/v4/projects/{project_id}/setting/note-required-attributes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectNoteRequiredAttributesRequest::getProjectId,
                UpdateProjectNoteRequiredAttributesRequest::setProjectId));
        builder.<PostNoteRequiredAttributeDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostNoteRequiredAttributeDto.class),
            f -> f.withMarshaller(UpdateProjectNoteRequiredAttributesRequest::getBody,
                UpdateProjectNoteRequiredAttributesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectReviewSettingsRequest, UpdateProjectReviewSettingsResponse> updateProjectReviewSettings =
        genForUpdateProjectReviewSettings();

    private static HttpRequestDef<UpdateProjectReviewSettingsRequest, UpdateProjectReviewSettingsResponse> genForUpdateProjectReviewSettings() {
        // basic
        HttpRequestDef.Builder<UpdateProjectReviewSettingsRequest, UpdateProjectReviewSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateProjectReviewSettingsRequest.class,
                    UpdateProjectReviewSettingsResponse.class)
                .withName("UpdateProjectReviewSettings")
                .withUri("/v4/projects/{project_id}/review-settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectReviewSettingsRequest::getProjectId,
                UpdateProjectReviewSettingsRequest::setProjectId));
        builder.<ReviewSettingParamDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReviewSettingParamDto.class),
            f -> f.withMarshaller(UpdateProjectReviewSettingsRequest::getBody,
                UpdateProjectReviewSettingsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFileRequest, CreateFileResponse> createFile = genForCreateFile();

    private static HttpRequestDef<CreateFileRequest, CreateFileResponse> genForCreateFile() {
        // basic
        HttpRequestDef.Builder<CreateFileRequest, CreateFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFileRequest.class, CreateFileResponse.class)
                .withName("CreateFile")
                .withUri("/v4/repositories/{repository_id}/repository/files")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateFileRequest::getRepositoryId, CreateFileRequest::setRepositoryId));
        builder.<FileBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FileBodyDto.class),
            f -> f.withMarshaller(CreateFileRequest::getBody, CreateFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFileRequest, DeleteFileResponse> deleteFile = genForDeleteFile();

    private static HttpRequestDef<DeleteFileRequest, DeleteFileResponse> genForDeleteFile() {
        // basic
        HttpRequestDef.Builder<DeleteFileRequest, DeleteFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFileRequest.class, DeleteFileResponse.class)
                .withName("DeleteFile")
                .withUri("/v4/repositories/{repository_id}/repository/file")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteFileRequest::getRepositoryId, DeleteFileRequest::setRepositoryId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getFilePath, DeleteFileRequest::setFilePath));
        builder.<String>withRequestField("author_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getAuthorName, DeleteFileRequest::setAuthorName));
        builder.<String>withRequestField("branch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getBranch, DeleteFileRequest::setBranch));
        builder.<String>withRequestField("commit_message",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getCommitMessage, DeleteFileRequest::setCommitMessage));
        builder.<String>withRequestField("author_email",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getAuthorEmail, DeleteFileRequest::setAuthorEmail));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBlobsRawRequest, DownloadBlobsRawResponse> downloadBlobsRaw =
        genForDownloadBlobsRaw();

    private static HttpRequestDef<DownloadBlobsRawRequest, DownloadBlobsRawResponse> genForDownloadBlobsRaw() {
        // basic
        HttpRequestDef.Builder<DownloadBlobsRawRequest, DownloadBlobsRawResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadBlobsRawRequest.class, DownloadBlobsRawResponse.class)
                .withName("DownloadBlobsRaw")
                .withUri("/v4/repositories/{repository_id}/repository/blobs/{blob_id}/raw")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadBlobsRawRequest::getRepositoryId, DownloadBlobsRawRequest::setRepositoryId));
        builder.<String>withRequestField("blob_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBlobsRawRequest::getBlobId, DownloadBlobsRawRequest::setBlobId));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBlobsRawRequest::getFileName, DownloadBlobsRawRequest::setFileName));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBlobsRawRequest::getFilePath, DownloadBlobsRawRequest::setFilePath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFileBlameLinesRequest, ListFileBlameLinesResponse> listFileBlameLines =
        genForListFileBlameLines();

    private static HttpRequestDef<ListFileBlameLinesRequest, ListFileBlameLinesResponse> genForListFileBlameLines() {
        // basic
        HttpRequestDef.Builder<ListFileBlameLinesRequest, ListFileBlameLinesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFileBlameLinesRequest.class, ListFileBlameLinesResponse.class)
                .withName("ListFileBlameLines")
                .withUri("/v4/repositories/{repository_id}/repository/blame")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFileBlameLinesRequest::getRepositoryId,
                ListFileBlameLinesRequest::setRepositoryId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileBlameLinesRequest::getFilePath, ListFileBlameLinesRequest::setFilePath));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileBlameLinesRequest::getSha, ListFileBlameLinesRequest::setSha));

        // response
        builder.<List<BlameDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFileBlameLinesResponse::getBody, ListFileBlameLinesResponse::setBody)
                .withInnerContainerType(BlameDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListFileUpperTreeEntriesRequest, ListFileUpperTreeEntriesResponse> listFileUpperTreeEntries =
        genForListFileUpperTreeEntries();

    private static HttpRequestDef<ListFileUpperTreeEntriesRequest, ListFileUpperTreeEntriesResponse> genForListFileUpperTreeEntries() {
        // basic
        HttpRequestDef.Builder<ListFileUpperTreeEntriesRequest, ListFileUpperTreeEntriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListFileUpperTreeEntriesRequest.class, ListFileUpperTreeEntriesResponse.class)
                .withName("ListFileUpperTreeEntries")
                .withUri("/v4/repositories/{repository_id}/repository/upper-files-tree")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFileUpperTreeEntriesRequest::getRepositoryId,
                ListFileUpperTreeEntriesRequest::setRepositoryId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileUpperTreeEntriesRequest::getFilePath,
                ListFileUpperTreeEntriesRequest::setFilePath));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileUpperTreeEntriesRequest::getRefName,
                ListFileUpperTreeEntriesRequest::setRefName));

        // response
        builder.<List<TreeDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFileUpperTreeEntriesResponse::getBody, ListFileUpperTreeEntriesResponse::setBody)
                .withInnerContainerType(TreeDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListFilesRequest, ListFilesResponse> listFiles = genForListFiles();

    private static HttpRequestDef<ListFilesRequest, ListFilesResponse> genForListFiles() {
        // basic
        HttpRequestDef.Builder<ListFilesRequest, ListFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFilesRequest.class, ListFilesResponse.class)
                .withName("ListFiles")
                .withUri("/v4/repositories/{repository_id}/repository/file-list")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFilesRequest::getRepositoryId, ListFilesRequest::setRepositoryId));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFilesRequest::getRefName, ListFilesRequest::setRefName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFilesRequest::getOffset, ListFilesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFilesRequest::getLimit, ListFilesRequest::setLimit));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFilesResponse::getBody, ListFilesResponse::setBody)
                .withInnerContainerType(String.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFilesResponse::getXTotal, ListFilesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListLogsTreeRequest, ListLogsTreeResponse> listLogsTree = genForListLogsTree();

    private static HttpRequestDef<ListLogsTreeRequest, ListLogsTreeResponse> genForListLogsTree() {
        // basic
        HttpRequestDef.Builder<ListLogsTreeRequest, ListLogsTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogsTreeRequest.class, ListLogsTreeResponse.class)
                .withName("ListLogsTree")
                .withUri("/v4/repositories/{repository_id}/repository/logs-tree")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogsTreeRequest::getRepositoryId, ListLogsTreeRequest::setRepositoryId));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogsTreeRequest::getRef, ListLogsTreeRequest::setRef));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogsTreeRequest::getOffset, ListLogsTreeRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogsTreeRequest::getLimit, ListLogsTreeRequest::setLimit));

        // response
        builder.<List<LogTreeDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogsTreeResponse::getBody, ListLogsTreeResponse::setBody)
                .withInnerContainerType(LogTreeDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTreesRequest, ListTreesResponse> listTrees = genForListTrees();

    private static HttpRequestDef<ListTreesRequest, ListTreesResponse> genForListTrees() {
        // basic
        HttpRequestDef.Builder<ListTreesRequest, ListTreesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTreesRequest.class, ListTreesResponse.class)
                .withName("ListTrees")
                .withUri("/v4/repositories/{repository_id}/repository/trees")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTreesRequest::getRepositoryId, ListTreesRequest::setRepositoryId));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTreesRequest::getRef, ListTreesRequest::setRef));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTreesRequest::getPath, ListTreesRequest::setPath));
        builder.<Boolean>withRequestField("recursive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTreesRequest::getRecursive, ListTreesRequest::setRecursive));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTreesRequest::getOffset, ListTreesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTreesRequest::getLimit, ListTreesRequest::setLimit));

        // response
        builder.<List<TreeObjectDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTreesResponse::getBody, ListTreesResponse::setBody)
                .withInnerContainerType(TreeObjectDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTreesResponse::getXTotal, ListTreesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<RenameFileRequest, RenameFileResponse> renameFile = genForRenameFile();

    private static HttpRequestDef<RenameFileRequest, RenameFileResponse> genForRenameFile() {
        // basic
        HttpRequestDef.Builder<RenameFileRequest, RenameFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RenameFileRequest.class, RenameFileResponse.class)
                .withName("RenameFile")
                .withUri("/v4/repositories/{repository_id}/repository/rename-file")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RenameFileRequest::getRepositoryId, RenameFileRequest::setRepositoryId));
        builder.<RenameFileBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RenameFileBodyDto.class),
            f -> f.withMarshaller(RenameFileRequest::getBody, RenameFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileRequest, ShowFileResponse> showFile = genForShowFile();

    private static HttpRequestDef<ShowFileRequest, ShowFileResponse> genForShowFile() {
        // basic
        HttpRequestDef.Builder<ShowFileRequest, ShowFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFileRequest.class, ShowFileResponse.class)
                .withName("ShowFile")
                .withUri("/v4/repositories/{repository_id}/repository/file")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFileRequest::getRepositoryId, ShowFileRequest::setRepositoryId));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileRequest::getRef, ShowFileRequest::setRef));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileRequest::getFilePath, ShowFileRequest::setFilePath));

        // response

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowFileResponse::getXTotal, ShowFileResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ShowFileContentRequest, ShowFileContentResponse> showFileContent =
        genForShowFileContent();

    private static HttpRequestDef<ShowFileContentRequest, ShowFileContentResponse> genForShowFileContent() {
        // basic
        HttpRequestDef.Builder<ShowFileContentRequest, ShowFileContentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFileContentRequest.class, ShowFileContentResponse.class)
                .withName("ShowFileContent")
                .withUri("/v4/repositories/{repository_id}/repository/file-content")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFileContentRequest::getRepositoryId, ShowFileContentRequest::setRepositoryId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileContentRequest::getFilePath, ShowFileContentRequest::setFilePath));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileContentRequest::getSha, ShowFileContentRequest::setSha));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileRawRequest, ShowFileRawResponse> showFileRaw = genForShowFileRaw();

    private static HttpRequestDef<ShowFileRawRequest, ShowFileRawResponse> genForShowFileRaw() {
        // basic
        HttpRequestDef.Builder<ShowFileRawRequest, ShowFileRawResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFileRawRequest.class, ShowFileRawResponse.class)
                .withName("ShowFileRaw")
                .withUri("/v4/repositories/{repository_id}/repository/files/raw")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFileRawRequest::getRepositoryId, ShowFileRawRequest::setRepositoryId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileRawRequest::getFilePath, ShowFileRawRequest::setFilePath));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileRawRequest::getRef, ShowFileRawRequest::setRef));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReadmeFileRequest, ShowReadmeFileResponse> showReadmeFile =
        genForShowReadmeFile();

    private static HttpRequestDef<ShowReadmeFileRequest, ShowReadmeFileResponse> genForShowReadmeFile() {
        // basic
        HttpRequestDef.Builder<ShowReadmeFileRequest, ShowReadmeFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReadmeFileRequest.class, ShowReadmeFileResponse.class)
                .withName("ShowReadmeFile")
                .withUri("/v4/repositories/{repository_id}/repository/readme-file")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReadmeFileRequest::getRepositoryId, ShowReadmeFileRequest::setRepositoryId));

        // response

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowReadmeFileResponse::getXTotal, ShowReadmeFileResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateFileRequest, UpdateFileResponse> updateFile = genForUpdateFile();

    private static HttpRequestDef<UpdateFileRequest, UpdateFileResponse> genForUpdateFile() {
        // basic
        HttpRequestDef.Builder<UpdateFileRequest, UpdateFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFileRequest.class, UpdateFileResponse.class)
                .withName("UpdateFile")
                .withUri("/v4/repositories/{repository_id}/repository/file")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateFileRequest::getRepositoryId, UpdateFileRequest::setRepositoryId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFileRequest::getFilePath, UpdateFileRequest::setFilePath));
        builder.<UpdateFileBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateFileBodyDto.class),
            f -> f.withMarshaller(UpdateFileRequest::getBody, UpdateFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse> associateGroupUserGroup =
        genForAssociateGroupUserGroup();

    private static HttpRequestDef<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse> genForAssociateGroupUserGroup() {
        // basic
        HttpRequestDef.Builder<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateGroupUserGroupRequest.class, AssociateGroupUserGroupResponse.class)
            .withName("AssociateGroupUserGroup")
            .withUri("/v4/{project_id}/groups/{group_id}/user-group/{user_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateGroupUserGroupRequest::getProjectId,
                AssociateGroupUserGroupRequest::setProjectId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AssociateGroupUserGroupRequest::getGroupId,
                AssociateGroupUserGroupRequest::setGroupId));
        builder.<String>withRequestField("user_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateGroupUserGroupRequest::getUserGroupId,
                AssociateGroupUserGroupRequest::setUserGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGroupRequest, CreateGroupResponse> createGroup = genForCreateGroup();

    private static HttpRequestDef<CreateGroupRequest, CreateGroupResponse> genForCreateGroup() {
        // basic
        HttpRequestDef.Builder<CreateGroupRequest, CreateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGroupRequest.class, CreateGroupResponse.class)
                .withName("CreateGroup")
                .withUri("/v4/{project_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGroupRequest::getProjectId, CreateGroupRequest::setProjectId));
        builder.<CreateGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateGroupRequestBody.class),
            f -> f.withMarshaller(CreateGroupRequest::getBody, CreateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> deleteGroup = genForDeleteGroup();

    private static HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> genForDeleteGroup() {
        // basic
        HttpRequestDef.Builder<DeleteGroupRequest, DeleteGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGroupRequest.class, DeleteGroupResponse.class)
                .withName("DeleteGroup")
                .withUri("/v4/{project_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getProjectId, DeleteGroupRequest::setProjectId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteGroupRequest::getGroupId, DeleteGroupRequest::setGroupId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteGroupResponse::getBody, DeleteGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupAddableMembersRequest, ListGroupAddableMembersResponse> listGroupAddableMembers =
        genForListGroupAddableMembers();

    private static HttpRequestDef<ListGroupAddableMembersRequest, ListGroupAddableMembersResponse> genForListGroupAddableMembers() {
        // basic
        HttpRequestDef.Builder<ListGroupAddableMembersRequest, ListGroupAddableMembersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGroupAddableMembersRequest.class, ListGroupAddableMembersResponse.class)
            .withName("ListGroupAddableMembers")
            .withUri("/v4/groups/{group_id}/members/addable-list")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupAddableMembersRequest::getGroupId,
                ListGroupAddableMembersRequest::setGroupId));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupAddableMembersRequest::getProjectId,
                ListGroupAddableMembersRequest::setProjectId));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupAddableMembersRequest::getSearch,
                ListGroupAddableMembersRequest::setSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupAddableMembersRequest::getOffset,
                ListGroupAddableMembersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupAddableMembersRequest::getLimit, ListGroupAddableMembersRequest::setLimit));

        // response
        builder.<List<GroupBatchAddMemberDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGroupAddableMembersResponse::getBody, ListGroupAddableMembersResponse::setBody)
                .withInnerContainerType(GroupBatchAddMemberDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupAddableUserGroupsRequest, ListGroupAddableUserGroupsResponse> listGroupAddableUserGroups =
        genForListGroupAddableUserGroups();

    private static HttpRequestDef<ListGroupAddableUserGroupsRequest, ListGroupAddableUserGroupsResponse> genForListGroupAddableUserGroups() {
        // basic
        HttpRequestDef.Builder<ListGroupAddableUserGroupsRequest, ListGroupAddableUserGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGroupAddableUserGroupsRequest.class,
                    ListGroupAddableUserGroupsResponse.class)
                .withName("ListGroupAddableUserGroups")
                .withUri("/v4/groups/{group_id}/user-groups/addable-list")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupAddableUserGroupsRequest::getGroupId,
                ListGroupAddableUserGroupsRequest::setGroupId));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupAddableUserGroupsRequest::getProjectId,
                ListGroupAddableUserGroupsRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupAddableUserGroupsRequest::getOffset,
                ListGroupAddableUserGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupAddableUserGroupsRequest::getLimit,
                ListGroupAddableUserGroupsRequest::setLimit));

        // response
        builder.<List<UserGroupDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListGroupAddableUserGroupsResponse::getBody,
                    ListGroupAddableUserGroupsResponse::setBody)
                .withInnerContainerType(UserGroupDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupMembersRequest, ListGroupMembersResponse> listGroupMembers =
        genForListGroupMembers();

    private static HttpRequestDef<ListGroupMembersRequest, ListGroupMembersResponse> genForListGroupMembers() {
        // basic
        HttpRequestDef.Builder<ListGroupMembersRequest, ListGroupMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupMembersRequest.class, ListGroupMembersResponse.class)
                .withName("ListGroupMembers")
                .withUri("/v4/groups/{group_id}/members/list")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMembersRequest::getGroupId, ListGroupMembersRequest::setGroupId));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupMembersRequest::getProjectId, ListGroupMembersRequest::setProjectId));
        builder.<String>withRequestField("query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupMembersRequest::getQuery, ListGroupMembersRequest::setQuery));
        builder.<ListGroupMembersRequest.JoinWayEnum>withRequestField("join_way",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGroupMembersRequest.JoinWayEnum.class),
            f -> f.withMarshaller(ListGroupMembersRequest::getJoinWay, ListGroupMembersRequest::setJoinWay));
        builder.<Integer>withRequestField("access_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMembersRequest::getAccessLevel, ListGroupMembersRequest::setAccessLevel));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMembersRequest::getOffset, ListGroupMembersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMembersRequest::getLimit, ListGroupMembersRequest::setLimit));

        // response
        builder.<List<GroupMemberDetailDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGroupMembersResponse::getBody, ListGroupMembersResponse::setBody)
                .withInnerContainerType(GroupMemberDetailDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupPermissionResourcesRequest, ListGroupPermissionResourcesResponse> listGroupPermissionResources =
        genForListGroupPermissionResources();

    private static HttpRequestDef<ListGroupPermissionResourcesRequest, ListGroupPermissionResourcesResponse> genForListGroupPermissionResources() {
        // basic
        HttpRequestDef.Builder<ListGroupPermissionResourcesRequest, ListGroupPermissionResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGroupPermissionResourcesRequest.class,
                    ListGroupPermissionResourcesResponse.class)
                .withName("ListGroupPermissionResources")
                .withUri("/v4/groups/permissions/resources")
                .withContentType("application/json");

        // requests
        builder.<ListGroupPermissionResourcesRequest.ScopeEnum>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGroupPermissionResourcesRequest.ScopeEnum.class),
            f -> f.withMarshaller(ListGroupPermissionResourcesRequest::getScope,
                ListGroupPermissionResourcesRequest::setScope));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupSubgroupsAndRepositoriesRequest, ListGroupSubgroupsAndRepositoriesResponse> listGroupSubgroupsAndRepositories =
        genForListGroupSubgroupsAndRepositories();

    private static HttpRequestDef<ListGroupSubgroupsAndRepositoriesRequest, ListGroupSubgroupsAndRepositoriesResponse> genForListGroupSubgroupsAndRepositories() {
        // basic
        HttpRequestDef.Builder<ListGroupSubgroupsAndRepositoriesRequest, ListGroupSubgroupsAndRepositoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGroupSubgroupsAndRepositoriesRequest.class,
                    ListGroupSubgroupsAndRepositoriesResponse.class)
                .withName("ListGroupSubgroupsAndRepositories")
                .withUri("/v4/groups/{group_id}/subgroups-and-repositories")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupSubgroupsAndRepositoriesRequest::getGroupId,
                ListGroupSubgroupsAndRepositoriesRequest::setGroupId));
        builder.<Integer>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupSubgroupsAndRepositoriesRequest::getFilter,
                ListGroupSubgroupsAndRepositoriesRequest::setFilter));
        builder.<ListGroupSubgroupsAndRepositoriesRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGroupSubgroupsAndRepositoriesRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListGroupSubgroupsAndRepositoriesRequest::getOrderBy,
                ListGroupSubgroupsAndRepositoriesRequest::setOrderBy));
        builder.<ListGroupSubgroupsAndRepositoriesRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGroupSubgroupsAndRepositoriesRequest.SortEnum.class),
            f -> f.withMarshaller(ListGroupSubgroupsAndRepositoriesRequest::getSort,
                ListGroupSubgroupsAndRepositoriesRequest::setSort));
        builder.<Boolean>withRequestField("archived",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListGroupSubgroupsAndRepositoriesRequest::getArchived,
                ListGroupSubgroupsAndRepositoriesRequest::setArchived));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupSubgroupsAndRepositoriesRequest::getOffset,
                ListGroupSubgroupsAndRepositoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupSubgroupsAndRepositoriesRequest::getLimit,
                ListGroupSubgroupsAndRepositoriesRequest::setLimit));

        // response
        builder.<List<SubgroupAndProjectBaseDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListGroupSubgroupsAndRepositoriesResponse::getBody,
                    ListGroupSubgroupsAndRepositoriesResponse::setBody)
                .withInnerContainerType(SubgroupAndProjectBaseDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupUserGroupsRequest, ListGroupUserGroupsResponse> listGroupUserGroups =
        genForListGroupUserGroups();

    private static HttpRequestDef<ListGroupUserGroupsRequest, ListGroupUserGroupsResponse> genForListGroupUserGroups() {
        // basic
        HttpRequestDef.Builder<ListGroupUserGroupsRequest, ListGroupUserGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupUserGroupsRequest.class, ListGroupUserGroupsResponse.class)
                .withName("ListGroupUserGroups")
                .withUri("/v4/groups/{group_id}/user-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupUserGroupsRequest::getGroupId, ListGroupUserGroupsRequest::setGroupId));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupUserGroupsRequest::getSearch, ListGroupUserGroupsRequest::setSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupUserGroupsRequest::getOffset, ListGroupUserGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupUserGroupsRequest::getLimit, ListGroupUserGroupsRequest::setLimit));

        // response
        builder.<List<ProjectUserGroupDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGroupUserGroupsResponse::getBody, ListGroupUserGroupsResponse::setBody)
                .withInnerContainerType(ProjectUserGroupDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupsRequest, ListGroupsResponse> listGroups = genForListGroups();

    private static HttpRequestDef<ListGroupsRequest, ListGroupsResponse> genForListGroups() {
        // basic
        HttpRequestDef.Builder<ListGroupsRequest, ListGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupsRequest.class, ListGroupsResponse.class)
                .withName("ListGroups")
                .withUri("/v4/groups/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getSearch, ListGroupsRequest::setSearch));
        builder.<Boolean>withRequestField("all_available",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListGroupsRequest::getAllAvailable, ListGroupsRequest::setAllAvailable));
        builder.<ListGroupsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGroupsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListGroupsRequest::getOrderBy, ListGroupsRequest::setOrderBy));
        builder.<ListGroupsRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGroupsRequest.SortEnum.class),
            f -> f.withMarshaller(ListGroupsRequest::getSort, ListGroupsRequest::setSort));
        builder.<Boolean>withRequestField("starred",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListGroupsRequest::getStarred, ListGroupsRequest::setStarred));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsRequest::getOffset, ListGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsRequest::getLimit, ListGroupsRequest::setLimit));
        builder.<Boolean>withRequestField("owned",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListGroupsRequest::getOwned, ListGroupsRequest::setOwned));

        // response
        builder.<List<GroupBaseDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGroupsResponse::getBody, ListGroupsResponse::setBody)
                .withInnerContainerType(GroupBaseDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListManageableGroupsRequest, ListManageableGroupsResponse> listManageableGroups =
        genForListManageableGroups();

    private static HttpRequestDef<ListManageableGroupsRequest, ListManageableGroupsResponse> genForListManageableGroups() {
        // basic
        HttpRequestDef.Builder<ListManageableGroupsRequest, ListManageableGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListManageableGroupsRequest.class, ListManageableGroupsResponse.class)
            .withName("ListManageableGroups")
            .withUri("/v4/{project_id}/manageable-groups")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManageableGroupsRequest::getProjectId,
                ListManageableGroupsRequest::setProjectId));
        builder.<ListManageableGroupsRequest.ScopeEnum>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListManageableGroupsRequest.ScopeEnum.class),
            f -> f.withMarshaller(ListManageableGroupsRequest::getScope, ListManageableGroupsRequest::setScope));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManageableGroupsRequest::getOffset, ListManageableGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManageableGroupsRequest::getLimit, ListManageableGroupsRequest::setLimit));

        // response
        builder.<List<ManageableGroupDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListManageableGroupsResponse::getBody, ListManageableGroupsResponse::setBody)
                .withInnerContainerType(ManageableGroupDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupRequest, ShowGroupResponse> showGroup = genForShowGroup();

    private static HttpRequestDef<ShowGroupRequest, ShowGroupResponse> genForShowGroup() {
        // basic
        HttpRequestDef.Builder<ShowGroupRequest, ShowGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupRequest.class, ShowGroupResponse.class)
                .withName("ShowGroup")
                .withUri("/v4/{project_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGroupRequest::getProjectId, ShowGroupRequest::setProjectId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupRequest::getGroupId, ShowGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupGeneralPolicyRequest, ShowGroupGeneralPolicyResponse> showGroupGeneralPolicy =
        genForShowGroupGeneralPolicy();

    private static HttpRequestDef<ShowGroupGeneralPolicyRequest, ShowGroupGeneralPolicyResponse> genForShowGroupGeneralPolicy() {
        // basic
        HttpRequestDef.Builder<ShowGroupGeneralPolicyRequest, ShowGroupGeneralPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGroupGeneralPolicyRequest.class, ShowGroupGeneralPolicyResponse.class)
            .withName("ShowGroupGeneralPolicy")
            .withUri("/v4/groups/{group_id}/policies/general")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupGeneralPolicyRequest::getGroupId,
                ShowGroupGeneralPolicyRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupInheritSettingRequest, ShowGroupInheritSettingResponse> showGroupInheritSetting =
        genForShowGroupInheritSetting();

    private static HttpRequestDef<ShowGroupInheritSettingRequest, ShowGroupInheritSettingResponse> genForShowGroupInheritSetting() {
        // basic
        HttpRequestDef.Builder<ShowGroupInheritSettingRequest, ShowGroupInheritSettingResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGroupInheritSettingRequest.class, ShowGroupInheritSettingResponse.class)
            .withName("ShowGroupInheritSetting")
            .withUri("/v4/groups/{group_id}/inherit-setting")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupInheritSettingRequest::getGroupId,
                ShowGroupInheritSettingRequest::setGroupId));

        // response
        builder.<List<ProjectSettingsInheritCfgDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowGroupInheritSettingResponse::getBody, ShowGroupInheritSettingResponse::setBody)
                .withInnerContainerType(ProjectSettingsInheritCfgDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupPermissionInheritEnabledRequest, ShowGroupPermissionInheritEnabledResponse> showGroupPermissionInheritEnabled =
        genForShowGroupPermissionInheritEnabled();

    private static HttpRequestDef<ShowGroupPermissionInheritEnabledRequest, ShowGroupPermissionInheritEnabledResponse> genForShowGroupPermissionInheritEnabled() {
        // basic
        HttpRequestDef.Builder<ShowGroupPermissionInheritEnabledRequest, ShowGroupPermissionInheritEnabledResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGroupPermissionInheritEnabledRequest.class,
                    ShowGroupPermissionInheritEnabledResponse.class)
                .withName("ShowGroupPermissionInheritEnabled")
                .withUri("/v4/groups/{group_id}/permission-inherit-enabled")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupPermissionInheritEnabledRequest::getGroupId,
                ShowGroupPermissionInheritEnabledRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupSettingsInheritCfgRequest, ShowGroupSettingsInheritCfgResponse> showGroupSettingsInheritCfg =
        genForShowGroupSettingsInheritCfg();

    private static HttpRequestDef<ShowGroupSettingsInheritCfgRequest, ShowGroupSettingsInheritCfgResponse> genForShowGroupSettingsInheritCfg() {
        // basic
        HttpRequestDef.Builder<ShowGroupSettingsInheritCfgRequest, ShowGroupSettingsInheritCfgResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGroupSettingsInheritCfgRequest.class,
                    ShowGroupSettingsInheritCfgResponse.class)
                .withName("ShowGroupSettingsInheritCfg")
                .withUri("/v4/groups/{group_id}/settings-inherit-cfg")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupSettingsInheritCfgRequest::getGroupId,
                ShowGroupSettingsInheritCfgRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupWatermarkRequest, ShowGroupWatermarkResponse> showGroupWatermark =
        genForShowGroupWatermark();

    private static HttpRequestDef<ShowGroupWatermarkRequest, ShowGroupWatermarkResponse> genForShowGroupWatermark() {
        // basic
        HttpRequestDef.Builder<ShowGroupWatermarkRequest, ShowGroupWatermarkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupWatermarkRequest.class, ShowGroupWatermarkResponse.class)
                .withName("ShowGroupWatermark")
                .withUri("/v4/groups/{group_id}/watermark")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupWatermarkRequest::getGroupId, ShowGroupWatermarkRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupsGeneralPolicyRequest, ShowGroupsGeneralPolicyResponse> showGroupsGeneralPolicy =
        genForShowGroupsGeneralPolicy();

    private static HttpRequestDef<ShowGroupsGeneralPolicyRequest, ShowGroupsGeneralPolicyResponse> genForShowGroupsGeneralPolicy() {
        // basic
        HttpRequestDef.Builder<ShowGroupsGeneralPolicyRequest, ShowGroupsGeneralPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGroupsGeneralPolicyRequest.class, ShowGroupsGeneralPolicyResponse.class)
            .withName("ShowGroupsGeneralPolicy")
            .withUri("/v4/groups/{group_id}/general-policy")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupsGeneralPolicyRequest::getGroupId,
                ShowGroupsGeneralPolicyRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupsInheritRequest, ShowGroupsInheritResponse> showGroupsInherit =
        genForShowGroupsInherit();

    private static HttpRequestDef<ShowGroupsInheritRequest, ShowGroupsInheritResponse> genForShowGroupsInherit() {
        // basic
        HttpRequestDef.Builder<ShowGroupsInheritRequest, ShowGroupsInheritResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupsInheritRequest.class, ShowGroupsInheritResponse.class)
                .withName("ShowGroupsInherit")
                .withUri("/v4/groups/{group_id}/inherit")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupsInheritRequest::getGroupId, ShowGroupsInheritRequest::setGroupId));
        builder.<ShowGroupsInheritRequest.SettingTypeEnum>withRequestField("setting_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowGroupsInheritRequest.SettingTypeEnum.class),
            f -> f.withMarshaller(ShowGroupsInheritRequest::getSettingType, ShowGroupsInheritRequest::setSettingType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TransferGroupRequest, TransferGroupResponse> transferGroup =
        genForTransferGroup();

    private static HttpRequestDef<TransferGroupRequest, TransferGroupResponse> genForTransferGroup() {
        // basic
        HttpRequestDef.Builder<TransferGroupRequest, TransferGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, TransferGroupRequest.class, TransferGroupResponse.class)
                .withName("TransferGroup")
                .withUri("/v4/groups/{group_id}/transfer")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(TransferGroupRequest::getGroupId, TransferGroupRequest::setGroupId));
        builder.<BussinessGroupTransferBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BussinessGroupTransferBodyDto.class),
            f -> f.withMarshaller(TransferGroupRequest::getBody, TransferGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupGeneralPolicyRequest, UpdateGroupGeneralPolicyResponse> updateGroupGeneralPolicy =
        genForUpdateGroupGeneralPolicy();

    private static HttpRequestDef<UpdateGroupGeneralPolicyRequest, UpdateGroupGeneralPolicyResponse> genForUpdateGroupGeneralPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateGroupGeneralPolicyRequest, UpdateGroupGeneralPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateGroupGeneralPolicyRequest.class, UpdateGroupGeneralPolicyResponse.class)
                .withName("UpdateGroupGeneralPolicy")
                .withUri("/v4/groups/{group_id}/general-policy")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateGroupGeneralPolicyRequest::getGroupId,
                UpdateGroupGeneralPolicyRequest::setGroupId));
        builder.<UpdateGeneralPolicyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGeneralPolicyDto.class),
            f -> f.withMarshaller(UpdateGroupGeneralPolicyRequest::getBody, UpdateGroupGeneralPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupWatermarkRequest, UpdateGroupWatermarkResponse> updateGroupWatermark =
        genForUpdateGroupWatermark();

    private static HttpRequestDef<UpdateGroupWatermarkRequest, UpdateGroupWatermarkResponse> genForUpdateGroupWatermark() {
        // basic
        HttpRequestDef.Builder<UpdateGroupWatermarkRequest, UpdateGroupWatermarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGroupWatermarkRequest.class, UpdateGroupWatermarkResponse.class)
            .withName("UpdateGroupWatermark")
            .withUri("/v4/groups/{group_id}/watermark")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateGroupWatermarkRequest::getGroupId, UpdateGroupWatermarkRequest::setGroupId));
        builder.<UpdateWatermarkDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWatermarkDto.class),
            f -> f.withMarshaller(UpdateGroupWatermarkRequest::getBody, UpdateGroupWatermarkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRepositoryMembersRequest, AddRepositoryMembersResponse> addRepositoryMembers =
        genForAddRepositoryMembers();

    private static HttpRequestDef<AddRepositoryMembersRequest, AddRepositoryMembersResponse> genForAddRepositoryMembers() {
        // basic
        HttpRequestDef.Builder<AddRepositoryMembersRequest, AddRepositoryMembersResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddRepositoryMembersRequest.class, AddRepositoryMembersResponse.class)
            .withName("AddRepositoryMembers")
            .withUri("/v4/repositories/{repository_id}/members")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddRepositoryMembersRequest::getRepositoryId,
                AddRepositoryMembersRequest::setRepositoryId));
        builder.<BatchCreateRepositoryMemberBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateRepositoryMemberBodyDto.class),
            f -> f.withMarshaller(AddRepositoryMembersRequest::getBody, AddRepositoryMembersRequest::setBody));

        // response
        builder.<List<BatchCreateRepositoryMemberDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AddRepositoryMembersResponse::getBody, AddRepositoryMembersResponse::setBody)
                .withInnerContainerType(BatchCreateRepositoryMemberDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupProtectedRefsUserGroupsRequest, ListGroupProtectedRefsUserGroupsResponse> listGroupProtectedRefsUserGroups =
        genForListGroupProtectedRefsUserGroups();

    private static HttpRequestDef<ListGroupProtectedRefsUserGroupsRequest, ListGroupProtectedRefsUserGroupsResponse> genForListGroupProtectedRefsUserGroups() {
        // basic
        HttpRequestDef.Builder<ListGroupProtectedRefsUserGroupsRequest, ListGroupProtectedRefsUserGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGroupProtectedRefsUserGroupsRequest.class,
                    ListGroupProtectedRefsUserGroupsResponse.class)
                .withName("ListGroupProtectedRefsUserGroups")
                .withUri("/v4/groups/{group_id}/protected-refs/user-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupProtectedRefsUserGroupsRequest::getGroupId,
                ListGroupProtectedRefsUserGroupsRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupProtectedRefsUserGroupsRequest::getOffset,
                ListGroupProtectedRefsUserGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupProtectedRefsUserGroupsRequest::getLimit,
                ListGroupProtectedRefsUserGroupsRequest::setLimit));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupProtectedRefsUserGroupsRequest::getSearch,
                ListGroupProtectedRefsUserGroupsRequest::setSearch));

        // response
        builder.<List<ProtectedRefsUserGroupBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListGroupProtectedRefsUserGroupsResponse::getBody,
                    ListGroupProtectedRefsUserGroupsResponse::setBody)
                .withInnerContainerType(ProtectedRefsUserGroupBasicDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGroupProtectedRefsUserGroupsResponse::getXTotal,
                ListGroupProtectedRefsUserGroupsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListMembersRequest, ListMembersResponse> listMembers = genForListMembers();

    private static HttpRequestDef<ListMembersRequest, ListMembersResponse> genForListMembers() {
        // basic
        HttpRequestDef.Builder<ListMembersRequest, ListMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMembersRequest.class, ListMembersResponse.class)
                .withName("ListMembers")
                .withUri("/v4/repositories/{repository_id}/members")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMembersRequest::getRepositoryId, ListMembersRequest::setRepositoryId));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getSearch, ListMembersRequest::setSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMembersRequest::getOffset, ListMembersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMembersRequest::getLimit, ListMembersRequest::setLimit));
        builder.<ListMembersRequest.PermissionEnum>withRequestField("permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMembersRequest.PermissionEnum.class),
            f -> f.withMarshaller(ListMembersRequest::getPermission, ListMembersRequest::setPermission));
        builder.<ListMembersRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMembersRequest.ActionEnum.class),
            f -> f.withMarshaller(ListMembersRequest::getAction, ListMembersRequest::setAction));

        // response
        builder.<List<RepositoryMemberDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersResponse::getBody, ListMembersResponse::setBody)
                .withInnerContainerType(RepositoryMemberDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMembersResponse::getXTotal, ListMembersResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListProductPermissionResourcesGrantedUsersRequest, ListProductPermissionResourcesGrantedUsersResponse> listProductPermissionResourcesGrantedUsers =
        genForListProductPermissionResourcesGrantedUsers();

    private static HttpRequestDef<ListProductPermissionResourcesGrantedUsersRequest, ListProductPermissionResourcesGrantedUsersResponse> genForListProductPermissionResourcesGrantedUsers() {
        // basic
        HttpRequestDef.Builder<ListProductPermissionResourcesGrantedUsersRequest, ListProductPermissionResourcesGrantedUsersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProductPermissionResourcesGrantedUsersRequest.class,
                    ListProductPermissionResourcesGrantedUsersResponse.class)
                .withName("ListProductPermissionResourcesGrantedUsers")
                .withUri("/v4/projects/{project_id}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductPermissionResourcesGrantedUsersRequest::getProjectId,
                ListProductPermissionResourcesGrantedUsersRequest::setProjectId));
        builder.<String>withRequestField("query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductPermissionResourcesGrantedUsersRequest::getQuery,
                ListProductPermissionResourcesGrantedUsersRequest::setQuery));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductPermissionResourcesGrantedUsersRequest::getOffset,
                ListProductPermissionResourcesGrantedUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductPermissionResourcesGrantedUsersRequest::getLimit,
                ListProductPermissionResourcesGrantedUsersRequest::setLimit));

        // response
        builder.<List<GrantedUsersDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListProductPermissionResourcesGrantedUsersResponse::getBody,
                    ListProductPermissionResourcesGrantedUsersResponse::setBody)
                .withInnerContainerType(GrantedUsersDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectProtectedRefsUserGroupsRequest, ListProjectProtectedRefsUserGroupsResponse> listProjectProtectedRefsUserGroups =
        genForListProjectProtectedRefsUserGroups();

    private static HttpRequestDef<ListProjectProtectedRefsUserGroupsRequest, ListProjectProtectedRefsUserGroupsResponse> genForListProjectProtectedRefsUserGroups() {
        // basic
        HttpRequestDef.Builder<ListProjectProtectedRefsUserGroupsRequest, ListProjectProtectedRefsUserGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectProtectedRefsUserGroupsRequest.class,
                    ListProjectProtectedRefsUserGroupsResponse.class)
                .withName("ListProjectProtectedRefsUserGroups")
                .withUri("/v4/projects/{project_id}/protected-refs/user-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectProtectedRefsUserGroupsRequest::getProjectId,
                ListProjectProtectedRefsUserGroupsRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectProtectedRefsUserGroupsRequest::getOffset,
                ListProjectProtectedRefsUserGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectProtectedRefsUserGroupsRequest::getLimit,
                ListProjectProtectedRefsUserGroupsRequest::setLimit));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectProtectedRefsUserGroupsRequest::getSearch,
                ListProjectProtectedRefsUserGroupsRequest::setSearch));

        // response
        builder.<List<ProtectedRefsUserGroupBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListProjectProtectedRefsUserGroupsResponse::getBody,
                    ListProjectProtectedRefsUserGroupsResponse::setBody)
                .withInnerContainerType(ProtectedRefsUserGroupBasicDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectProtectedRefsUserGroupsResponse::getXTotal,
                ListProjectProtectedRefsUserGroupsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryProtectedRefsUserGroupsRequest, ListRepositoryProtectedRefsUserGroupsResponse> listRepositoryProtectedRefsUserGroups =
        genForListRepositoryProtectedRefsUserGroups();

    private static HttpRequestDef<ListRepositoryProtectedRefsUserGroupsRequest, ListRepositoryProtectedRefsUserGroupsResponse> genForListRepositoryProtectedRefsUserGroups() {
        // basic
        HttpRequestDef.Builder<ListRepositoryProtectedRefsUserGroupsRequest, ListRepositoryProtectedRefsUserGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRepositoryProtectedRefsUserGroupsRequest.class,
                    ListRepositoryProtectedRefsUserGroupsResponse.class)
                .withName("ListRepositoryProtectedRefsUserGroups")
                .withUri("/v4/repositories/{repository_id}/protected-refs/user-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryProtectedRefsUserGroupsRequest::getRepositoryId,
                ListRepositoryProtectedRefsUserGroupsRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryProtectedRefsUserGroupsRequest::getOffset,
                ListRepositoryProtectedRefsUserGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryProtectedRefsUserGroupsRequest::getLimit,
                ListRepositoryProtectedRefsUserGroupsRequest::setLimit));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryProtectedRefsUserGroupsRequest::getSearch,
                ListRepositoryProtectedRefsUserGroupsRequest::setSearch));

        // response
        builder.<List<ProtectedRefsUserGroupBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListRepositoryProtectedRefsUserGroupsResponse::getBody,
                    ListRepositoryProtectedRefsUserGroupsResponse::setBody)
                .withInnerContainerType(ProtectedRefsUserGroupBasicDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryProtectedRefsUserGroupsResponse::getXTotal,
                ListRepositoryProtectedRefsUserGroupsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryUserGroupsRequest, ListRepositoryUserGroupsResponse> listRepositoryUserGroups =
        genForListRepositoryUserGroups();

    private static HttpRequestDef<ListRepositoryUserGroupsRequest, ListRepositoryUserGroupsResponse> genForListRepositoryUserGroups() {
        // basic
        HttpRequestDef.Builder<ListRepositoryUserGroupsRequest, ListRepositoryUserGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListRepositoryUserGroupsRequest.class, ListRepositoryUserGroupsResponse.class)
                .withName("ListRepositoryUserGroups")
                .withUri("/v4/repositories/{repository_id}/user-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryUserGroupsRequest::getRepositoryId,
                ListRepositoryUserGroupsRequest::setRepositoryId));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryUserGroupsRequest::getSearch,
                ListRepositoryUserGroupsRequest::setSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryUserGroupsRequest::getOffset,
                ListRepositoryUserGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryUserGroupsRequest::getLimit,
                ListRepositoryUserGroupsRequest::setLimit));

        // response
        builder.<List<RepositoryUserGroupDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepositoryUserGroupsResponse::getBody, ListRepositoryUserGroupsResponse::setBody)
                .withInnerContainerType(RepositoryUserGroupDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryUserGroupsResponse::getXTotal,
                ListRepositoryUserGroupsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ApprovalMergeRequestRequest, ApprovalMergeRequestResponse> approvalMergeRequest =
        genForApprovalMergeRequest();

    private static HttpRequestDef<ApprovalMergeRequestRequest, ApprovalMergeRequestResponse> genForApprovalMergeRequest() {
        // basic
        HttpRequestDef.Builder<ApprovalMergeRequestRequest, ApprovalMergeRequestResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ApprovalMergeRequestRequest.class, ApprovalMergeRequestResponse.class)
            .withName("ApprovalMergeRequest")
            .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/approval")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ApprovalMergeRequestRequest::getRepositoryId,
                ApprovalMergeRequestRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ApprovalMergeRequestRequest::getMergeRequestIid,
                ApprovalMergeRequestRequest::setMergeRequestIid));
        builder.<ApprovalActionTypeDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApprovalActionTypeDto.class),
            f -> f.withMarshaller(ApprovalMergeRequestRequest::getBody, ApprovalMergeRequestRequest::setBody));

        // response
        builder.<List<ApproverBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ApprovalMergeRequestResponse::getBody, ApprovalMergeRequestResponse::setBody)
                .withInnerContainerType(ApproverBasicDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateCherryPickMergeRequestRequest, CreateCherryPickMergeRequestResponse> createCherryPickMergeRequest =
        genForCreateCherryPickMergeRequest();

    private static HttpRequestDef<CreateCherryPickMergeRequestRequest, CreateCherryPickMergeRequestResponse> genForCreateCherryPickMergeRequest() {
        // basic
        HttpRequestDef.Builder<CreateCherryPickMergeRequestRequest, CreateCherryPickMergeRequestResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCherryPickMergeRequestRequest.class,
                    CreateCherryPickMergeRequestResponse.class)
                .withName("CreateCherryPickMergeRequest")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/cherry-pick")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateCherryPickMergeRequestRequest::getRepositoryId,
                CreateCherryPickMergeRequestRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateCherryPickMergeRequestRequest::getMergeRequestIid,
                CreateCherryPickMergeRequestRequest::setMergeRequestIid));
        builder.<MrCherryRevertDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MrCherryRevertDto.class),
            f -> f.withMarshaller(CreateCherryPickMergeRequestRequest::getBody,
                CreateCherryPickMergeRequestRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGroupMergeRequestApproverSettingRequest, CreateGroupMergeRequestApproverSettingResponse> createGroupMergeRequestApproverSetting =
        genForCreateGroupMergeRequestApproverSetting();

    private static HttpRequestDef<CreateGroupMergeRequestApproverSettingRequest, CreateGroupMergeRequestApproverSettingResponse> genForCreateGroupMergeRequestApproverSetting() {
        // basic
        HttpRequestDef.Builder<CreateGroupMergeRequestApproverSettingRequest, CreateGroupMergeRequestApproverSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGroupMergeRequestApproverSettingRequest.class,
                    CreateGroupMergeRequestApproverSettingResponse.class)
                .withName("CreateGroupMergeRequestApproverSetting")
                .withUri("/v4/groups/{group_id}/approver-settings")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateGroupMergeRequestApproverSettingRequest::getGroupId,
                CreateGroupMergeRequestApproverSettingRequest::setGroupId));
        builder.<CreateMergeRequestApproverSettingDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeRequestApproverSettingDto.class),
            f -> f.withMarshaller(CreateGroupMergeRequestApproverSettingRequest::getBody,
                CreateGroupMergeRequestApproverSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGroupMergeRequestTemplateRequest, CreateGroupMergeRequestTemplateResponse> createGroupMergeRequestTemplate =
        genForCreateGroupMergeRequestTemplate();

    private static HttpRequestDef<CreateGroupMergeRequestTemplateRequest, CreateGroupMergeRequestTemplateResponse> genForCreateGroupMergeRequestTemplate() {
        // basic
        HttpRequestDef.Builder<CreateGroupMergeRequestTemplateRequest, CreateGroupMergeRequestTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGroupMergeRequestTemplateRequest.class,
                    CreateGroupMergeRequestTemplateResponse.class)
                .withName("CreateGroupMergeRequestTemplate")
                .withUri("/v4/groups/{group_id}/merge-requests/templates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateGroupMergeRequestTemplateRequest::getGroupId,
                CreateGroupMergeRequestTemplateRequest::setGroupId));
        builder.<CreateMergeRequestTemplateDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeRequestTemplateDto.class),
            f -> f.withMarshaller(CreateGroupMergeRequestTemplateRequest::getBody,
                CreateGroupMergeRequestTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMergeRequestRequest, CreateMergeRequestResponse> createMergeRequest =
        genForCreateMergeRequest();

    private static HttpRequestDef<CreateMergeRequestRequest, CreateMergeRequestResponse> genForCreateMergeRequest() {
        // basic
        HttpRequestDef.Builder<CreateMergeRequestRequest, CreateMergeRequestResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMergeRequestRequest.class, CreateMergeRequestResponse.class)
                .withName("CreateMergeRequest")
                .withUri("/v4/repositories/{repository_id}/merge-requests")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMergeRequestRequest::getRepositoryId,
                CreateMergeRequestRequest::setRepositoryId));
        builder.<PostMergeRequestParamsDtoForOpenApi>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostMergeRequestParamsDtoForOpenApi.class),
            f -> f.withMarshaller(CreateMergeRequestRequest::getBody, CreateMergeRequestRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMergeRequestApproverSettingRequest, CreateMergeRequestApproverSettingResponse> createMergeRequestApproverSetting =
        genForCreateMergeRequestApproverSetting();

    private static HttpRequestDef<CreateMergeRequestApproverSettingRequest, CreateMergeRequestApproverSettingResponse> genForCreateMergeRequestApproverSetting() {
        // basic
        HttpRequestDef.Builder<CreateMergeRequestApproverSettingRequest, CreateMergeRequestApproverSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateMergeRequestApproverSettingRequest.class,
                    CreateMergeRequestApproverSettingResponse.class)
                .withName("CreateMergeRequestApproverSetting")
                .withUri("/v4/repositories/{repository_id}/approver-settings")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMergeRequestApproverSettingRequest::getRepositoryId,
                CreateMergeRequestApproverSettingRequest::setRepositoryId));
        builder.<MergeRequestApproverSettingResultDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MergeRequestApproverSettingResultDto.class),
            f -> f.withMarshaller(CreateMergeRequestApproverSettingRequest::getBody,
                CreateMergeRequestApproverSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMergeRequestTemplateRequest, CreateMergeRequestTemplateResponse> createMergeRequestTemplate =
        genForCreateMergeRequestTemplate();

    private static HttpRequestDef<CreateMergeRequestTemplateRequest, CreateMergeRequestTemplateResponse> genForCreateMergeRequestTemplate() {
        // basic
        HttpRequestDef.Builder<CreateMergeRequestTemplateRequest, CreateMergeRequestTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateMergeRequestTemplateRequest.class,
                    CreateMergeRequestTemplateResponse.class)
                .withName("CreateMergeRequestTemplate")
                .withUri("/v4/repositories/{repository_id}/merge-requests/templates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMergeRequestTemplateRequest::getRepositoryId,
                CreateMergeRequestTemplateRequest::setRepositoryId));
        builder.<CreateMergeRequestTemplateDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeRequestTemplateDto.class),
            f -> f.withMarshaller(CreateMergeRequestTemplateRequest::getBody,
                CreateMergeRequestTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectMergeRequestApproverSettingRequest, CreateProjectMergeRequestApproverSettingResponse> createProjectMergeRequestApproverSetting =
        genForCreateProjectMergeRequestApproverSetting();

    private static HttpRequestDef<CreateProjectMergeRequestApproverSettingRequest, CreateProjectMergeRequestApproverSettingResponse> genForCreateProjectMergeRequestApproverSetting() {
        // basic
        HttpRequestDef.Builder<CreateProjectMergeRequestApproverSettingRequest, CreateProjectMergeRequestApproverSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateProjectMergeRequestApproverSettingRequest.class,
                    CreateProjectMergeRequestApproverSettingResponse.class)
                .withName("CreateProjectMergeRequestApproverSetting")
                .withUri("/v4/projects/{project_id}/approver-settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProjectMergeRequestApproverSettingRequest::getProjectId,
                CreateProjectMergeRequestApproverSettingRequest::setProjectId));
        builder.<CreateMergeRequestApproverSettingDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeRequestApproverSettingDto.class),
            f -> f.withMarshaller(CreateProjectMergeRequestApproverSettingRequest::getBody,
                CreateProjectMergeRequestApproverSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectMergeRequestTemplateRequest, CreateProjectMergeRequestTemplateResponse> createProjectMergeRequestTemplate =
        genForCreateProjectMergeRequestTemplate();

    private static HttpRequestDef<CreateProjectMergeRequestTemplateRequest, CreateProjectMergeRequestTemplateResponse> genForCreateProjectMergeRequestTemplate() {
        // basic
        HttpRequestDef.Builder<CreateProjectMergeRequestTemplateRequest, CreateProjectMergeRequestTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateProjectMergeRequestTemplateRequest.class,
                    CreateProjectMergeRequestTemplateResponse.class)
                .withName("CreateProjectMergeRequestTemplate")
                .withUri("/v4/projects/{project_id}/merge-requests/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProjectMergeRequestTemplateRequest::getProjectId,
                CreateProjectMergeRequestTemplateRequest::setProjectId));
        builder.<CreateMergeRequestTemplateDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeRequestTemplateDto.class),
            f -> f.withMarshaller(CreateProjectMergeRequestTemplateRequest::getBody,
                CreateProjectMergeRequestTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGroupMergeRequestApproverSettingRequest, DeleteGroupMergeRequestApproverSettingResponse> deleteGroupMergeRequestApproverSetting =
        genForDeleteGroupMergeRequestApproverSetting();

    private static HttpRequestDef<DeleteGroupMergeRequestApproverSettingRequest, DeleteGroupMergeRequestApproverSettingResponse> genForDeleteGroupMergeRequestApproverSetting() {
        // basic
        HttpRequestDef.Builder<DeleteGroupMergeRequestApproverSettingRequest, DeleteGroupMergeRequestApproverSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGroupMergeRequestApproverSettingRequest.class,
                    DeleteGroupMergeRequestApproverSettingResponse.class)
                .withName("DeleteGroupMergeRequestApproverSetting")
                .withUri("/v4/groups/{group_id}/approver-settings/{setting_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteGroupMergeRequestApproverSettingRequest::getGroupId,
                DeleteGroupMergeRequestApproverSettingRequest::setGroupId));
        builder.<Integer>withRequestField("setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteGroupMergeRequestApproverSettingRequest::getSettingId,
                DeleteGroupMergeRequestApproverSettingRequest::setSettingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGroupMergeRequestTemplateRequest, DeleteGroupMergeRequestTemplateResponse> deleteGroupMergeRequestTemplate =
        genForDeleteGroupMergeRequestTemplate();

    private static HttpRequestDef<DeleteGroupMergeRequestTemplateRequest, DeleteGroupMergeRequestTemplateResponse> genForDeleteGroupMergeRequestTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteGroupMergeRequestTemplateRequest, DeleteGroupMergeRequestTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGroupMergeRequestTemplateRequest.class,
                    DeleteGroupMergeRequestTemplateResponse.class)
                .withName("DeleteGroupMergeRequestTemplate")
                .withUri("/v4/groups/{group_id}/merge-requests/template/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteGroupMergeRequestTemplateRequest::getGroupId,
                DeleteGroupMergeRequestTemplateRequest::setGroupId));
        builder.<Integer>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteGroupMergeRequestTemplateRequest::getTemplateId,
                DeleteGroupMergeRequestTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMergeRequestApproverSettingRequest, DeleteMergeRequestApproverSettingResponse> deleteMergeRequestApproverSetting =
        genForDeleteMergeRequestApproverSetting();

    private static HttpRequestDef<DeleteMergeRequestApproverSettingRequest, DeleteMergeRequestApproverSettingResponse> genForDeleteMergeRequestApproverSetting() {
        // basic
        HttpRequestDef.Builder<DeleteMergeRequestApproverSettingRequest, DeleteMergeRequestApproverSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteMergeRequestApproverSettingRequest.class,
                    DeleteMergeRequestApproverSettingResponse.class)
                .withName("DeleteMergeRequestApproverSetting")
                .withUri("/v4/repositories/{repository_id}/approver-settings/{setting_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteMergeRequestApproverSettingRequest::getRepositoryId,
                DeleteMergeRequestApproverSettingRequest::setRepositoryId));
        builder.<Integer>withRequestField("setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteMergeRequestApproverSettingRequest::getSettingId,
                DeleteMergeRequestApproverSettingRequest::setSettingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMergeRequestTemplateRequest, DeleteMergeRequestTemplateResponse> deleteMergeRequestTemplate =
        genForDeleteMergeRequestTemplate();

    private static HttpRequestDef<DeleteMergeRequestTemplateRequest, DeleteMergeRequestTemplateResponse> genForDeleteMergeRequestTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteMergeRequestTemplateRequest, DeleteMergeRequestTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteMergeRequestTemplateRequest.class,
                    DeleteMergeRequestTemplateResponse.class)
                .withName("DeleteMergeRequestTemplate")
                .withUri("/v4/repositories/{repository_id}/merge-requests/template/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteMergeRequestTemplateRequest::getRepositoryId,
                DeleteMergeRequestTemplateRequest::setRepositoryId));
        builder.<Integer>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteMergeRequestTemplateRequest::getTemplateId,
                DeleteMergeRequestTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMergeRequestVoteRequest, DeleteMergeRequestVoteResponse> deleteMergeRequestVote =
        genForDeleteMergeRequestVote();

    private static HttpRequestDef<DeleteMergeRequestVoteRequest, DeleteMergeRequestVoteResponse> genForDeleteMergeRequestVote() {
        // basic
        HttpRequestDef.Builder<DeleteMergeRequestVoteRequest, DeleteMergeRequestVoteResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMergeRequestVoteRequest.class, DeleteMergeRequestVoteResponse.class)
            .withName("DeleteMergeRequestVote")
            .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/vote")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteMergeRequestVoteRequest::getRepositoryId,
                DeleteMergeRequestVoteRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteMergeRequestVoteRequest::getMergeRequestIid,
                DeleteMergeRequestVoteRequest::setMergeRequestIid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectMergeRequestApproverSettingRequest, DeleteProjectMergeRequestApproverSettingResponse> deleteProjectMergeRequestApproverSetting =
        genForDeleteProjectMergeRequestApproverSetting();

    private static HttpRequestDef<DeleteProjectMergeRequestApproverSettingRequest, DeleteProjectMergeRequestApproverSettingResponse> genForDeleteProjectMergeRequestApproverSetting() {
        // basic
        HttpRequestDef.Builder<DeleteProjectMergeRequestApproverSettingRequest, DeleteProjectMergeRequestApproverSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteProjectMergeRequestApproverSettingRequest.class,
                    DeleteProjectMergeRequestApproverSettingResponse.class)
                .withName("DeleteProjectMergeRequestApproverSetting")
                .withUri("/v4/projects/{project_id}/approver-settings/{setting_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProjectMergeRequestApproverSettingRequest::getProjectId,
                DeleteProjectMergeRequestApproverSettingRequest::setProjectId));
        builder.<Integer>withRequestField("setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteProjectMergeRequestApproverSettingRequest::getSettingId,
                DeleteProjectMergeRequestApproverSettingRequest::setSettingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectMergeRequestTemplateRequest, DeleteProjectMergeRequestTemplateResponse> deleteProjectMergeRequestTemplate =
        genForDeleteProjectMergeRequestTemplate();

    private static HttpRequestDef<DeleteProjectMergeRequestTemplateRequest, DeleteProjectMergeRequestTemplateResponse> genForDeleteProjectMergeRequestTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteProjectMergeRequestTemplateRequest, DeleteProjectMergeRequestTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteProjectMergeRequestTemplateRequest.class,
                    DeleteProjectMergeRequestTemplateResponse.class)
                .withName("DeleteProjectMergeRequestTemplate")
                .withUri("/v4/projects/{project_id}/merge-requests/template/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProjectMergeRequestTemplateRequest::getProjectId,
                DeleteProjectMergeRequestTemplateRequest::setProjectId));
        builder.<Integer>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteProjectMergeRequestTemplateRequest::getTemplateId,
                DeleteProjectMergeRequestTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportMergeRequestRequest, ImportMergeRequestResponse> importMergeRequest =
        genForImportMergeRequest();

    private static HttpRequestDef<ImportMergeRequestRequest, ImportMergeRequestResponse> genForImportMergeRequest() {
        // basic
        HttpRequestDef.Builder<ImportMergeRequestRequest, ImportMergeRequestResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportMergeRequestRequest.class, ImportMergeRequestResponse.class)
                .withName("ImportMergeRequest")
                .withUri("/v4/repositories/{repository_id}/import-merge-requests")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ImportMergeRequestRequest::getRepositoryId,
                ImportMergeRequestRequest::setRepositoryId));
        builder.<ImportMrParamsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportMrParamsDto.class),
            f -> f.withMarshaller(ImportMergeRequestRequest::getBody, ImportMergeRequestRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommitAssociatedMergeRequestsRequest, ListCommitAssociatedMergeRequestsResponse> listCommitAssociatedMergeRequests =
        genForListCommitAssociatedMergeRequests();

    private static HttpRequestDef<ListCommitAssociatedMergeRequestsRequest, ListCommitAssociatedMergeRequestsResponse> genForListCommitAssociatedMergeRequests() {
        // basic
        HttpRequestDef.Builder<ListCommitAssociatedMergeRequestsRequest, ListCommitAssociatedMergeRequestsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCommitAssociatedMergeRequestsRequest.class,
                    ListCommitAssociatedMergeRequestsResponse.class)
                .withName("ListCommitAssociatedMergeRequests")
                .withUri("/v4/repositories/{repository_id}/commits/{sha}/merge-requests")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitAssociatedMergeRequestsRequest::getRepositoryId,
                ListCommitAssociatedMergeRequestsRequest::setRepositoryId));
        builder.<String>withRequestField("sha",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitAssociatedMergeRequestsRequest::getSha,
                ListCommitAssociatedMergeRequestsRequest::setSha));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitAssociatedMergeRequestsRequest::getOffset,
                ListCommitAssociatedMergeRequestsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitAssociatedMergeRequestsRequest::getLimit,
                ListCommitAssociatedMergeRequestsRequest::setLimit));

        // response
        builder.<List<CommitMergeRequestDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListCommitAssociatedMergeRequestsResponse::getBody,
                    ListCommitAssociatedMergeRequestsResponse::setBody)
                .withInnerContainerType(CommitMergeRequestDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListDiscussionTemplatesRequest, ListDiscussionTemplatesResponse> listDiscussionTemplates =
        genForListDiscussionTemplates();

    private static HttpRequestDef<ListDiscussionTemplatesRequest, ListDiscussionTemplatesResponse> genForListDiscussionTemplates() {
        // basic
        HttpRequestDef.Builder<ListDiscussionTemplatesRequest, ListDiscussionTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDiscussionTemplatesRequest.class, ListDiscussionTemplatesResponse.class)
            .withName("ListDiscussionTemplates")
            .withUri("/v4/repositories/{repository_id}/discussion/templates")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiscussionTemplatesRequest::getRepositoryId,
                ListDiscussionTemplatesRequest::setRepositoryId));
        builder.<Boolean>withRequestField("is_default",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDiscussionTemplatesRequest::getIsDefault,
                ListDiscussionTemplatesRequest::setIsDefault));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiscussionTemplatesRequest::getOffset,
                ListDiscussionTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiscussionTemplatesRequest::getLimit, ListDiscussionTemplatesRequest::setLimit));

        // response
        builder.<List<DiscussionTemplateDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDiscussionTemplatesResponse::getBody, ListDiscussionTemplatesResponse::setBody)
                .withInnerContainerType(DiscussionTemplateDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupMergeRequestApproverSettingsRequest, ListGroupMergeRequestApproverSettingsResponse> listGroupMergeRequestApproverSettings =
        genForListGroupMergeRequestApproverSettings();

    private static HttpRequestDef<ListGroupMergeRequestApproverSettingsRequest, ListGroupMergeRequestApproverSettingsResponse> genForListGroupMergeRequestApproverSettings() {
        // basic
        HttpRequestDef.Builder<ListGroupMergeRequestApproverSettingsRequest, ListGroupMergeRequestApproverSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGroupMergeRequestApproverSettingsRequest.class,
                    ListGroupMergeRequestApproverSettingsResponse.class)
                .withName("ListGroupMergeRequestApproverSettings")
                .withUri("/v4/groups/{group_id}/approver-settings")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestApproverSettingsRequest::getGroupId,
                ListGroupMergeRequestApproverSettingsRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestApproverSettingsRequest::getOffset,
                ListGroupMergeRequestApproverSettingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestApproverSettingsRequest::getLimit,
                ListGroupMergeRequestApproverSettingsRequest::setLimit));

        // response
        builder.<List<MergeRequestApproverSettingResultDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListGroupMergeRequestApproverSettingsResponse::getBody,
                    ListGroupMergeRequestApproverSettingsResponse::setBody)
                .withInnerContainerType(MergeRequestApproverSettingResultDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupMergeRequestCanBeAssignedReviewersRequest, ListGroupMergeRequestCanBeAssignedReviewersResponse> listGroupMergeRequestCanBeAssignedReviewers =
        genForListGroupMergeRequestCanBeAssignedReviewers();

    private static HttpRequestDef<ListGroupMergeRequestCanBeAssignedReviewersRequest, ListGroupMergeRequestCanBeAssignedReviewersResponse> genForListGroupMergeRequestCanBeAssignedReviewers() {
        // basic
        HttpRequestDef.Builder<ListGroupMergeRequestCanBeAssignedReviewersRequest, ListGroupMergeRequestCanBeAssignedReviewersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGroupMergeRequestCanBeAssignedReviewersRequest.class,
                    ListGroupMergeRequestCanBeAssignedReviewersResponse.class)
                .withName("ListGroupMergeRequestCanBeAssignedReviewers")
                .withUri("/v4/groups/{group_id}/merge-requests/reviewers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestCanBeAssignedReviewersRequest::getGroupId,
                ListGroupMergeRequestCanBeAssignedReviewersRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestCanBeAssignedReviewersRequest::getOffset,
                ListGroupMergeRequestCanBeAssignedReviewersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestCanBeAssignedReviewersRequest::getLimit,
                ListGroupMergeRequestCanBeAssignedReviewersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupMergeRequestTemplatesRequest, ListGroupMergeRequestTemplatesResponse> listGroupMergeRequestTemplates =
        genForListGroupMergeRequestTemplates();

    private static HttpRequestDef<ListGroupMergeRequestTemplatesRequest, ListGroupMergeRequestTemplatesResponse> genForListGroupMergeRequestTemplates() {
        // basic
        HttpRequestDef.Builder<ListGroupMergeRequestTemplatesRequest, ListGroupMergeRequestTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGroupMergeRequestTemplatesRequest.class,
                    ListGroupMergeRequestTemplatesResponse.class)
                .withName("ListGroupMergeRequestTemplates")
                .withUri("/v4/groups/{group_id}/merge-requests/templates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestTemplatesRequest::getGroupId,
                ListGroupMergeRequestTemplatesRequest::setGroupId));
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupMergeRequestTemplatesRequest::getTemplateName,
                ListGroupMergeRequestTemplatesRequest::setTemplateName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestTemplatesRequest::getOffset,
                ListGroupMergeRequestTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestTemplatesRequest::getLimit,
                ListGroupMergeRequestTemplatesRequest::setLimit));

        // response
        builder.<List<GroupMergeRequestTemplateDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListGroupMergeRequestTemplatesResponse::getBody,
                    ListGroupMergeRequestTemplatesResponse::setBody)
                .withInnerContainerType(GroupMergeRequestTemplateDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupMergeRequestValidAssignedCandidatesRequest, ListGroupMergeRequestValidAssignedCandidatesResponse> listGroupMergeRequestValidAssignedCandidates =
        genForListGroupMergeRequestValidAssignedCandidates();

    private static HttpRequestDef<ListGroupMergeRequestValidAssignedCandidatesRequest, ListGroupMergeRequestValidAssignedCandidatesResponse> genForListGroupMergeRequestValidAssignedCandidates() {
        // basic
        HttpRequestDef.Builder<ListGroupMergeRequestValidAssignedCandidatesRequest, ListGroupMergeRequestValidAssignedCandidatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGroupMergeRequestValidAssignedCandidatesRequest.class,
                    ListGroupMergeRequestValidAssignedCandidatesResponse.class)
                .withName("ListGroupMergeRequestValidAssignedCandidates")
                .withUri("/v4/groups/{group_id}/merge-requests/assignee-candidates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestValidAssignedCandidatesRequest::getGroupId,
                ListGroupMergeRequestValidAssignedCandidatesRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestValidAssignedCandidatesRequest::getOffset,
                ListGroupMergeRequestValidAssignedCandidatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMergeRequestValidAssignedCandidatesRequest::getLimit,
                ListGroupMergeRequestValidAssignedCandidatesRequest::setLimit));

        // response
        builder.<List<MergeRequestVoteReviewerDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListGroupMergeRequestValidAssignedCandidatesResponse::getBody,
                    ListGroupMergeRequestValidAssignedCandidatesResponse::setBody)
                .withInnerContainerType(MergeRequestVoteReviewerDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestApproverSettingsRequest, ListMergeRequestApproverSettingsResponse> listMergeRequestApproverSettings =
        genForListMergeRequestApproverSettings();

    private static HttpRequestDef<ListMergeRequestApproverSettingsRequest, ListMergeRequestApproverSettingsResponse> genForListMergeRequestApproverSettings() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestApproverSettingsRequest, ListMergeRequestApproverSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestApproverSettingsRequest.class,
                    ListMergeRequestApproverSettingsResponse.class)
                .withName("ListMergeRequestApproverSettings")
                .withUri("/v4/repositories/{repository_id}/approver-settings")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestApproverSettingsRequest::getRepositoryId,
                ListMergeRequestApproverSettingsRequest::setRepositoryId));
        builder.<ListMergeRequestApproverSettingsRequest.TargetTypeEnum>withRequestField("target_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMergeRequestApproverSettingsRequest.TargetTypeEnum.class),
            f -> f.withMarshaller(ListMergeRequestApproverSettingsRequest::getTargetType,
                ListMergeRequestApproverSettingsRequest::setTargetType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestApproverSettingsRequest::getOffset,
                ListMergeRequestApproverSettingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestApproverSettingsRequest::getLimit,
                ListMergeRequestApproverSettingsRequest::setLimit));

        // response
        builder.<List<MergeRequestApproverSettingResultDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListMergeRequestApproverSettingsResponse::getBody,
                    ListMergeRequestApproverSettingsResponse::setBody)
                .withInnerContainerType(MergeRequestApproverSettingResultDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestApproversRequest, ListMergeRequestApproversResponse> listMergeRequestApprovers =
        genForListMergeRequestApprovers();

    private static HttpRequestDef<ListMergeRequestApproversRequest, ListMergeRequestApproversResponse> genForListMergeRequestApprovers() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestApproversRequest, ListMergeRequestApproversResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestApproversRequest.class,
                    ListMergeRequestApproversResponse.class)
                .withName("ListMergeRequestApprovers")
                .withUri("/v4/repositories/{repository_id}/merge-requests/approval-approvers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestApproversRequest::getRepositoryId,
                ListMergeRequestApproversRequest::setRepositoryId));
        builder.<String>withRequestField("target_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestApproversRequest::getTargetBranch,
                ListMergeRequestApproversRequest::setTargetBranch));
        builder.<String>withRequestField("source_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestApproversRequest::getSourceBranch,
                ListMergeRequestApproversRequest::setSourceBranch));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestApproversRequest::getMergeRequestIid,
                ListMergeRequestApproversRequest::setMergeRequestIid));
        builder.<String>withRequestField("target_repository_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestApproversRequest::getTargetRepositoryId,
                ListMergeRequestApproversRequest::setTargetRepositoryId));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestApproversRequest::getSearch,
                ListMergeRequestApproversRequest::setSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestApproversRequest::getOffset,
                ListMergeRequestApproversRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestApproversRequest::getLimit,
                ListMergeRequestApproversRequest::setLimit));

        // response

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMergeRequestApproversResponse::getXTotal,
                ListMergeRequestApproversResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestChangesRequest, ListMergeRequestChangesResponse> listMergeRequestChanges =
        genForListMergeRequestChanges();

    private static HttpRequestDef<ListMergeRequestChangesRequest, ListMergeRequestChangesResponse> genForListMergeRequestChanges() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestChangesRequest, ListMergeRequestChangesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMergeRequestChangesRequest.class, ListMergeRequestChangesResponse.class)
            .withName("ListMergeRequestChanges")
            .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/changes")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesRequest::getRepositoryId,
                ListMergeRequestChangesRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesRequest::getMergeRequestIid,
                ListMergeRequestChangesRequest::setMergeRequestIid));
        builder.<Boolean>withRequestField("ignore_whitespace_change",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMergeRequestChangesRequest::getIgnoreWhitespaceChange,
                ListMergeRequestChangesRequest::setIgnoreWhitespaceChange));
        builder.<Boolean>withRequestField("force_encode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMergeRequestChangesRequest::getForceEncode,
                ListMergeRequestChangesRequest::setForceEncode));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestChangesRequest::getFilePath,
                ListMergeRequestChangesRequest::setFilePath));
        builder.<Integer>withRequestField("from_diff_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesRequest::getFromDiffId,
                ListMergeRequestChangesRequest::setFromDiffId));
        builder.<Integer>withRequestField("to_diff_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesRequest::getToDiffId,
                ListMergeRequestChangesRequest::setToDiffId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesRequest::getOffset,
                ListMergeRequestChangesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesRequest::getLimit, ListMergeRequestChangesRequest::setLimit));

        // response
        builder.<List<SimpleMergeRequestChangesDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMergeRequestChangesResponse::getBody, ListMergeRequestChangesResponse::setBody)
                .withInnerContainerType(SimpleMergeRequestChangesDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestChangesTreesRequest, ListMergeRequestChangesTreesResponse> listMergeRequestChangesTrees =
        genForListMergeRequestChangesTrees();

    private static HttpRequestDef<ListMergeRequestChangesTreesRequest, ListMergeRequestChangesTreesResponse> genForListMergeRequestChangesTrees() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestChangesTreesRequest, ListMergeRequestChangesTreesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestChangesTreesRequest.class,
                    ListMergeRequestChangesTreesResponse.class)
                .withName("ListMergeRequestChangesTrees")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/changes-trees")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesTreesRequest::getRepositoryId,
                ListMergeRequestChangesTreesRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesTreesRequest::getMergeRequestIid,
                ListMergeRequestChangesTreesRequest::setMergeRequestIid));
        builder.<Integer>withRequestField("approval_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesTreesRequest::getApprovalUserId,
                ListMergeRequestChangesTreesRequest::setApprovalUserId));
        builder.<String>withRequestField("commit_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestChangesTreesRequest::getCommitId,
                ListMergeRequestChangesTreesRequest::setCommitId));
        builder.<Integer>withRequestField("from_diff_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesTreesRequest::getFromDiffId,
                ListMergeRequestChangesTreesRequest::setFromDiffId));
        builder.<Integer>withRequestField("to_diff_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesTreesRequest::getToDiffId,
                ListMergeRequestChangesTreesRequest::setToDiffId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesTreesRequest::getOffset,
                ListMergeRequestChangesTreesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestChangesTreesRequest::getLimit,
                ListMergeRequestChangesTreesRequest::setLimit));

        // response
        builder.<List<ChangesTreeDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListMergeRequestChangesTreesResponse::getBody,
                    ListMergeRequestChangesTreesResponse::setBody)
                .withInnerContainerType(ChangesTreeDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestCommitsRequest, ListMergeRequestCommitsResponse> listMergeRequestCommits =
        genForListMergeRequestCommits();

    private static HttpRequestDef<ListMergeRequestCommitsRequest, ListMergeRequestCommitsResponse> genForListMergeRequestCommits() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestCommitsRequest, ListMergeRequestCommitsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMergeRequestCommitsRequest.class, ListMergeRequestCommitsResponse.class)
            .withName("ListMergeRequestCommits")
            .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/commits")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestCommitsRequest::getRepositoryId,
                ListMergeRequestCommitsRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestCommitsRequest::getMergeRequestIid,
                ListMergeRequestCommitsRequest::setMergeRequestIid));
        builder.<ListMergeRequestCommitsRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMergeRequestCommitsRequest.ViewEnum.class),
            f -> f.withMarshaller(ListMergeRequestCommitsRequest::getView, ListMergeRequestCommitsRequest::setView));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestCommitsRequest::getOffset,
                ListMergeRequestCommitsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestCommitsRequest::getLimit, ListMergeRequestCommitsRequest::setLimit));

        // response
        builder.<List<MergeRequestCommitDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMergeRequestCommitsResponse::getBody, ListMergeRequestCommitsResponse::setBody)
                .withInnerContainerType(MergeRequestCommitDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestConflictFilesRequest, ListMergeRequestConflictFilesResponse> listMergeRequestConflictFiles =
        genForListMergeRequestConflictFiles();

    private static HttpRequestDef<ListMergeRequestConflictFilesRequest, ListMergeRequestConflictFilesResponse> genForListMergeRequestConflictFiles() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestConflictFilesRequest, ListMergeRequestConflictFilesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestConflictFilesRequest.class,
                    ListMergeRequestConflictFilesResponse.class)
                .withName("ListMergeRequestConflictFiles")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/conflict-files")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestConflictFilesRequest::getRepositoryId,
                ListMergeRequestConflictFilesRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestConflictFilesRequest::getMergeRequestIid,
                ListMergeRequestConflictFilesRequest::setMergeRequestIid));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestConflictFilesRequest::getOffset,
                ListMergeRequestConflictFilesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestConflictFilesRequest::getLimit,
                ListMergeRequestConflictFilesRequest::setLimit));
        builder.<Boolean>withRequestField("hide_content",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMergeRequestConflictFilesRequest::getHideContent,
                ListMergeRequestConflictFilesRequest::setHideContent));

        // response
        builder.<List<MRConflictFileDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListMergeRequestConflictFilesResponse::getBody,
                    ListMergeRequestConflictFilesResponse::setBody)
                .withInnerContainerType(MRConflictFileDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestEvaluationsRequest, ListMergeRequestEvaluationsResponse> listMergeRequestEvaluations =
        genForListMergeRequestEvaluations();

    private static HttpRequestDef<ListMergeRequestEvaluationsRequest, ListMergeRequestEvaluationsResponse> genForListMergeRequestEvaluations() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestEvaluationsRequest, ListMergeRequestEvaluationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestEvaluationsRequest.class,
                    ListMergeRequestEvaluationsResponse.class)
                .withName("ListMergeRequestEvaluations")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/evaluations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestEvaluationsRequest::getRepositoryId,
                ListMergeRequestEvaluationsRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestEvaluationsRequest::getMergeRequestIid,
                ListMergeRequestEvaluationsRequest::setMergeRequestIid));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestEvaluationsRequest::getOffset,
                ListMergeRequestEvaluationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestEvaluationsRequest::getLimit,
                ListMergeRequestEvaluationsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestParticipantsRequest, ListMergeRequestParticipantsResponse> listMergeRequestParticipants =
        genForListMergeRequestParticipants();

    private static HttpRequestDef<ListMergeRequestParticipantsRequest, ListMergeRequestParticipantsResponse> genForListMergeRequestParticipants() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestParticipantsRequest, ListMergeRequestParticipantsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestParticipantsRequest.class,
                    ListMergeRequestParticipantsResponse.class)
                .withName("ListMergeRequestParticipants")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/participants")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestParticipantsRequest::getRepositoryId,
                ListMergeRequestParticipantsRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestParticipantsRequest::getMergeRequestIid,
                ListMergeRequestParticipantsRequest::setMergeRequestIid));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestParticipantsRequest::getOffset,
                ListMergeRequestParticipantsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestParticipantsRequest::getLimit,
                ListMergeRequestParticipantsRequest::setLimit));

        // response
        builder.<List<UserBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListMergeRequestParticipantsResponse::getBody,
                    ListMergeRequestParticipantsResponse::setBody)
                .withInnerContainerType(UserBasicDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse> listMergeRequestReviewers =
        genForListMergeRequestReviewers();

    private static HttpRequestDef<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse> genForListMergeRequestReviewers() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestReviewersRequest.class,
                    ListMergeRequestReviewersResponse.class)
                .withName("ListMergeRequestReviewers")
                .withUri("/v4/repositories/{repository_id}/merge-requests/approval-reviewers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getRepositoryId,
                ListMergeRequestReviewersRequest::setRepositoryId));
        builder.<String>withRequestField("target_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getTargetBranch,
                ListMergeRequestReviewersRequest::setTargetBranch));
        builder.<String>withRequestField("source_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getSourceBranch,
                ListMergeRequestReviewersRequest::setSourceBranch));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getMergeRequestIid,
                ListMergeRequestReviewersRequest::setMergeRequestIid));
        builder.<String>withRequestField("target_repository_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getTargetRepositoryId,
                ListMergeRequestReviewersRequest::setTargetRepositoryId));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getSearch,
                ListMergeRequestReviewersRequest::setSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getOffset,
                ListMergeRequestReviewersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getLimit,
                ListMergeRequestReviewersRequest::setLimit));

        // response

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMergeRequestReviewersResponse::getXTotal,
                ListMergeRequestReviewersResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestTemplatesRequest, ListMergeRequestTemplatesResponse> listMergeRequestTemplates =
        genForListMergeRequestTemplates();

    private static HttpRequestDef<ListMergeRequestTemplatesRequest, ListMergeRequestTemplatesResponse> genForListMergeRequestTemplates() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestTemplatesRequest, ListMergeRequestTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestTemplatesRequest.class,
                    ListMergeRequestTemplatesResponse.class)
                .withName("ListMergeRequestTemplates")
                .withUri("/v4/repositories/{repository_id}/merge-requests/templates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestTemplatesRequest::getRepositoryId,
                ListMergeRequestTemplatesRequest::setRepositoryId));
        builder.<ListMergeRequestTemplatesRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMergeRequestTemplatesRequest.ViewEnum.class),
            f -> f.withMarshaller(ListMergeRequestTemplatesRequest::getView,
                ListMergeRequestTemplatesRequest::setView));
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestTemplatesRequest::getTemplateName,
                ListMergeRequestTemplatesRequest::setTemplateName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestTemplatesRequest::getOffset,
                ListMergeRequestTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestTemplatesRequest::getLimit,
                ListMergeRequestTemplatesRequest::setLimit));

        // response
        builder.<List<RepositoryMergeRequestTemplateDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListMergeRequestTemplatesResponse::getBody, ListMergeRequestTemplatesResponse::setBody)
                .withInnerContainerType(RepositoryMergeRequestTemplateDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestValidAssignedCandidatesRequest, ListMergeRequestValidAssignedCandidatesResponse> listMergeRequestValidAssignedCandidates =
        genForListMergeRequestValidAssignedCandidates();

    private static HttpRequestDef<ListMergeRequestValidAssignedCandidatesRequest, ListMergeRequestValidAssignedCandidatesResponse> genForListMergeRequestValidAssignedCandidates() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestValidAssignedCandidatesRequest, ListMergeRequestValidAssignedCandidatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestValidAssignedCandidatesRequest.class,
                    ListMergeRequestValidAssignedCandidatesResponse.class)
                .withName("ListMergeRequestValidAssignedCandidates")
                .withUri("/v4/repositories/{repository_id}/merge-requests/assignee-candidates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestValidAssignedCandidatesRequest::getRepositoryId,
                ListMergeRequestValidAssignedCandidatesRequest::setRepositoryId));
        builder.<String>withRequestField("target_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestValidAssignedCandidatesRequest::getTargetBranch,
                ListMergeRequestValidAssignedCandidatesRequest::setTargetBranch));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestValidAssignedCandidatesRequest::getMergeRequestIid,
                ListMergeRequestValidAssignedCandidatesRequest::setMergeRequestIid));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestValidAssignedCandidatesRequest::getOffset,
                ListMergeRequestValidAssignedCandidatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestValidAssignedCandidatesRequest::getLimit,
                ListMergeRequestValidAssignedCandidatesRequest::setLimit));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestValidAssignedCandidatesRequest::getSearch,
                ListMergeRequestValidAssignedCandidatesRequest::setSearch));
        builder.<String>withRequestField("search_by_name_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestValidAssignedCandidatesRequest::getSearchByNameList,
                ListMergeRequestValidAssignedCandidatesRequest::setSearchByNameList));
        builder.<String>withRequestField("target_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestValidAssignedCandidatesRequest::getTargetProjectId,
                ListMergeRequestValidAssignedCandidatesRequest::setTargetProjectId));
        builder.<ListMergeRequestValidAssignedCandidatesRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMergeRequestValidAssignedCandidatesRequest.ViewEnum.class),
            f -> f.withMarshaller(ListMergeRequestValidAssignedCandidatesRequest::getView,
                ListMergeRequestValidAssignedCandidatesRequest::setView));
        builder.<ListMergeRequestValidAssignedCandidatesRequest.ModeEnum>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMergeRequestValidAssignedCandidatesRequest.ModeEnum.class),
            f -> f.withMarshaller(ListMergeRequestValidAssignedCandidatesRequest::getMode,
                ListMergeRequestValidAssignedCandidatesRequest::setMode));
        builder.<Boolean>withRequestField("only_developers",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMergeRequestValidAssignedCandidatesRequest::getOnlyDevelopers,
                ListMergeRequestValidAssignedCandidatesRequest::setOnlyDevelopers));

        // response
        builder.<List<MRVoteReviewerDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListMergeRequestValidAssignedCandidatesResponse::getBody,
                    ListMergeRequestValidAssignedCandidatesResponse::setBody)
                .withInnerContainerType(MRVoteReviewerDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestVersionsRequest, ListMergeRequestVersionsResponse> listMergeRequestVersions =
        genForListMergeRequestVersions();

    private static HttpRequestDef<ListMergeRequestVersionsRequest, ListMergeRequestVersionsResponse> genForListMergeRequestVersions() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestVersionsRequest, ListMergeRequestVersionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListMergeRequestVersionsRequest.class, ListMergeRequestVersionsResponse.class)
                .withName("ListMergeRequestVersions")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/versions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestVersionsRequest::getRepositoryId,
                ListMergeRequestVersionsRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestVersionsRequest::getMergeRequestIid,
                ListMergeRequestVersionsRequest::setMergeRequestIid));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestVersionsRequest::getOffset,
                ListMergeRequestVersionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestVersionsRequest::getLimit,
                ListMergeRequestVersionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPersonalMergeRequestsRequest, ListPersonalMergeRequestsResponse> listPersonalMergeRequests =
        genForListPersonalMergeRequests();

    private static HttpRequestDef<ListPersonalMergeRequestsRequest, ListPersonalMergeRequestsResponse> genForListPersonalMergeRequests() {
        // basic
        HttpRequestDef.Builder<ListPersonalMergeRequestsRequest, ListPersonalMergeRequestsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPersonalMergeRequestsRequest.class,
                    ListPersonalMergeRequestsResponse.class)
                .withName("ListPersonalMergeRequests")
                .withUri("/v4/merge-requests")
                .withContentType("application/json");

        // requests
        builder.<ListPersonalMergeRequestsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPersonalMergeRequestsRequest.StateEnum.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getState,
                ListPersonalMergeRequestsRequest::setState));
        builder.<ListPersonalMergeRequestsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPersonalMergeRequestsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getOrderBy,
                ListPersonalMergeRequestsRequest::setOrderBy));
        builder.<ListPersonalMergeRequestsRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPersonalMergeRequestsRequest.SortEnum.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getSort,
                ListPersonalMergeRequestsRequest::setSort));
        builder.<String>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getLabels,
                ListPersonalMergeRequestsRequest::setLabels));
        builder.<OffsetDateTime>withRequestField("created_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getCreatedBefore,
                ListPersonalMergeRequestsRequest::setCreatedBefore));
        builder.<OffsetDateTime>withRequestField("created_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getCreatedAfter,
                ListPersonalMergeRequestsRequest::setCreatedAfter));
        builder.<OffsetDateTime>withRequestField("updated_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getUpdatedAfter,
                ListPersonalMergeRequestsRequest::setUpdatedAfter));
        builder.<OffsetDateTime>withRequestField("updated_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getUpdatedBefore,
                ListPersonalMergeRequestsRequest::setUpdatedBefore));
        builder.<ListPersonalMergeRequestsRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPersonalMergeRequestsRequest.ViewEnum.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getView,
                ListPersonalMergeRequestsRequest::setView));
        builder.<String>withRequestField("author_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getAuthorId,
                ListPersonalMergeRequestsRequest::setAuthorId));
        builder.<ListPersonalMergeRequestsRequest.ScopeEnum>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPersonalMergeRequestsRequest.ScopeEnum.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getScope,
                ListPersonalMergeRequestsRequest::setScope));
        builder.<String>withRequestField("source_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getSourceBranch,
                ListPersonalMergeRequestsRequest::setSourceBranch));
        builder.<String>withRequestField("target_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getTargetBranch,
                ListPersonalMergeRequestsRequest::setTargetBranch));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getSearch,
                ListPersonalMergeRequestsRequest::setSearch));
        builder.<ListPersonalMergeRequestsRequest.WipEnum>withRequestField("wip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPersonalMergeRequestsRequest.WipEnum.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getWip, ListPersonalMergeRequestsRequest::setWip));
        builder.<String>withRequestField("merged_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getMergedBy,
                ListPersonalMergeRequestsRequest::setMergedBy));
        builder.<OffsetDateTime>withRequestField("merged_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getMergedAfter,
                ListPersonalMergeRequestsRequest::setMergedAfter));
        builder.<OffsetDateTime>withRequestField("merged_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getMergedBefore,
                ListPersonalMergeRequestsRequest::setMergedBefore));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getOffset,
                ListPersonalMergeRequestsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getLimit,
                ListPersonalMergeRequestsRequest::setLimit));
        builder.<Boolean>withRequestField("only_count",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPersonalMergeRequestsRequest::getOnlyCount,
                ListPersonalMergeRequestsRequest::setOnlyCount));

        // response
        builder.<List<MergeRequestListBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListPersonalMergeRequestsResponse::getBody, ListPersonalMergeRequestsResponse::setBody)
                .withInnerContainerType(MergeRequestListBasicDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectMergeRequestApproverSettingsRequest, ListProjectMergeRequestApproverSettingsResponse> listProjectMergeRequestApproverSettings =
        genForListProjectMergeRequestApproverSettings();

    private static HttpRequestDef<ListProjectMergeRequestApproverSettingsRequest, ListProjectMergeRequestApproverSettingsResponse> genForListProjectMergeRequestApproverSettings() {
        // basic
        HttpRequestDef.Builder<ListProjectMergeRequestApproverSettingsRequest, ListProjectMergeRequestApproverSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectMergeRequestApproverSettingsRequest.class,
                    ListProjectMergeRequestApproverSettingsResponse.class)
                .withName("ListProjectMergeRequestApproverSettings")
                .withUri("/v4/projects/{project_id}/approver-settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectMergeRequestApproverSettingsRequest::getProjectId,
                ListProjectMergeRequestApproverSettingsRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMergeRequestApproverSettingsRequest::getOffset,
                ListProjectMergeRequestApproverSettingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMergeRequestApproverSettingsRequest::getLimit,
                ListProjectMergeRequestApproverSettingsRequest::setLimit));

        // response
        builder.<List<MergeRequestApproverSettingResultDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListProjectMergeRequestApproverSettingsResponse::getBody,
                    ListProjectMergeRequestApproverSettingsResponse::setBody)
                .withInnerContainerType(MergeRequestApproverSettingResultDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectMergeRequestCanBeAssignedReviewersRequest, ListProjectMergeRequestCanBeAssignedReviewersResponse> listProjectMergeRequestCanBeAssignedReviewers =
        genForListProjectMergeRequestCanBeAssignedReviewers();

    private static HttpRequestDef<ListProjectMergeRequestCanBeAssignedReviewersRequest, ListProjectMergeRequestCanBeAssignedReviewersResponse> genForListProjectMergeRequestCanBeAssignedReviewers() {
        // basic
        HttpRequestDef.Builder<ListProjectMergeRequestCanBeAssignedReviewersRequest, ListProjectMergeRequestCanBeAssignedReviewersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectMergeRequestCanBeAssignedReviewersRequest.class,
                    ListProjectMergeRequestCanBeAssignedReviewersResponse.class)
                .withName("ListProjectMergeRequestCanBeAssignedReviewers")
                .withUri("/v4/projects/{project_id}/merge-requests/reviewers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectMergeRequestCanBeAssignedReviewersRequest::getProjectId,
                ListProjectMergeRequestCanBeAssignedReviewersRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMergeRequestCanBeAssignedReviewersRequest::getOffset,
                ListProjectMergeRequestCanBeAssignedReviewersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMergeRequestCanBeAssignedReviewersRequest::getLimit,
                ListProjectMergeRequestCanBeAssignedReviewersRequest::setLimit));

        // response
        builder.<List<MergeRequestVoteReviewerDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListProjectMergeRequestCanBeAssignedReviewersResponse::getBody,
                    ListProjectMergeRequestCanBeAssignedReviewersResponse::setBody)
                .withInnerContainerType(MergeRequestVoteReviewerDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectMergeRequestCanBeAssignedUsersRequest, ListProjectMergeRequestCanBeAssignedUsersResponse> listProjectMergeRequestCanBeAssignedUsers =
        genForListProjectMergeRequestCanBeAssignedUsers();

    private static HttpRequestDef<ListProjectMergeRequestCanBeAssignedUsersRequest, ListProjectMergeRequestCanBeAssignedUsersResponse> genForListProjectMergeRequestCanBeAssignedUsers() {
        // basic
        HttpRequestDef.Builder<ListProjectMergeRequestCanBeAssignedUsersRequest, ListProjectMergeRequestCanBeAssignedUsersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectMergeRequestCanBeAssignedUsersRequest.class,
                    ListProjectMergeRequestCanBeAssignedUsersResponse.class)
                .withName("ListProjectMergeRequestCanBeAssignedUsers")
                .withUri("/v4/projects/{project_id}/merge-requests/assignee-candidates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectMergeRequestCanBeAssignedUsersRequest::getProjectId,
                ListProjectMergeRequestCanBeAssignedUsersRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMergeRequestCanBeAssignedUsersRequest::getOffset,
                ListProjectMergeRequestCanBeAssignedUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMergeRequestCanBeAssignedUsersRequest::getLimit,
                ListProjectMergeRequestCanBeAssignedUsersRequest::setLimit));

        // response
        builder.<List<MergeRequestVoteReviewerDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListProjectMergeRequestCanBeAssignedUsersResponse::getBody,
                    ListProjectMergeRequestCanBeAssignedUsersResponse::setBody)
                .withInnerContainerType(MergeRequestVoteReviewerDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectMergeRequestTemplatesRequest, ListProjectMergeRequestTemplatesResponse> listProjectMergeRequestTemplates =
        genForListProjectMergeRequestTemplates();

    private static HttpRequestDef<ListProjectMergeRequestTemplatesRequest, ListProjectMergeRequestTemplatesResponse> genForListProjectMergeRequestTemplates() {
        // basic
        HttpRequestDef.Builder<ListProjectMergeRequestTemplatesRequest, ListProjectMergeRequestTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectMergeRequestTemplatesRequest.class,
                    ListProjectMergeRequestTemplatesResponse.class)
                .withName("ListProjectMergeRequestTemplates")
                .withUri("/v4/projects/{project_id}/merge-requests/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectMergeRequestTemplatesRequest::getProjectId,
                ListProjectMergeRequestTemplatesRequest::setProjectId));
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectMergeRequestTemplatesRequest::getTemplateName,
                ListProjectMergeRequestTemplatesRequest::setTemplateName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMergeRequestTemplatesRequest::getOffset,
                ListProjectMergeRequestTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMergeRequestTemplatesRequest::getLimit,
                ListProjectMergeRequestTemplatesRequest::setLimit));

        // response
        builder.<List<ProjectMergeRequestTemplateDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListProjectMergeRequestTemplatesResponse::getBody,
                    ListProjectMergeRequestTemplatesResponse::setBody)
                .withInnerContainerType(ProjectMergeRequestTemplateDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryMergeRequestsRequest, ListRepositoryMergeRequestsResponse> listRepositoryMergeRequests =
        genForListRepositoryMergeRequests();

    private static HttpRequestDef<ListRepositoryMergeRequestsRequest, ListRepositoryMergeRequestsResponse> genForListRepositoryMergeRequests() {
        // basic
        HttpRequestDef.Builder<ListRepositoryMergeRequestsRequest, ListRepositoryMergeRequestsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRepositoryMergeRequestsRequest.class,
                    ListRepositoryMergeRequestsResponse.class)
                .withName("ListRepositoryMergeRequests")
                .withUri("/v4/repositories/{repository_id}/merge-requests")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getRepositoryId,
                ListRepositoryMergeRequestsRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getOffset,
                ListRepositoryMergeRequestsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getLimit,
                ListRepositoryMergeRequestsRequest::setLimit));
        builder.<ListRepositoryMergeRequestsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryMergeRequestsRequest.StateEnum.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getState,
                ListRepositoryMergeRequestsRequest::setState));
        builder.<ListRepositoryMergeRequestsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryMergeRequestsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getOrderBy,
                ListRepositoryMergeRequestsRequest::setOrderBy));
        builder.<ListRepositoryMergeRequestsRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryMergeRequestsRequest.SortEnum.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getSort,
                ListRepositoryMergeRequestsRequest::setSort));
        builder.<String>withRequestField("author_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getAuthorId,
                ListRepositoryMergeRequestsRequest::setAuthorId));
        builder.<String>withRequestField("source_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getSourceBranch,
                ListRepositoryMergeRequestsRequest::setSourceBranch));
        builder.<String>withRequestField("target_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getTargetBranch,
                ListRepositoryMergeRequestsRequest::setTargetBranch));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getSearch,
                ListRepositoryMergeRequestsRequest::setSearch));
        builder.<Integer>withRequestField("source_repository_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getSourceRepositoryId,
                ListRepositoryMergeRequestsRequest::setSourceRepositoryId));
        builder.<Boolean>withRequestField("only_count",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getOnlyCount,
                ListRepositoryMergeRequestsRequest::setOnlyCount));
        builder.<String>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryMergeRequestsRequest::getLabels,
                ListRepositoryMergeRequestsRequest::setLabels));

        // response
        builder.<List<MergeRequestListBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListRepositoryMergeRequestsResponse::getBody,
                    ListRepositoryMergeRequestsResponse::setBody)
                .withInnerContainerType(MergeRequestListBasicDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<MergeMergeRequestRequest, MergeMergeRequestResponse> mergeMergeRequest =
        genForMergeMergeRequest();

    private static HttpRequestDef<MergeMergeRequestRequest, MergeMergeRequestResponse> genForMergeMergeRequest() {
        // basic
        HttpRequestDef.Builder<MergeMergeRequestRequest, MergeMergeRequestResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, MergeMergeRequestRequest.class, MergeMergeRequestResponse.class)
                .withName("MergeMergeRequest")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/merge")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(MergeMergeRequestRequest::getRepositoryId,
                MergeMergeRequestRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(MergeMergeRequestRequest::getMergeRequestIid,
                MergeMergeRequestRequest::setMergeRequestIid));
        builder.<MergeMergeRequestBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MergeMergeRequestBodyDto.class),
            f -> f.withMarshaller(MergeMergeRequestRequest::getBody, MergeMergeRequestRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebaseMergeRequestForOpenApiRequest, RebaseMergeRequestForOpenApiResponse> rebaseMergeRequestForOpenApi =
        genForRebaseMergeRequestForOpenApi();

    private static HttpRequestDef<RebaseMergeRequestForOpenApiRequest, RebaseMergeRequestForOpenApiResponse> genForRebaseMergeRequestForOpenApi() {
        // basic
        HttpRequestDef.Builder<RebaseMergeRequestForOpenApiRequest, RebaseMergeRequestForOpenApiResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    RebaseMergeRequestForOpenApiRequest.class,
                    RebaseMergeRequestForOpenApiResponse.class)
                .withName("RebaseMergeRequestForOpenApi")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/rebase")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RebaseMergeRequestForOpenApiRequest::getRepositoryId,
                RebaseMergeRequestForOpenApiRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RebaseMergeRequestForOpenApiRequest::getMergeRequestIid,
                RebaseMergeRequestForOpenApiRequest::setMergeRequestIid));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RebaseMergeRequestForOpenApiResponse::getBody,
                RebaseMergeRequestForOpenApiResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ResolveMergeRequestConflictsRequest, ResolveMergeRequestConflictsResponse> resolveMergeRequestConflicts =
        genForResolveMergeRequestConflicts();

    private static HttpRequestDef<ResolveMergeRequestConflictsRequest, ResolveMergeRequestConflictsResponse> genForResolveMergeRequestConflicts() {
        // basic
        HttpRequestDef.Builder<ResolveMergeRequestConflictsRequest, ResolveMergeRequestConflictsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ResolveMergeRequestConflictsRequest.class,
                    ResolveMergeRequestConflictsResponse.class)
                .withName("ResolveMergeRequestConflicts")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/resolve-conflicts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ResolveMergeRequestConflictsRequest::getRepositoryId,
                ResolveMergeRequestConflictsRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ResolveMergeRequestConflictsRequest::getMergeRequestIid,
                ResolveMergeRequestConflictsRequest::setMergeRequestIid));
        builder.<ResolveConflictDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResolveConflictDto.class),
            f -> f.withMarshaller(ResolveMergeRequestConflictsRequest::getBody,
                ResolveMergeRequestConflictsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReviewMergeRequestRequest, ReviewMergeRequestResponse> reviewMergeRequest =
        genForReviewMergeRequest();

    private static HttpRequestDef<ReviewMergeRequestRequest, ReviewMergeRequestResponse> genForReviewMergeRequest() {
        // basic
        HttpRequestDef.Builder<ReviewMergeRequestRequest, ReviewMergeRequestResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ReviewMergeRequestRequest.class, ReviewMergeRequestResponse.class)
                .withName("ReviewMergeRequest")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/approval-review")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ReviewMergeRequestRequest::getRepositoryId,
                ReviewMergeRequestRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ReviewMergeRequestRequest::getMergeRequestIid,
                ReviewMergeRequestRequest::setMergeRequestIid));
        builder.<ApprovalActionTypeDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApprovalActionTypeDto.class),
            f -> f.withMarshaller(ReviewMergeRequestRequest::getBody, ReviewMergeRequestRequest::setBody));

        // response
        builder.<List<ApproverBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ReviewMergeRequestResponse::getBody, ReviewMergeRequestResponse::setBody)
                .withInnerContainerType(ApproverBasicDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowActualHeadPipelineRequest, ShowActualHeadPipelineResponse> showActualHeadPipeline =
        genForShowActualHeadPipeline();

    private static HttpRequestDef<ShowActualHeadPipelineRequest, ShowActualHeadPipelineResponse> genForShowActualHeadPipeline() {
        // basic
        HttpRequestDef.Builder<ShowActualHeadPipelineRequest, ShowActualHeadPipelineResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowActualHeadPipelineRequest.class, ShowActualHeadPipelineResponse.class)
            .withName("ShowActualHeadPipeline")
            .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/actual-head-pipeline")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowActualHeadPipelineRequest::getRepositoryId,
                ShowActualHeadPipelineRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowActualHeadPipelineRequest::getMergeRequestIid,
                ShowActualHeadPipelineRequest::setMergeRequestIid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAverageEvaluationRequest, ShowAverageEvaluationResponse> showAverageEvaluation =
        genForShowAverageEvaluation();

    private static HttpRequestDef<ShowAverageEvaluationRequest, ShowAverageEvaluationResponse> genForShowAverageEvaluation() {
        // basic
        HttpRequestDef.Builder<ShowAverageEvaluationRequest, ShowAverageEvaluationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAverageEvaluationRequest.class, ShowAverageEvaluationResponse.class)
            .withName("ShowAverageEvaluation")
            .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/average-evaluation")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAverageEvaluationRequest::getRepositoryId,
                ShowAverageEvaluationRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAverageEvaluationRequest::getMergeRequestIid,
                ShowAverageEvaluationRequest::setMergeRequestIid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBranchConflictRequest, ShowBranchConflictResponse> showBranchConflict =
        genForShowBranchConflict();

    private static HttpRequestDef<ShowBranchConflictRequest, ShowBranchConflictResponse> genForShowBranchConflict() {
        // basic
        HttpRequestDef.Builder<ShowBranchConflictRequest, ShowBranchConflictResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBranchConflictRequest.class, ShowBranchConflictResponse.class)
                .withName("ShowBranchConflict")
                .withUri("/v4/repositories/{repository_id}/merge-requests/conflict")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBranchConflictRequest::getRepositoryId,
                ShowBranchConflictRequest::setRepositoryId));
        builder.<Integer>withRequestField("source_repository_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBranchConflictRequest::getSourceRepositoryId,
                ShowBranchConflictRequest::setSourceRepositoryId));
        builder.<String>withRequestField("source_branch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBranchConflictRequest::getSourceBranch,
                ShowBranchConflictRequest::setSourceBranch));
        builder.<String>withRequestField("target_branch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBranchConflictRequest::getTargetBranch,
                ShowBranchConflictRequest::setTargetBranch));
        builder.<Integer>withRequestField("target_repository_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBranchConflictRequest::getTargetRepositoryId,
                ShowBranchConflictRequest::setTargetRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommitCommentsByLineRequest, ShowCommitCommentsByLineResponse> showCommitCommentsByLine =
        genForShowCommitCommentsByLine();

    private static HttpRequestDef<ShowCommitCommentsByLineRequest, ShowCommitCommentsByLineResponse> genForShowCommitCommentsByLine() {
        // basic
        HttpRequestDef.Builder<ShowCommitCommentsByLineRequest, ShowCommitCommentsByLineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowCommitCommentsByLineRequest.class, ShowCommitCommentsByLineResponse.class)
                .withName("ShowCommitCommentsByLine")
                .withUri("/v4/repositories/{repository_id}/commits/{sha}/comments-by-line")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitCommentsByLineRequest::getRepositoryId,
                ShowCommitCommentsByLineRequest::setRepositoryId));
        builder.<String>withRequestField("sha",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitCommentsByLineRequest::getSha, ShowCommitCommentsByLineRequest::setSha));

        // response
        builder.<List<CommentPathDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowCommitCommentsByLineResponse::getBody, ShowCommitCommentsByLineResponse::setBody)
                .withInnerContainerType(CommentPathDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupMergeRequestSettingRequest, ShowGroupMergeRequestSettingResponse> showGroupMergeRequestSetting =
        genForShowGroupMergeRequestSetting();

    private static HttpRequestDef<ShowGroupMergeRequestSettingRequest, ShowGroupMergeRequestSettingResponse> genForShowGroupMergeRequestSetting() {
        // basic
        HttpRequestDef.Builder<ShowGroupMergeRequestSettingRequest, ShowGroupMergeRequestSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGroupMergeRequestSettingRequest.class,
                    ShowGroupMergeRequestSettingResponse.class)
                .withName("ShowGroupMergeRequestSetting")
                .withUri("/v4/groups/{group_id}/merge-requests/setting")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupMergeRequestSettingRequest::getGroupId,
                ShowGroupMergeRequestSettingRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeRequestCommentsByLineRequest, ShowMergeRequestCommentsByLineResponse> showMergeRequestCommentsByLine =
        genForShowMergeRequestCommentsByLine();

    private static HttpRequestDef<ShowMergeRequestCommentsByLineRequest, ShowMergeRequestCommentsByLineResponse> genForShowMergeRequestCommentsByLine() {
        // basic
        HttpRequestDef.Builder<ShowMergeRequestCommentsByLineRequest, ShowMergeRequestCommentsByLineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMergeRequestCommentsByLineRequest.class,
                    ShowMergeRequestCommentsByLineResponse.class)
                .withName("ShowMergeRequestCommentsByLine")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/comments-by-line")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestCommentsByLineRequest::getRepositoryId,
                ShowMergeRequestCommentsByLineRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestCommentsByLineRequest::getMergeRequestIid,
                ShowMergeRequestCommentsByLineRequest::setMergeRequestIid));
        builder.<Integer>withRequestField("line",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestCommentsByLineRequest::getLine,
                ShowMergeRequestCommentsByLineRequest::setLine));
        builder.<Boolean>withRequestField("with_commit_comments",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowMergeRequestCommentsByLineRequest::getWithCommitComments,
                ShowMergeRequestCommentsByLineRequest::setWithCommitComments));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMergeRequestCommentsByLineRequest::getPath,
                ShowMergeRequestCommentsByLineRequest::setPath));
        builder.<ShowMergeRequestCommentsByLineRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowMergeRequestCommentsByLineRequest.ViewEnum.class),
            f -> f.withMarshaller(ShowMergeRequestCommentsByLineRequest::getView,
                ShowMergeRequestCommentsByLineRequest::setView));
        builder.<String>withRequestField("base_sha",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMergeRequestCommentsByLineRequest::getBaseSha,
                ShowMergeRequestCommentsByLineRequest::setBaseSha));
        builder.<String>withRequestField("start_sha",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMergeRequestCommentsByLineRequest::getStartSha,
                ShowMergeRequestCommentsByLineRequest::setStartSha));
        builder.<String>withRequestField("head_sha",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMergeRequestCommentsByLineRequest::getHeadSha,
                ShowMergeRequestCommentsByLineRequest::setHeadSha));

        // response
        builder.<List<CommentPathDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowMergeRequestCommentsByLineResponse::getBody,
                    ShowMergeRequestCommentsByLineResponse::setBody)
                .withInnerContainerType(CommentPathDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeRequestDetailRequest, ShowMergeRequestDetailResponse> showMergeRequestDetail =
        genForShowMergeRequestDetail();

    private static HttpRequestDef<ShowMergeRequestDetailRequest, ShowMergeRequestDetailResponse> genForShowMergeRequestDetail() {
        // basic
        HttpRequestDef.Builder<ShowMergeRequestDetailRequest, ShowMergeRequestDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMergeRequestDetailRequest.class, ShowMergeRequestDetailResponse.class)
            .withName("ShowMergeRequestDetail")
            .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestDetailRequest::getRepositoryId,
                ShowMergeRequestDetailRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestDetailRequest::getMergeRequestIid,
                ShowMergeRequestDetailRequest::setMergeRequestIid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeRequestSettingRequest, ShowMergeRequestSettingResponse> showMergeRequestSetting =
        genForShowMergeRequestSetting();

    private static HttpRequestDef<ShowMergeRequestSettingRequest, ShowMergeRequestSettingResponse> genForShowMergeRequestSetting() {
        // basic
        HttpRequestDef.Builder<ShowMergeRequestSettingRequest, ShowMergeRequestSettingResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMergeRequestSettingRequest.class, ShowMergeRequestSettingResponse.class)
            .withName("ShowMergeRequestSetting")
            .withUri("/v4/repositories/{repository_id}/merge-requests/setting")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestSettingRequest::getRepositoryId,
                ShowMergeRequestSettingRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeRequestTemplateRequest, ShowMergeRequestTemplateResponse> showMergeRequestTemplate =
        genForShowMergeRequestTemplate();

    private static HttpRequestDef<ShowMergeRequestTemplateRequest, ShowMergeRequestTemplateResponse> genForShowMergeRequestTemplate() {
        // basic
        HttpRequestDef.Builder<ShowMergeRequestTemplateRequest, ShowMergeRequestTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowMergeRequestTemplateRequest.class, ShowMergeRequestTemplateResponse.class)
                .withName("ShowMergeRequestTemplate")
                .withUri("/v4/repositories/{repository_id}/merge-requests/template/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestTemplateRequest::getRepositoryId,
                ShowMergeRequestTemplateRequest::setRepositoryId));
        builder.<Integer>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestTemplateRequest::getTemplateId,
                ShowMergeRequestTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeRequestVotesDetailRequest, ShowMergeRequestVotesDetailResponse> showMergeRequestVotesDetail =
        genForShowMergeRequestVotesDetail();

    private static HttpRequestDef<ShowMergeRequestVotesDetailRequest, ShowMergeRequestVotesDetailResponse> genForShowMergeRequestVotesDetail() {
        // basic
        HttpRequestDef.Builder<ShowMergeRequestVotesDetailRequest, ShowMergeRequestVotesDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMergeRequestVotesDetailRequest.class,
                    ShowMergeRequestVotesDetailResponse.class)
                .withName("ShowMergeRequestVotesDetail")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/votes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestVotesDetailRequest::getRepositoryId,
                ShowMergeRequestVotesDetailRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestVotesDetailRequest::getMergeRequestIid,
                ShowMergeRequestVotesDetailRequest::setMergeRequestIid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeableStateOuterRequest, ShowMergeableStateOuterResponse> showMergeableStateOuter =
        genForShowMergeableStateOuter();

    private static HttpRequestDef<ShowMergeableStateOuterRequest, ShowMergeableStateOuterResponse> genForShowMergeableStateOuter() {
        // basic
        HttpRequestDef.Builder<ShowMergeableStateOuterRequest, ShowMergeableStateOuterResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMergeableStateOuterRequest.class, ShowMergeableStateOuterResponse.class)
            .withName("ShowMergeableStateOuter")
            .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/mergeable-state-out")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeableStateOuterRequest::getRepositoryId,
                ShowMergeableStateOuterRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeableStateOuterRequest::getMergeRequestIid,
                ShowMergeableStateOuterRequest::setMergeRequestIid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectMergeRequestSettingRequest, ShowProjectMergeRequestSettingResponse> showProjectMergeRequestSetting =
        genForShowProjectMergeRequestSetting();

    private static HttpRequestDef<ShowProjectMergeRequestSettingRequest, ShowProjectMergeRequestSettingResponse> genForShowProjectMergeRequestSetting() {
        // basic
        HttpRequestDef.Builder<ShowProjectMergeRequestSettingRequest, ShowProjectMergeRequestSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProjectMergeRequestSettingRequest.class,
                    ShowProjectMergeRequestSettingResponse.class)
                .withName("ShowProjectMergeRequestSetting")
                .withUri("/v4/projects/{project_id}/merge-requests/setting")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectMergeRequestSettingRequest::getProjectId,
                ShowProjectMergeRequestSettingRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryMergeRequestsStatisticRequest, ShowRepositoryMergeRequestsStatisticResponse> showRepositoryMergeRequestsStatistic =
        genForShowRepositoryMergeRequestsStatistic();

    private static HttpRequestDef<ShowRepositoryMergeRequestsStatisticRequest, ShowRepositoryMergeRequestsStatisticResponse> genForShowRepositoryMergeRequestsStatistic() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryMergeRequestsStatisticRequest, ShowRepositoryMergeRequestsStatisticResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRepositoryMergeRequestsStatisticRequest.class,
                    ShowRepositoryMergeRequestsStatisticResponse.class)
                .withName("ShowRepositoryMergeRequestsStatistic")
                .withUri("/v4/repositories/{repository_id}/merge-requests/statistic")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryMergeRequestsStatisticRequest::getRepositoryId,
                ShowRepositoryMergeRequestsStatisticRequest::setRepositoryId));
        builder.<String>withRequestField("iids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryMergeRequestsStatisticRequest::getIids,
                ShowRepositoryMergeRequestsStatisticRequest::setIids));
        builder.<ShowRepositoryMergeRequestsStatisticRequest.FieldsEnum>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowRepositoryMergeRequestsStatisticRequest.FieldsEnum.class),
            f -> f.withMarshaller(ShowRepositoryMergeRequestsStatisticRequest::getFields,
                ShowRepositoryMergeRequestsStatisticRequest::setFields));

        // response
        builder.<List<MergeRequestStatisticDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowRepositoryMergeRequestsStatisticResponse::getBody,
                    ShowRepositoryMergeRequestsStatisticResponse::setBody)
                .withInnerContainerType(MergeRequestStatisticDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupMergeRequestApproverSettingRequest, UpdateGroupMergeRequestApproverSettingResponse> updateGroupMergeRequestApproverSetting =
        genForUpdateGroupMergeRequestApproverSetting();

    private static HttpRequestDef<UpdateGroupMergeRequestApproverSettingRequest, UpdateGroupMergeRequestApproverSettingResponse> genForUpdateGroupMergeRequestApproverSetting() {
        // basic
        HttpRequestDef.Builder<UpdateGroupMergeRequestApproverSettingRequest, UpdateGroupMergeRequestApproverSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGroupMergeRequestApproverSettingRequest.class,
                    UpdateGroupMergeRequestApproverSettingResponse.class)
                .withName("UpdateGroupMergeRequestApproverSetting")
                .withUri("/v4/groups/{group_id}/approver-settings/{setting_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateGroupMergeRequestApproverSettingRequest::getGroupId,
                UpdateGroupMergeRequestApproverSettingRequest::setGroupId));
        builder.<Integer>withRequestField("setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateGroupMergeRequestApproverSettingRequest::getSettingId,
                UpdateGroupMergeRequestApproverSettingRequest::setSettingId));
        builder.<CreateMergeRequestApproverSettingDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateMergeRequestApproverSettingDto.class),
            f -> f.withMarshaller(UpdateGroupMergeRequestApproverSettingRequest::getBody,
                UpdateGroupMergeRequestApproverSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupMergeRequestTemplateRequest, UpdateGroupMergeRequestTemplateResponse> updateGroupMergeRequestTemplate =
        genForUpdateGroupMergeRequestTemplate();

    private static HttpRequestDef<UpdateGroupMergeRequestTemplateRequest, UpdateGroupMergeRequestTemplateResponse> genForUpdateGroupMergeRequestTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateGroupMergeRequestTemplateRequest, UpdateGroupMergeRequestTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGroupMergeRequestTemplateRequest.class,
                    UpdateGroupMergeRequestTemplateResponse.class)
                .withName("UpdateGroupMergeRequestTemplate")
                .withUri("/v4/groups/{group_id}/merge-requests/template/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateGroupMergeRequestTemplateRequest::getGroupId,
                UpdateGroupMergeRequestTemplateRequest::setGroupId));
        builder.<Integer>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateGroupMergeRequestTemplateRequest::getTemplateId,
                UpdateGroupMergeRequestTemplateRequest::setTemplateId));
        builder.<CreateMergeRequestTemplateDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeRequestTemplateDto.class),
            f -> f.withMarshaller(UpdateGroupMergeRequestTemplateRequest::getBody,
                UpdateGroupMergeRequestTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMergeRequestRequest, UpdateMergeRequestResponse> updateMergeRequest =
        genForUpdateMergeRequest();

    private static HttpRequestDef<UpdateMergeRequestRequest, UpdateMergeRequestResponse> genForUpdateMergeRequest() {
        // basic
        HttpRequestDef.Builder<UpdateMergeRequestRequest, UpdateMergeRequestResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMergeRequestRequest.class, UpdateMergeRequestResponse.class)
                .withName("UpdateMergeRequest")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestRequest::getRepositoryId,
                UpdateMergeRequestRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestRequest::getMergeRequestIid,
                UpdateMergeRequestRequest::setMergeRequestIid));
        builder.<PutMergeRequestParamsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutMergeRequestParamsDto.class),
            f -> f.withMarshaller(UpdateMergeRequestRequest::getBody, UpdateMergeRequestRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMergeRequestApproverSettingRequest, UpdateMergeRequestApproverSettingResponse> updateMergeRequestApproverSetting =
        genForUpdateMergeRequestApproverSetting();

    private static HttpRequestDef<UpdateMergeRequestApproverSettingRequest, UpdateMergeRequestApproverSettingResponse> genForUpdateMergeRequestApproverSetting() {
        // basic
        HttpRequestDef.Builder<UpdateMergeRequestApproverSettingRequest, UpdateMergeRequestApproverSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateMergeRequestApproverSettingRequest.class,
                    UpdateMergeRequestApproverSettingResponse.class)
                .withName("UpdateMergeRequestApproverSetting")
                .withUri("/v4/repositories/{repository_id}/approver-settings/{setting_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestApproverSettingRequest::getRepositoryId,
                UpdateMergeRequestApproverSettingRequest::setRepositoryId));
        builder.<Integer>withRequestField("setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestApproverSettingRequest::getSettingId,
                UpdateMergeRequestApproverSettingRequest::setSettingId));
        builder.<MergeRequestApproverSettingResultDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MergeRequestApproverSettingResultDto.class),
            f -> f.withMarshaller(UpdateMergeRequestApproverSettingRequest::getBody,
                UpdateMergeRequestApproverSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMergeRequestApproversRequest, UpdateMergeRequestApproversResponse> updateMergeRequestApprovers =
        genForUpdateMergeRequestApprovers();

    private static HttpRequestDef<UpdateMergeRequestApproversRequest, UpdateMergeRequestApproversResponse> genForUpdateMergeRequestApprovers() {
        // basic
        HttpRequestDef.Builder<UpdateMergeRequestApproversRequest, UpdateMergeRequestApproversResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateMergeRequestApproversRequest.class,
                    UpdateMergeRequestApproversResponse.class)
                .withName("UpdateMergeRequestApprovers")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/approval-approvers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestApproversRequest::getRepositoryId,
                UpdateMergeRequestApproversRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestApproversRequest::getMergeRequestIid,
                UpdateMergeRequestApproversRequest::setMergeRequestIid));
        builder.<ApprovalApproverInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApprovalApproverInfoDto.class),
            f -> f.withMarshaller(UpdateMergeRequestApproversRequest::getBody,
                UpdateMergeRequestApproversRequest::setBody));

        // response
        builder.<List<ApproverBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(UpdateMergeRequestApproversResponse::getBody,
                    UpdateMergeRequestApproversResponse::setBody)
                .withInnerContainerType(ApproverBasicDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMergeRequestReviewersRequest, UpdateMergeRequestReviewersResponse> updateMergeRequestReviewers =
        genForUpdateMergeRequestReviewers();

    private static HttpRequestDef<UpdateMergeRequestReviewersRequest, UpdateMergeRequestReviewersResponse> genForUpdateMergeRequestReviewers() {
        // basic
        HttpRequestDef.Builder<UpdateMergeRequestReviewersRequest, UpdateMergeRequestReviewersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateMergeRequestReviewersRequest.class,
                    UpdateMergeRequestReviewersResponse.class)
                .withName("UpdateMergeRequestReviewers")
                .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/approval-reviewers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestReviewersRequest::getRepositoryId,
                UpdateMergeRequestReviewersRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestReviewersRequest::getMergeRequestIid,
                UpdateMergeRequestReviewersRequest::setMergeRequestIid));
        builder.<ApprovalReviewerInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApprovalReviewerInfoDto.class),
            f -> f.withMarshaller(UpdateMergeRequestReviewersRequest::getBody,
                UpdateMergeRequestReviewersRequest::setBody));

        // response
        builder.<List<ApproverBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(UpdateMergeRequestReviewersResponse::getBody,
                    UpdateMergeRequestReviewersResponse::setBody)
                .withInnerContainerType(ApproverBasicDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMergeRequestSettingRequest, UpdateMergeRequestSettingResponse> updateMergeRequestSetting =
        genForUpdateMergeRequestSetting();

    private static HttpRequestDef<UpdateMergeRequestSettingRequest, UpdateMergeRequestSettingResponse> genForUpdateMergeRequestSetting() {
        // basic
        HttpRequestDef.Builder<UpdateMergeRequestSettingRequest, UpdateMergeRequestSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateMergeRequestSettingRequest.class,
                    UpdateMergeRequestSettingResponse.class)
                .withName("UpdateMergeRequestSetting")
                .withUri("/v4/repositories/{repository_id}/merge-requests/setting")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestSettingRequest::getRepositoryId,
                UpdateMergeRequestSettingRequest::setRepositoryId));
        builder.<UpdateMergeRequestSettingDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMergeRequestSettingDto.class),
            f -> f.withMarshaller(UpdateMergeRequestSettingRequest::getBody,
                UpdateMergeRequestSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMergeRequestTemplateRequest, UpdateMergeRequestTemplateResponse> updateMergeRequestTemplate =
        genForUpdateMergeRequestTemplate();

    private static HttpRequestDef<UpdateMergeRequestTemplateRequest, UpdateMergeRequestTemplateResponse> genForUpdateMergeRequestTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateMergeRequestTemplateRequest, UpdateMergeRequestTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateMergeRequestTemplateRequest.class,
                    UpdateMergeRequestTemplateResponse.class)
                .withName("UpdateMergeRequestTemplate")
                .withUri("/v4/repositories/{repository_id}/merge-requests/template/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestTemplateRequest::getRepositoryId,
                UpdateMergeRequestTemplateRequest::setRepositoryId));
        builder.<Integer>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestTemplateRequest::getTemplateId,
                UpdateMergeRequestTemplateRequest::setTemplateId));
        builder.<CreateMergeRequestTemplateDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeRequestTemplateDto.class),
            f -> f.withMarshaller(UpdateMergeRequestTemplateRequest::getBody,
                UpdateMergeRequestTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMergeRequestVoteRequest, UpdateMergeRequestVoteResponse> updateMergeRequestVote =
        genForUpdateMergeRequestVote();

    private static HttpRequestDef<UpdateMergeRequestVoteRequest, UpdateMergeRequestVoteResponse> genForUpdateMergeRequestVote() {
        // basic
        HttpRequestDef.Builder<UpdateMergeRequestVoteRequest, UpdateMergeRequestVoteResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMergeRequestVoteRequest.class, UpdateMergeRequestVoteResponse.class)
            .withName("UpdateMergeRequestVote")
            .withUri("/v4/repositories/{repository_id}/merge-requests/{merge_request_iid}/vote")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestVoteRequest::getRepositoryId,
                UpdateMergeRequestVoteRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestVoteRequest::getMergeRequestIid,
                UpdateMergeRequestVoteRequest::setMergeRequestIid));
        builder.<MergeRequestVoteBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MergeRequestVoteBodyDto.class),
            f -> f.withMarshaller(UpdateMergeRequestVoteRequest::getBody, UpdateMergeRequestVoteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectMergeRequestApproverSettingRequest, UpdateProjectMergeRequestApproverSettingResponse> updateProjectMergeRequestApproverSetting =
        genForUpdateProjectMergeRequestApproverSetting();

    private static HttpRequestDef<UpdateProjectMergeRequestApproverSettingRequest, UpdateProjectMergeRequestApproverSettingResponse> genForUpdateProjectMergeRequestApproverSetting() {
        // basic
        HttpRequestDef.Builder<UpdateProjectMergeRequestApproverSettingRequest, UpdateProjectMergeRequestApproverSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProjectMergeRequestApproverSettingRequest.class,
                    UpdateProjectMergeRequestApproverSettingResponse.class)
                .withName("UpdateProjectMergeRequestApproverSetting")
                .withUri("/v4/projects/{project_id}/approver-settings/{setting_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectMergeRequestApproverSettingRequest::getProjectId,
                UpdateProjectMergeRequestApproverSettingRequest::setProjectId));
        builder.<Integer>withRequestField("setting_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProjectMergeRequestApproverSettingRequest::getSettingId,
                UpdateProjectMergeRequestApproverSettingRequest::setSettingId));
        builder.<CreateMergeRequestApproverSettingDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateMergeRequestApproverSettingDto.class),
            f -> f.withMarshaller(UpdateProjectMergeRequestApproverSettingRequest::getBody,
                UpdateProjectMergeRequestApproverSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectMergeRequestTemplateRequest, UpdateProjectMergeRequestTemplateResponse> updateProjectMergeRequestTemplate =
        genForUpdateProjectMergeRequestTemplate();

    private static HttpRequestDef<UpdateProjectMergeRequestTemplateRequest, UpdateProjectMergeRequestTemplateResponse> genForUpdateProjectMergeRequestTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateProjectMergeRequestTemplateRequest, UpdateProjectMergeRequestTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProjectMergeRequestTemplateRequest.class,
                    UpdateProjectMergeRequestTemplateResponse.class)
                .withName("UpdateProjectMergeRequestTemplate")
                .withUri("/v4/projects/{project_id}/merge-requests/template/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectMergeRequestTemplateRequest::getProjectId,
                UpdateProjectMergeRequestTemplateRequest::setProjectId));
        builder.<Integer>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProjectMergeRequestTemplateRequest::getTemplateId,
                UpdateProjectMergeRequestTemplateRequest::setTemplateId));
        builder.<CreateMergeRequestTemplateDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeRequestTemplateDto.class),
            f -> f.withMarshaller(UpdateProjectMergeRequestTemplateRequest::getBody,
                UpdateProjectMergeRequestTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteRepositoryFilePushPermissionsRequest, BatchDeleteRepositoryFilePushPermissionsResponse> batchDeleteRepositoryFilePushPermissions =
        genForBatchDeleteRepositoryFilePushPermissions();

    private static HttpRequestDef<BatchDeleteRepositoryFilePushPermissionsRequest, BatchDeleteRepositoryFilePushPermissionsResponse> genForBatchDeleteRepositoryFilePushPermissions() {
        // basic
        HttpRequestDef.Builder<BatchDeleteRepositoryFilePushPermissionsRequest, BatchDeleteRepositoryFilePushPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteRepositoryFilePushPermissionsRequest.class,
                    BatchDeleteRepositoryFilePushPermissionsResponse.class)
                .withName("BatchDeleteRepositoryFilePushPermissions")
                .withUri("/v4/repositories/{repository_id}/file-push-permissions/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchDeleteRepositoryFilePushPermissionsRequest::getRepositoryId,
                BatchDeleteRepositoryFilePushPermissionsRequest::setRepositoryId));
        builder.<BatchDeleteFilePushPermissionDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteFilePushPermissionDto.class),
            f -> f.withMarshaller(BatchDeleteRepositoryFilePushPermissionsRequest::getBody,
                BatchDeleteRepositoryFilePushPermissionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateRepositoryFilePushPermissionsRequest, BatchUpdateRepositoryFilePushPermissionsResponse> batchUpdateRepositoryFilePushPermissions =
        genForBatchUpdateRepositoryFilePushPermissions();

    private static HttpRequestDef<BatchUpdateRepositoryFilePushPermissionsRequest, BatchUpdateRepositoryFilePushPermissionsResponse> genForBatchUpdateRepositoryFilePushPermissions() {
        // basic
        HttpRequestDef.Builder<BatchUpdateRepositoryFilePushPermissionsRequest, BatchUpdateRepositoryFilePushPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateRepositoryFilePushPermissionsRequest.class,
                    BatchUpdateRepositoryFilePushPermissionsResponse.class)
                .withName("BatchUpdateRepositoryFilePushPermissions")
                .withUri("/v4/repositories/{repository_id}/file-push-permissions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchUpdateRepositoryFilePushPermissionsRequest::getRepositoryId,
                BatchUpdateRepositoryFilePushPermissionsRequest::setRepositoryId));
        builder.<BatchUpdateFilePushPermissionBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateFilePushPermissionBodyDto.class),
            f -> f.withMarshaller(BatchUpdateRepositoryFilePushPermissionsRequest::getBody,
                BatchUpdateRepositoryFilePushPermissionsRequest::setBody));

        // response
        builder.<List<RepositoryFilePushPermissionDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(BatchUpdateRepositoryFilePushPermissionsResponse::getBody,
                    BatchUpdateRepositoryFilePushPermissionsResponse::setBody)
                .withInnerContainerType(RepositoryFilePushPermissionDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateFilePushPermissionRequest, CreateFilePushPermissionResponse> createFilePushPermission =
        genForCreateFilePushPermission();

    private static HttpRequestDef<CreateFilePushPermissionRequest, CreateFilePushPermissionResponse> genForCreateFilePushPermission() {
        // basic
        HttpRequestDef.Builder<CreateFilePushPermissionRequest, CreateFilePushPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateFilePushPermissionRequest.class, CreateFilePushPermissionResponse.class)
                .withName("CreateFilePushPermission")
                .withUri("/v4/repositories/{repository_id}/file-push-permissions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateFilePushPermissionRequest::getRepositoryId,
                CreateFilePushPermissionRequest::setRepositoryId));
        builder.<CreateRepositoryFilePushPermissionDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRepositoryFilePushPermissionDto.class),
            f -> f.withMarshaller(CreateFilePushPermissionRequest::getBody, CreateFilePushPermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryFilePushPermissionsRequest, ListRepositoryFilePushPermissionsResponse> listRepositoryFilePushPermissions =
        genForListRepositoryFilePushPermissions();

    private static HttpRequestDef<ListRepositoryFilePushPermissionsRequest, ListRepositoryFilePushPermissionsResponse> genForListRepositoryFilePushPermissions() {
        // basic
        HttpRequestDef.Builder<ListRepositoryFilePushPermissionsRequest, ListRepositoryFilePushPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRepositoryFilePushPermissionsRequest.class,
                    ListRepositoryFilePushPermissionsResponse.class)
                .withName("ListRepositoryFilePushPermissions")
                .withUri("/v4/repositories/{repository_id}/file-push-permissions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryFilePushPermissionsRequest::getRepositoryId,
                ListRepositoryFilePushPermissionsRequest::setRepositoryId));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryFilePushPermissionsRequest::getSearch,
                ListRepositoryFilePushPermissionsRequest::setSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryFilePushPermissionsRequest::getOffset,
                ListRepositoryFilePushPermissionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryFilePushPermissionsRequest::getLimit,
                ListRepositoryFilePushPermissionsRequest::setLimit));

        // response
        builder.<List<RepositoryFilePushPermissionDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListRepositoryFilePushPermissionsResponse::getBody,
                    ListRepositoryFilePushPermissionsResponse::setBody)
                .withInnerContainerType(RepositoryFilePushPermissionDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryResourcePermissionsRequest, ListRepositoryResourcePermissionsResponse> listRepositoryResourcePermissions =
        genForListRepositoryResourcePermissions();

    private static HttpRequestDef<ListRepositoryResourcePermissionsRequest, ListRepositoryResourcePermissionsResponse> genForListRepositoryResourcePermissions() {
        // basic
        HttpRequestDef.Builder<ListRepositoryResourcePermissionsRequest, ListRepositoryResourcePermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRepositoryResourcePermissionsRequest.class,
                    ListRepositoryResourcePermissionsResponse.class)
                .withName("ListRepositoryResourcePermissions")
                .withUri("/v4/repository/{repository_id}/permissions/{resource_name}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryResourcePermissionsRequest::getRepositoryId,
                ListRepositoryResourcePermissionsRequest::setRepositoryId));
        builder.<String>withRequestField("resource_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryResourcePermissionsRequest::getResourceName,
                ListRepositoryResourcePermissionsRequest::setResourceName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryResourcePermissionsRequest::getOffset,
                ListRepositoryResourcePermissionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryResourcePermissionsRequest::getLimit,
                ListRepositoryResourcePermissionsRequest::setLimit));

        // response
        builder.<List<ResponsePermissionInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListRepositoryResourcePermissionsResponse::getBody,
                    ListRepositoryResourcePermissionsResponse::setBody)
                .withInnerContainerType(ResponsePermissionInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryPermissionInheritEnabledRequest, ShowRepositoryPermissionInheritEnabledResponse> showRepositoryPermissionInheritEnabled =
        genForShowRepositoryPermissionInheritEnabled();

    private static HttpRequestDef<ShowRepositoryPermissionInheritEnabledRequest, ShowRepositoryPermissionInheritEnabledResponse> genForShowRepositoryPermissionInheritEnabled() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryPermissionInheritEnabledRequest, ShowRepositoryPermissionInheritEnabledResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRepositoryPermissionInheritEnabledRequest.class,
                    ShowRepositoryPermissionInheritEnabledResponse.class)
                .withName("ShowRepositoryPermissionInheritEnabled")
                .withUri("/v4/repositories/{repository_id}/permission-inherit-setting")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryPermissionInheritEnabledRequest::getRepositoryId,
                ShowRepositoryPermissionInheritEnabledRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepositoryPermissionInheritEnabledRequest, UpdateRepositoryPermissionInheritEnabledResponse> updateRepositoryPermissionInheritEnabled =
        genForUpdateRepositoryPermissionInheritEnabled();

    private static HttpRequestDef<UpdateRepositoryPermissionInheritEnabledRequest, UpdateRepositoryPermissionInheritEnabledResponse> genForUpdateRepositoryPermissionInheritEnabled() {
        // basic
        HttpRequestDef.Builder<UpdateRepositoryPermissionInheritEnabledRequest, UpdateRepositoryPermissionInheritEnabledResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRepositoryPermissionInheritEnabledRequest.class,
                    UpdateRepositoryPermissionInheritEnabledResponse.class)
                .withName("UpdateRepositoryPermissionInheritEnabled")
                .withUri("/v4/repositories/{repository_id}/permission-inherit-setting")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryPermissionInheritEnabledRequest::getRepositoryId,
                UpdateRepositoryPermissionInheritEnabledRequest::setRepositoryId));
        builder.<PermissionInheritEnabledDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PermissionInheritEnabledDto.class),
            f -> f.withMarshaller(UpdateRepositoryPermissionInheritEnabledRequest::getBody,
                UpdateRepositoryPermissionInheritEnabledRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepositoryResourcePermissionsRequest, UpdateRepositoryResourcePermissionsResponse> updateRepositoryResourcePermissions =
        genForUpdateRepositoryResourcePermissions();

    private static HttpRequestDef<UpdateRepositoryResourcePermissionsRequest, UpdateRepositoryResourcePermissionsResponse> genForUpdateRepositoryResourcePermissions() {
        // basic
        HttpRequestDef.Builder<UpdateRepositoryResourcePermissionsRequest, UpdateRepositoryResourcePermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRepositoryResourcePermissionsRequest.class,
                    UpdateRepositoryResourcePermissionsResponse.class)
                .withName("UpdateRepositoryResourcePermissions")
                .withUri("/v4/repository/{repository_id}/permissions/{resource_name}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryResourcePermissionsRequest::getRepositoryId,
                UpdateRepositoryResourcePermissionsRequest::setRepositoryId));
        builder.<String>withRequestField("resource_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepositoryResourcePermissionsRequest::getResourceName,
                UpdateRepositoryResourcePermissionsRequest::setResourceName));
        builder.<UpdatePermissionBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePermissionBodyDto.class),
            f -> f.withMarshaller(UpdateRepositoryResourcePermissionsRequest::getBody,
                UpdateRepositoryResourcePermissionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLatestPipelineJobsRequest, ListLatestPipelineJobsResponse> listLatestPipelineJobs =
        genForListLatestPipelineJobs();

    private static HttpRequestDef<ListLatestPipelineJobsRequest, ListLatestPipelineJobsResponse> genForListLatestPipelineJobs() {
        // basic
        HttpRequestDef.Builder<ListLatestPipelineJobsRequest, ListLatestPipelineJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLatestPipelineJobsRequest.class, ListLatestPipelineJobsResponse.class)
            .withName("ListLatestPipelineJobs")
            .withUri("/v4/repositories/{repository_id}/pipelines/{pipeline_id}/latest-jobs")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLatestPipelineJobsRequest::getRepositoryId,
                ListLatestPipelineJobsRequest::setRepositoryId));
        builder.<Integer>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLatestPipelineJobsRequest::getPipelineId,
                ListLatestPipelineJobsRequest::setPipelineId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelineJobsRequest, ListPipelineJobsResponse> listPipelineJobs =
        genForListPipelineJobs();

    private static HttpRequestDef<ListPipelineJobsRequest, ListPipelineJobsResponse> genForListPipelineJobs() {
        // basic
        HttpRequestDef.Builder<ListPipelineJobsRequest, ListPipelineJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPipelineJobsRequest.class, ListPipelineJobsResponse.class)
                .withName("ListPipelineJobs")
                .withUri("/v4/repositories/{repository_id}/pipelines/{pipeline_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getRepositoryId, ListPipelineJobsRequest::setRepositoryId));
        builder.<Integer>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getPipelineId, ListPipelineJobsRequest::setPipelineId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getOffset, ListPipelineJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipelineJobsRequest::getLimit, ListPipelineJobsRequest::setLimit));

        // response
        builder.<List<JobWithStageDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPipelineJobsResponse::getBody, ListPipelineJobsResponse::setBody)
                .withInnerContainerType(JobWithStageDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPipelineJobsResponse::getXTotal, ListPipelineJobsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListItemCommitsRequest, ListItemCommitsResponse> listItemCommits =
        genForListItemCommits();

    private static HttpRequestDef<ListItemCommitsRequest, ListItemCommitsResponse> genForListItemCommits() {
        // basic
        HttpRequestDef.Builder<ListItemCommitsRequest, ListItemCommitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListItemCommitsRequest.class, ListItemCommitsResponse.class)
                .withName("ListItemCommits")
                .withUri("/v4/projects/{project_id}/items/{item_id}/commits")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItemCommitsRequest::getProjectId, ListItemCommitsRequest::setProjectId));
        builder.<String>withRequestField("item_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItemCommitsRequest::getItemId, ListItemCommitsRequest::setItemId));
        builder.<ListItemCommitsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListItemCommitsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListItemCommitsRequest::getType, ListItemCommitsRequest::setType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListItemCommitsRequest::getOffset, ListItemCommitsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListItemCommitsRequest::getLimit, ListItemCommitsRequest::setLimit));

        // response
        builder.<List<ItemCommitDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListItemCommitsResponse::getBody, ListItemCommitsResponse::setBody)
                .withInnerContainerType(ItemCommitDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListItemCommitsResponse::getXTotal, ListItemCommitsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListProjectSubgroupsAndRepositoriesRequest, ListProjectSubgroupsAndRepositoriesResponse> listProjectSubgroupsAndRepositories =
        genForListProjectSubgroupsAndRepositories();

    private static HttpRequestDef<ListProjectSubgroupsAndRepositoriesRequest, ListProjectSubgroupsAndRepositoriesResponse> genForListProjectSubgroupsAndRepositories() {
        // basic
        HttpRequestDef.Builder<ListProjectSubgroupsAndRepositoriesRequest, ListProjectSubgroupsAndRepositoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectSubgroupsAndRepositoriesRequest.class,
                    ListProjectSubgroupsAndRepositoriesResponse.class)
                .withName("ListProjectSubgroupsAndRepositories")
                .withUri("/v4/projects/{project_id}/subgroups-and-repositories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectSubgroupsAndRepositoriesRequest::getProjectId,
                ListProjectSubgroupsAndRepositoriesRequest::setProjectId));
        builder.<Integer>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectSubgroupsAndRepositoriesRequest::getFilter,
                ListProjectSubgroupsAndRepositoriesRequest::setFilter));
        builder.<ListProjectSubgroupsAndRepositoriesRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProjectSubgroupsAndRepositoriesRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListProjectSubgroupsAndRepositoriesRequest::getOrderBy,
                ListProjectSubgroupsAndRepositoriesRequest::setOrderBy));
        builder.<ListProjectSubgroupsAndRepositoriesRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProjectSubgroupsAndRepositoriesRequest.SortEnum.class),
            f -> f.withMarshaller(ListProjectSubgroupsAndRepositoriesRequest::getSort,
                ListProjectSubgroupsAndRepositoriesRequest::setSort));
        builder.<Boolean>withRequestField("archived",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectSubgroupsAndRepositoriesRequest::getArchived,
                ListProjectSubgroupsAndRepositoriesRequest::setArchived));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectSubgroupsAndRepositoriesRequest::getOffset,
                ListProjectSubgroupsAndRepositoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectSubgroupsAndRepositoriesRequest::getLimit,
                ListProjectSubgroupsAndRepositoriesRequest::setLimit));

        // response
        builder.<List<SubgroupAndProjectBaseDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListProjectSubgroupsAndRepositoriesResponse::getBody,
                    ListProjectSubgroupsAndRepositoriesResponse::setBody)
                .withInnerContainerType(SubgroupAndProjectBaseDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectGeneralPolicyRequest, ShowProjectGeneralPolicyResponse> showProjectGeneralPolicy =
        genForShowProjectGeneralPolicy();

    private static HttpRequestDef<ShowProjectGeneralPolicyRequest, ShowProjectGeneralPolicyResponse> genForShowProjectGeneralPolicy() {
        // basic
        HttpRequestDef.Builder<ShowProjectGeneralPolicyRequest, ShowProjectGeneralPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowProjectGeneralPolicyRequest.class, ShowProjectGeneralPolicyResponse.class)
                .withName("ShowProjectGeneralPolicy")
                .withUri("/v4/projects/{project_id}/policies/general")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectGeneralPolicyRequest::getProjectId,
                ShowProjectGeneralPolicyRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectMemberSettingRequest, ShowProjectMemberSettingResponse> showProjectMemberSetting =
        genForShowProjectMemberSetting();

    private static HttpRequestDef<ShowProjectMemberSettingRequest, ShowProjectMemberSettingResponse> genForShowProjectMemberSetting() {
        // basic
        HttpRequestDef.Builder<ShowProjectMemberSettingRequest, ShowProjectMemberSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowProjectMemberSettingRequest.class, ShowProjectMemberSettingResponse.class)
                .withName("ShowProjectMemberSetting")
                .withUri("/v4/projects/{project_id}/member-setting")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectMemberSettingRequest::getProjectId,
                ShowProjectMemberSettingRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectMemberSettingRequest::getOffset,
                ShowProjectMemberSettingRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectMemberSettingRequest::getLimit,
                ShowProjectMemberSettingRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectSettingsInheritCfgRequest, ShowProjectSettingsInheritCfgResponse> showProjectSettingsInheritCfg =
        genForShowProjectSettingsInheritCfg();

    private static HttpRequestDef<ShowProjectSettingsInheritCfgRequest, ShowProjectSettingsInheritCfgResponse> genForShowProjectSettingsInheritCfg() {
        // basic
        HttpRequestDef.Builder<ShowProjectSettingsInheritCfgRequest, ShowProjectSettingsInheritCfgResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProjectSettingsInheritCfgRequest.class,
                    ShowProjectSettingsInheritCfgResponse.class)
                .withName("ShowProjectSettingsInheritCfg")
                .withUri("/v4/projects/{project_id}/settings-inherit-cfg")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectSettingsInheritCfgRequest::getProjectId,
                ShowProjectSettingsInheritCfgRequest::setProjectId));

        // response
        builder.<List<ProjectSettingsInheritCfgDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowProjectSettingsInheritCfgResponse::getBody,
                    ShowProjectSettingsInheritCfgResponse::setBody)
                .withInnerContainerType(ProjectSettingsInheritCfgDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectWatermarkRequest, ShowProjectWatermarkResponse> showProjectWatermark =
        genForShowProjectWatermark();

    private static HttpRequestDef<ShowProjectWatermarkRequest, ShowProjectWatermarkResponse> genForShowProjectWatermark() {
        // basic
        HttpRequestDef.Builder<ShowProjectWatermarkRequest, ShowProjectWatermarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectWatermarkRequest.class, ShowProjectWatermarkResponse.class)
            .withName("ShowProjectWatermark")
            .withUri("/v4/projects/{project_id}/watermark")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectWatermarkRequest::getProjectId,
                ShowProjectWatermarkRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectsGeneralPolicyRequest, ShowProjectsGeneralPolicyResponse> showProjectsGeneralPolicy =
        genForShowProjectsGeneralPolicy();

    private static HttpRequestDef<ShowProjectsGeneralPolicyRequest, ShowProjectsGeneralPolicyResponse> genForShowProjectsGeneralPolicy() {
        // basic
        HttpRequestDef.Builder<ShowProjectsGeneralPolicyRequest, ShowProjectsGeneralPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProjectsGeneralPolicyRequest.class,
                    ShowProjectsGeneralPolicyResponse.class)
                .withName("ShowProjectsGeneralPolicy")
                .withUri("/v4/projects/{project_id}/general-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectsGeneralPolicyRequest::getProjectId,
                ShowProjectsGeneralPolicyRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourcePermissionsRequest, ShowResourcePermissionsResponse> showResourcePermissions =
        genForShowResourcePermissions();

    private static HttpRequestDef<ShowResourcePermissionsRequest, ShowResourcePermissionsResponse> genForShowResourcePermissions() {
        // basic
        HttpRequestDef.Builder<ShowResourcePermissionsRequest, ShowResourcePermissionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowResourcePermissionsRequest.class, ShowResourcePermissionsResponse.class)
            .withName("ShowResourcePermissions")
            .withUri("/v4/groups/{group_id}/permissions-resources/{resource_id}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResourcePermissionsRequest::getGroupId,
                ShowResourcePermissionsRequest::setGroupId));
        builder.<Integer>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResourcePermissionsRequest::getResourceId,
                ShowResourcePermissionsRequest::setResourceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResourcePermissionsRequest::getOffset,
                ShowResourcePermissionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResourcePermissionsRequest::getLimit, ShowResourcePermissionsRequest::setLimit));

        // response
        builder.<List<PermissionDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowResourcePermissionsResponse::getBody, ShowResourcePermissionsResponse::setBody)
                .withInnerContainerType(PermissionDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectGeneralPolicyRequest, UpdateProjectGeneralPolicyResponse> updateProjectGeneralPolicy =
        genForUpdateProjectGeneralPolicy();

    private static HttpRequestDef<UpdateProjectGeneralPolicyRequest, UpdateProjectGeneralPolicyResponse> genForUpdateProjectGeneralPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateProjectGeneralPolicyRequest, UpdateProjectGeneralPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProjectGeneralPolicyRequest.class,
                    UpdateProjectGeneralPolicyResponse.class)
                .withName("UpdateProjectGeneralPolicy")
                .withUri("/v4/projects/{project_id}/general-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectGeneralPolicyRequest::getProjectId,
                UpdateProjectGeneralPolicyRequest::setProjectId));
        builder.<UpdateGeneralPolicyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGeneralPolicyDto.class),
            f -> f.withMarshaller(UpdateProjectGeneralPolicyRequest::getBody,
                UpdateProjectGeneralPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectSettingsInheritCfgRequest, UpdateProjectSettingsInheritCfgResponse> updateProjectSettingsInheritCfg =
        genForUpdateProjectSettingsInheritCfg();

    private static HttpRequestDef<UpdateProjectSettingsInheritCfgRequest, UpdateProjectSettingsInheritCfgResponse> genForUpdateProjectSettingsInheritCfg() {
        // basic
        HttpRequestDef.Builder<UpdateProjectSettingsInheritCfgRequest, UpdateProjectSettingsInheritCfgResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProjectSettingsInheritCfgRequest.class,
                    UpdateProjectSettingsInheritCfgResponse.class)
                .withName("UpdateProjectSettingsInheritCfg")
                .withUri("/v4/projects/{project_id}/settings-inherit-cfg")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectSettingsInheritCfgRequest::getProjectId,
                UpdateProjectSettingsInheritCfgRequest::setProjectId));
        builder.<SettingsInheritCfgBodyApiDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SettingsInheritCfgBodyApiDto.class),
            f -> f.withMarshaller(UpdateProjectSettingsInheritCfgRequest::getBody,
                UpdateProjectSettingsInheritCfgRequest::setBody));

        // response
        builder.<List<ProjectSettingsInheritCfgDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(UpdateProjectSettingsInheritCfgResponse::getBody,
                    UpdateProjectSettingsInheritCfgResponse::setBody)
                .withInnerContainerType(ProjectSettingsInheritCfgDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectWatermarkRequest, UpdateProjectWatermarkResponse> updateProjectWatermark =
        genForUpdateProjectWatermark();

    private static HttpRequestDef<UpdateProjectWatermarkRequest, UpdateProjectWatermarkResponse> genForUpdateProjectWatermark() {
        // basic
        HttpRequestDef.Builder<UpdateProjectWatermarkRequest, UpdateProjectWatermarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateProjectWatermarkRequest.class, UpdateProjectWatermarkResponse.class)
            .withName("UpdateProjectWatermark")
            .withUri("/v4/projects/{project_id}/watermark")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectWatermarkRequest::getProjectId,
                UpdateProjectWatermarkRequest::setProjectId));
        builder.<UpdateWatermarkDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWatermarkDto.class),
            f -> f.withMarshaller(UpdateProjectWatermarkRequest::getBody, UpdateProjectWatermarkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateProtectedBranchRequest, BatchCreateProtectedBranchResponse> batchCreateProtectedBranch =
        genForBatchCreateProtectedBranch();

    private static HttpRequestDef<BatchCreateProtectedBranchRequest, BatchCreateProtectedBranchResponse> genForBatchCreateProtectedBranch() {
        // basic
        HttpRequestDef.Builder<BatchCreateProtectedBranchRequest, BatchCreateProtectedBranchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateProtectedBranchRequest.class,
                    BatchCreateProtectedBranchResponse.class)
                .withName("BatchCreateProtectedBranch")
                .withUri("/v4/repositories/{repository_id}/protected-branches")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchCreateProtectedBranchRequest::getRepositoryId,
                BatchCreateProtectedBranchRequest::setRepositoryId));
        builder.<RepositoryProtectedBranchBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RepositoryProtectedBranchBodyDto.class),
            f -> f.withMarshaller(BatchCreateProtectedBranchRequest::getBody,
                BatchCreateProtectedBranchRequest::setBody));

        // response
        builder.<List<RepositoryProtectedBranchDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(BatchCreateProtectedBranchResponse::getBody,
                    BatchCreateProtectedBranchResponse::setBody)
                .withInnerContainerType(RepositoryProtectedBranchDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateProtectedTagsRequest, BatchCreateProtectedTagsResponse> batchCreateProtectedTags =
        genForBatchCreateProtectedTags();

    private static HttpRequestDef<BatchCreateProtectedTagsRequest, BatchCreateProtectedTagsResponse> genForBatchCreateProtectedTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateProtectedTagsRequest, BatchCreateProtectedTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchCreateProtectedTagsRequest.class, BatchCreateProtectedTagsResponse.class)
                .withName("BatchCreateProtectedTags")
                .withUri("/v4/repositories/{repository_id}/protected-tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchCreateProtectedTagsRequest::getRepositoryId,
                BatchCreateProtectedTagsRequest::setRepositoryId));
        builder.<RepositoryProtectedTagBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RepositoryProtectedTagBodyDto.class),
            f -> f.withMarshaller(BatchCreateProtectedTagsRequest::getBody, BatchCreateProtectedTagsRequest::setBody));

        // response
        builder.<List<RepositoryProtectedTagDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchCreateProtectedTagsResponse::getBody, BatchCreateProtectedTagsResponse::setBody)
                .withInnerContainerType(RepositoryProtectedTagDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteProtectedBranchesRequest, BatchDeleteProtectedBranchesResponse> batchDeleteProtectedBranches =
        genForBatchDeleteProtectedBranches();

    private static HttpRequestDef<BatchDeleteProtectedBranchesRequest, BatchDeleteProtectedBranchesResponse> genForBatchDeleteProtectedBranches() {
        // basic
        HttpRequestDef.Builder<BatchDeleteProtectedBranchesRequest, BatchDeleteProtectedBranchesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteProtectedBranchesRequest.class,
                    BatchDeleteProtectedBranchesResponse.class)
                .withName("BatchDeleteProtectedBranches")
                .withUri("/v4/repositories/{repository_id}/protected-branches/bulk-deletion")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchDeleteProtectedBranchesRequest::getRepositoryId,
                BatchDeleteProtectedBranchesRequest::setRepositoryId));
        builder.<BatchDeleteProtectedBranchesBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteProtectedBranchesBodyDto.class),
            f -> f.withMarshaller(BatchDeleteProtectedBranchesRequest::getBody,
                BatchDeleteProtectedBranchesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteProtectedTagsRequest, BatchDeleteProtectedTagsResponse> batchDeleteProtectedTags =
        genForBatchDeleteProtectedTags();

    private static HttpRequestDef<BatchDeleteProtectedTagsRequest, BatchDeleteProtectedTagsResponse> genForBatchDeleteProtectedTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteProtectedTagsRequest, BatchDeleteProtectedTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchDeleteProtectedTagsRequest.class, BatchDeleteProtectedTagsResponse.class)
                .withName("BatchDeleteProtectedTags")
                .withUri("/v4/repositories/{repository_id}/protected-tags/bulk-deletion")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchDeleteProtectedTagsRequest::getRepositoryId,
                BatchDeleteProtectedTagsRequest::setRepositoryId));
        builder.<BatchDeleteProtectedTagsBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteProtectedTagsBodyDto.class),
            f -> f.withMarshaller(BatchDeleteProtectedTagsRequest::getBody, BatchDeleteProtectedTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateProtectedBranchesRequest, BatchUpdateProtectedBranchesResponse> batchUpdateProtectedBranches =
        genForBatchUpdateProtectedBranches();

    private static HttpRequestDef<BatchUpdateProtectedBranchesRequest, BatchUpdateProtectedBranchesResponse> genForBatchUpdateProtectedBranches() {
        // basic
        HttpRequestDef.Builder<BatchUpdateProtectedBranchesRequest, BatchUpdateProtectedBranchesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateProtectedBranchesRequest.class,
                    BatchUpdateProtectedBranchesResponse.class)
                .withName("BatchUpdateProtectedBranches")
                .withUri("/v4/repositories/{repository_id}/protected-branches")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchUpdateProtectedBranchesRequest::getRepositoryId,
                BatchUpdateProtectedBranchesRequest::setRepositoryId));
        builder.<BatchUpdateProtectedBranchesBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateProtectedBranchesBodyDto.class),
            f -> f.withMarshaller(BatchUpdateProtectedBranchesRequest::getBody,
                BatchUpdateProtectedBranchesRequest::setBody));

        // response
        builder.<List<RepositoryProtectedBranchDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(BatchUpdateProtectedBranchesResponse::getBody,
                    BatchUpdateProtectedBranchesResponse::setBody)
                .withInnerContainerType(RepositoryProtectedBranchDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateProtectedTagsRequest, BatchUpdateProtectedTagsResponse> batchUpdateProtectedTags =
        genForBatchUpdateProtectedTags();

    private static HttpRequestDef<BatchUpdateProtectedTagsRequest, BatchUpdateProtectedTagsResponse> genForBatchUpdateProtectedTags() {
        // basic
        HttpRequestDef.Builder<BatchUpdateProtectedTagsRequest, BatchUpdateProtectedTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, BatchUpdateProtectedTagsRequest.class, BatchUpdateProtectedTagsResponse.class)
                .withName("BatchUpdateProtectedTags")
                .withUri("/v4/repositories/{repository_id}/protected-tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchUpdateProtectedTagsRequest::getRepositoryId,
                BatchUpdateProtectedTagsRequest::setRepositoryId));
        builder.<BatchUpdateProtectedTagsBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateProtectedTagsBodyDto.class),
            f -> f.withMarshaller(BatchUpdateProtectedTagsRequest::getBody, BatchUpdateProtectedTagsRequest::setBody));

        // response
        builder.<List<RepositoryProtectedTagDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchUpdateProtectedTagsResponse::getBody, BatchUpdateProtectedTagsResponse::setBody)
                .withInnerContainerType(RepositoryProtectedTagDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectProtectedBranchesRequest, CreateProjectProtectedBranchesResponse> createProjectProtectedBranches =
        genForCreateProjectProtectedBranches();

    private static HttpRequestDef<CreateProjectProtectedBranchesRequest, CreateProjectProtectedBranchesResponse> genForCreateProjectProtectedBranches() {
        // basic
        HttpRequestDef.Builder<CreateProjectProtectedBranchesRequest, CreateProjectProtectedBranchesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateProjectProtectedBranchesRequest.class,
                    CreateProjectProtectedBranchesResponse.class)
                .withName("CreateProjectProtectedBranches")
                .withUri("/v4/projects/{project_id}/protected-branches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProjectProtectedBranchesRequest::getProjectId,
                CreateProjectProtectedBranchesRequest::setProjectId));
        builder.<ProtectedBranchBodyApiDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProtectedBranchBodyApiDto.class),
            f -> f.withMarshaller(CreateProjectProtectedBranchesRequest::getBody,
                CreateProjectProtectedBranchesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectProtectedTagsRequest, CreateProjectProtectedTagsResponse> createProjectProtectedTags =
        genForCreateProjectProtectedTags();

    private static HttpRequestDef<CreateProjectProtectedTagsRequest, CreateProjectProtectedTagsResponse> genForCreateProjectProtectedTags() {
        // basic
        HttpRequestDef.Builder<CreateProjectProtectedTagsRequest, CreateProjectProtectedTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateProjectProtectedTagsRequest.class,
                    CreateProjectProtectedTagsResponse.class)
                .withName("CreateProjectProtectedTags")
                .withUri("/v4/projects/{project_id}/protected-tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProjectProtectedTagsRequest::getProjectId,
                CreateProjectProtectedTagsRequest::setProjectId));
        builder.<ProjectProtectedTagDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProjectProtectedTagDto.class),
            f -> f.withMarshaller(CreateProjectProtectedTagsRequest::getBody,
                CreateProjectProtectedTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProtectedBranchRequest, DeleteProtectedBranchResponse> deleteProtectedBranch =
        genForDeleteProtectedBranch();

    private static HttpRequestDef<DeleteProtectedBranchRequest, DeleteProtectedBranchResponse> genForDeleteProtectedBranch() {
        // basic
        HttpRequestDef.Builder<DeleteProtectedBranchRequest, DeleteProtectedBranchResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteProtectedBranchRequest.class, DeleteProtectedBranchResponse.class)
            .withName("DeleteProtectedBranch")
            .withUri("/v4/repositories/{repository_id}/protected-branch")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteProtectedBranchRequest::getRepositoryId,
                DeleteProtectedBranchRequest::setRepositoryId));
        builder.<String>withRequestField("branch_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProtectedBranchRequest::getBranchName,
                DeleteProtectedBranchRequest::setBranchName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProtectedTagRequest, DeleteProtectedTagResponse> deleteProtectedTag =
        genForDeleteProtectedTag();

    private static HttpRequestDef<DeleteProtectedTagRequest, DeleteProtectedTagResponse> genForDeleteProtectedTag() {
        // basic
        HttpRequestDef.Builder<DeleteProtectedTagRequest, DeleteProtectedTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProtectedTagRequest.class, DeleteProtectedTagResponse.class)
                .withName("DeleteProtectedTag")
                .withUri("/v4/repositories/{repository_id}/protected-tag")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteProtectedTagRequest::getRepositoryId,
                DeleteProtectedTagRequest::setRepositoryId));
        builder.<String>withRequestField("tag_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProtectedTagRequest::getTagName, DeleteProtectedTagRequest::setTagName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectProtectedBranchesRequest, ListProjectProtectedBranchesResponse> listProjectProtectedBranches =
        genForListProjectProtectedBranches();

    private static HttpRequestDef<ListProjectProtectedBranchesRequest, ListProjectProtectedBranchesResponse> genForListProjectProtectedBranches() {
        // basic
        HttpRequestDef.Builder<ListProjectProtectedBranchesRequest, ListProjectProtectedBranchesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectProtectedBranchesRequest.class,
                    ListProjectProtectedBranchesResponse.class)
                .withName("ListProjectProtectedBranches")
                .withUri("/v4/projects/{project_id}/protected-branches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectProtectedBranchesRequest::getProjectId,
                ListProjectProtectedBranchesRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectProtectedBranchesRequest::getOffset,
                ListProjectProtectedBranchesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectProtectedBranchesRequest::getLimit,
                ListProjectProtectedBranchesRequest::setLimit));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectProtectedBranchesRequest::getSearch,
                ListProjectProtectedBranchesRequest::setSearch));
        builder.<Boolean>withRequestField("user_actions",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectProtectedBranchesRequest::getUserActions,
                ListProjectProtectedBranchesRequest::setUserActions));
        builder.<String>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectProtectedBranchesRequest::getView,
                ListProjectProtectedBranchesRequest::setView));

        // response
        builder.<List<ProjectProtectedBranchApiDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListProjectProtectedBranchesResponse::getBody,
                    ListProjectProtectedBranchesResponse::setBody)
                .withInnerContainerType(ProjectProtectedBranchApiDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectProtectedTagsRequest, ListProjectProtectedTagsResponse> listProjectProtectedTags =
        genForListProjectProtectedTags();

    private static HttpRequestDef<ListProjectProtectedTagsRequest, ListProjectProtectedTagsResponse> genForListProjectProtectedTags() {
        // basic
        HttpRequestDef.Builder<ListProjectProtectedTagsRequest, ListProjectProtectedTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListProjectProtectedTagsRequest.class, ListProjectProtectedTagsResponse.class)
                .withName("ListProjectProtectedTags")
                .withUri("/v4/projects/{project_id}/protected-tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectProtectedTagsRequest::getProjectId,
                ListProjectProtectedTagsRequest::setProjectId));

        // response
        builder.<List<ProjectProtectedTagPo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListProjectProtectedTagsResponse::getBody, ListProjectProtectedTagsResponse::setBody)
                .withInnerContainerType(ProjectProtectedTagPo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectedBranchesRequest, ListProtectedBranchesResponse> listProtectedBranches =
        genForListProtectedBranches();

    private static HttpRequestDef<ListProtectedBranchesRequest, ListProtectedBranchesResponse> genForListProtectedBranches() {
        // basic
        HttpRequestDef.Builder<ListProtectedBranchesRequest, ListProtectedBranchesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProtectedBranchesRequest.class, ListProtectedBranchesResponse.class)
            .withName("ListProtectedBranches")
            .withUri("/v4/repositories/{repository_id}/protected-branches")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectedBranchesRequest::getRepositoryId,
                ListProtectedBranchesRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectedBranchesRequest::getOffset, ListProtectedBranchesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectedBranchesRequest::getLimit, ListProtectedBranchesRequest::setLimit));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedBranchesRequest::getSearch, ListProtectedBranchesRequest::setSearch));

        // response
        builder.<List<RepositoryProtectedBranchDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListProtectedBranchesResponse::getBody, ListProtectedBranchesResponse::setBody)
                .withInnerContainerType(RepositoryProtectedBranchDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectedTagsRequest, ListProtectedTagsResponse> listProtectedTags =
        genForListProtectedTags();

    private static HttpRequestDef<ListProtectedTagsRequest, ListProtectedTagsResponse> genForListProtectedTags() {
        // basic
        HttpRequestDef.Builder<ListProtectedTagsRequest, ListProtectedTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProtectedTagsRequest.class, ListProtectedTagsResponse.class)
                .withName("ListProtectedTags")
                .withUri("/v4/repositories/{repository_id}/protected-tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectedTagsRequest::getRepositoryId,
                ListProtectedTagsRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectedTagsRequest::getOffset, ListProtectedTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectedTagsRequest::getLimit, ListProtectedTagsRequest::setLimit));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedTagsRequest::getSearch, ListProtectedTagsRequest::setSearch));

        // response
        builder.<List<RepositoryProtectedTagDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListProtectedTagsResponse::getBody, ListProtectedTagsResponse::setBody)
                .withInnerContainerType(RepositoryProtectedTagDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowProtectedBranchRequest, ShowProtectedBranchResponse> showProtectedBranch =
        genForShowProtectedBranch();

    private static HttpRequestDef<ShowProtectedBranchRequest, ShowProtectedBranchResponse> genForShowProtectedBranch() {
        // basic
        HttpRequestDef.Builder<ShowProtectedBranchRequest, ShowProtectedBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProtectedBranchRequest.class, ShowProtectedBranchResponse.class)
                .withName("ShowProtectedBranch")
                .withUri("/v4/repositories/{repository_id}/protected-branch")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProtectedBranchRequest::getRepositoryId,
                ShowProtectedBranchRequest::setRepositoryId));
        builder.<String>withRequestField("branch_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProtectedBranchRequest::getBranchName,
                ShowProtectedBranchRequest::setBranchName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProtectedTagRequest, ShowProtectedTagResponse> showProtectedTag =
        genForShowProtectedTag();

    private static HttpRequestDef<ShowProtectedTagRequest, ShowProtectedTagResponse> genForShowProtectedTag() {
        // basic
        HttpRequestDef.Builder<ShowProtectedTagRequest, ShowProtectedTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProtectedTagRequest.class, ShowProtectedTagResponse.class)
                .withName("ShowProtectedTag")
                .withUri("/v4/repositories/{repository_id}/protected-tag")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProtectedTagRequest::getRepositoryId, ShowProtectedTagRequest::setRepositoryId));
        builder.<String>withRequestField("tag_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProtectedTagRequest::getTagName, ShowProtectedTagRequest::setTagName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProtectedBranchRequest, UpdateProtectedBranchResponse> updateProtectedBranch =
        genForUpdateProtectedBranch();

    private static HttpRequestDef<UpdateProtectedBranchRequest, UpdateProtectedBranchResponse> genForUpdateProtectedBranch() {
        // basic
        HttpRequestDef.Builder<UpdateProtectedBranchRequest, UpdateProtectedBranchResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateProtectedBranchRequest.class, UpdateProtectedBranchResponse.class)
            .withName("UpdateProtectedBranch")
            .withUri("/v4/repositories/{repository_id}/protected-branch")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProtectedBranchRequest::getRepositoryId,
                UpdateProtectedBranchRequest::setRepositoryId));
        builder.<String>withRequestField("branch_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProtectedBranchRequest::getBranchName,
                UpdateProtectedBranchRequest::setBranchName));
        builder.<List<ProtectedBranchProtectedActionBodyDto>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateProtectedBranchRequest::getBody, UpdateProtectedBranchRequest::setBody)
                .withInnerContainerType(ProtectedBranchProtectedActionBodyDto.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProtectedTagRequest, UpdateProtectedTagResponse> updateProtectedTag =
        genForUpdateProtectedTag();

    private static HttpRequestDef<UpdateProtectedTagRequest, UpdateProtectedTagResponse> genForUpdateProtectedTag() {
        // basic
        HttpRequestDef.Builder<UpdateProtectedTagRequest, UpdateProtectedTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProtectedTagRequest.class, UpdateProtectedTagResponse.class)
                .withName("UpdateProtectedTag")
                .withUri("/v4/repositories/{repository_id}/protected-tag")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProtectedTagRequest::getRepositoryId,
                UpdateProtectedTagRequest::setRepositoryId));
        builder.<String>withRequestField("tag_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProtectedTagRequest::getTagName, UpdateProtectedTagRequest::setTagName));
        builder.<List<RepositoryProtectedTagActionBodyDto>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateProtectedTagRequest::getBody, UpdateProtectedTagRequest::setBody)
                .withInnerContainerType(RepositoryProtectedTagActionBodyDto.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRefsListRequest, ListRefsListResponse> listRefsList = genForListRefsList();

    private static HttpRequestDef<ListRefsListRequest, ListRefsListResponse> genForListRefsList() {
        // basic
        HttpRequestDef.Builder<ListRefsListRequest, ListRefsListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRefsListRequest.class, ListRefsListResponse.class)
                .withName("ListRefsList")
                .withUri("/v4/repositories/{repository_id}/repository/refs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRefsListRequest::getRepositoryId, ListRefsListRequest::setRepositoryId));
        builder.<ListRefsListRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRefsListRequest.TypeEnum.class),
            f -> f.withMarshaller(ListRefsListRequest::getType, ListRefsListRequest::setType));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRefsListRequest::getSearch, ListRefsListRequest::setSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRefsListRequest::getOffset, ListRefsListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRefsListRequest::getLimit, ListRefsListRequest::setLimit));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRefsListResponse::getBody, ListRefsListResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteBranchRequest, BatchDeleteBranchResponse> batchDeleteBranch =
        genForBatchDeleteBranch();

    private static HttpRequestDef<BatchDeleteBranchRequest, BatchDeleteBranchResponse> genForBatchDeleteBranch() {
        // basic
        HttpRequestDef.Builder<BatchDeleteBranchRequest, BatchDeleteBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteBranchRequest.class, BatchDeleteBranchResponse.class)
                .withName("BatchDeleteBranch")
                .withUri("/v4/repositories/{repository_id}/branches/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchDeleteBranchRequest::getRepositoryId,
                BatchDeleteBranchRequest::setRepositoryId));
        builder.<BatchDeleteBranchDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteBranchDto.class),
            f -> f.withMarshaller(BatchDeleteBranchRequest::getBody, BatchDeleteBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBranchRequest, CreateBranchResponse> createBranch = genForCreateBranch();

    private static HttpRequestDef<CreateBranchRequest, CreateBranchResponse> genForCreateBranch() {
        // basic
        HttpRequestDef.Builder<CreateBranchRequest, CreateBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBranchRequest.class, CreateBranchResponse.class)
                .withName("CreateBranch")
                .withUri("/v4/repositories/{repository_id}/repository/branches")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateBranchRequest::getRepositoryId, CreateBranchRequest::setRepositoryId));
        builder.<CreateBranchDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBranchDto.class),
            f -> f.withMarshaller(CreateBranchRequest::getBody, CreateBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForCreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForCreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v4/repositories/{repository_id}/repository/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateTagRequest::getRepositoryId, CreateTagRequest::setRepositoryId));
        builder.<CreateTagDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagDto.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, CreateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBranchRequest, DeleteBranchResponse> deleteBranch = genForDeleteBranch();

    private static HttpRequestDef<DeleteBranchRequest, DeleteBranchResponse> genForDeleteBranch() {
        // basic
        HttpRequestDef.Builder<DeleteBranchRequest, DeleteBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBranchRequest.class, DeleteBranchResponse.class)
                .withName("DeleteBranch")
                .withUri("/v4/repositories/{repository_id}/repository/branch")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteBranchRequest::getRepositoryId, DeleteBranchRequest::setRepositoryId));
        builder.<String>withRequestField("branch_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBranchRequest::getBranchName, DeleteBranchRequest::setBranchName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v4/repositories/{repository_id}/repository/tag")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTagRequest::getRepositoryId, DeleteTagRequest::setRepositoryId));
        builder.<String>withRequestField("tag_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getTagName, DeleteTagRequest::setTagName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBranchesRequest, ListBranchesResponse> listBranches = genForListBranches();

    private static HttpRequestDef<ListBranchesRequest, ListBranchesResponse> genForListBranches() {
        // basic
        HttpRequestDef.Builder<ListBranchesRequest, ListBranchesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBranchesRequest.class, ListBranchesResponse.class)
                .withName("ListBranches")
                .withUri("/v4/repositories/{repository_id}/repository/branches")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBranchesRequest::getRepositoryId, ListBranchesRequest::setRepositoryId));
        builder.<ListBranchesRequest.BranchTypeEnum>withRequestField("branch_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBranchesRequest.BranchTypeEnum.class),
            f -> f.withMarshaller(ListBranchesRequest::getBranchType, ListBranchesRequest::setBranchType));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesRequest::getCreator, ListBranchesRequest::setCreator));
        builder.<ListBranchesRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBranchesRequest.SortEnum.class),
            f -> f.withMarshaller(ListBranchesRequest::getSort, ListBranchesRequest::setSort));
        builder.<ListBranchesRequest.QueryViewEnum>withRequestField("query_view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBranchesRequest.QueryViewEnum.class),
            f -> f.withMarshaller(ListBranchesRequest::getQueryView, ListBranchesRequest::setQueryView));
        builder.<ListBranchesRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBranchesRequest.ViewEnum.class),
            f -> f.withMarshaller(ListBranchesRequest::getView, ListBranchesRequest::setView));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBranchesRequest::getOffset, ListBranchesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBranchesRequest::getLimit, ListBranchesRequest::setLimit));

        // response
        builder.<List<BranchSimpleDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBranchesResponse::getBody, ListBranchesResponse::setBody)
                .withInnerContainerType(BranchSimpleDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBranchesResponse::getXTotal, ListBranchesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v4/repositories/{repository_id}/repository/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsRequest::getRepositoryId, ListTagsRequest::setRepositoryId));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getCreator, ListTagsRequest::setCreator));
        builder.<ListTagsRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagsRequest.SortEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getSort, ListTagsRequest::setSort));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getSearch, ListTagsRequest::setSearch));
        builder.<ListTagsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getOrderBy, ListTagsRequest::setOrderBy));
        builder.<ListTagsRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagsRequest.ViewEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getView, ListTagsRequest::setView));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsRequest::getOffset, ListTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsRequest::getLimit, ListTagsRequest::setLimit));

        // response
        builder.<List<SimpleTagDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTagsResponse::getBody, ListTagsResponse::setBody)
                .withInnerContainerType(SimpleTagDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTagsResponse::getXTotal, ListTagsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ShowBranchRequest, ShowBranchResponse> showBranch = genForShowBranch();

    private static HttpRequestDef<ShowBranchRequest, ShowBranchResponse> genForShowBranch() {
        // basic
        HttpRequestDef.Builder<ShowBranchRequest, ShowBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBranchRequest.class, ShowBranchResponse.class)
                .withName("ShowBranch")
                .withUri("/v4/repositories/{repository_id}/repository/branch")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBranchRequest::getRepositoryId, ShowBranchRequest::setRepositoryId));
        builder.<String>withRequestField("branch_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBranchRequest::getBranchName, ShowBranchRequest::setBranchName));

        // response

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBranchResponse::getXTotal, ShowBranchResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ShowTagRequest, ShowTagResponse> showTag = genForShowTag();

    private static HttpRequestDef<ShowTagRequest, ShowTagResponse> genForShowTag() {
        // basic
        HttpRequestDef.Builder<ShowTagRequest, ShowTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTagRequest.class, ShowTagResponse.class)
                .withName("ShowTag")
                .withUri("/v4/repositories/{repository_id}/repository/tag")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTagRequest::getRepositoryId, ShowTagRequest::setRepositoryId));
        builder.<String>withRequestField("tag_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagRequest::getTagName, ShowTagRequest::setTagName));

        // response

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTagResponse::getXTotal, ShowTagResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateBranchNameRequest, UpdateBranchNameResponse> updateBranchName =
        genForUpdateBranchName();

    private static HttpRequestDef<UpdateBranchNameRequest, UpdateBranchNameResponse> genForUpdateBranchName() {
        // basic
        HttpRequestDef.Builder<UpdateBranchNameRequest, UpdateBranchNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBranchNameRequest.class, UpdateBranchNameResponse.class)
                .withName("UpdateBranchName")
                .withUri("/v4/repositories/{repository_id}/repository/branch")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateBranchNameRequest::getRepositoryId, UpdateBranchNameRequest::setRepositoryId));
        builder.<UpdateBranchDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBranchDto.class),
            f -> f.withMarshaller(UpdateBranchNameRequest::getBody, UpdateBranchNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSubmoduleRequest, AddSubmoduleResponse> addSubmodule = genForAddSubmodule();

    private static HttpRequestDef<AddSubmoduleRequest, AddSubmoduleResponse> genForAddSubmodule() {
        // basic
        HttpRequestDef.Builder<AddSubmoduleRequest, AddSubmoduleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddSubmoduleRequest.class, AddSubmoduleResponse.class)
                .withName("AddSubmodule")
                .withUri("/v4/repositories/{repository_id}/repository/submodules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddSubmoduleRequest::getRepositoryId, AddSubmoduleRequest::setRepositoryId));
        builder.<SubmoduleReqDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubmoduleReqDto.class),
            f -> f.withMarshaller(AddSubmoduleRequest::getBody, AddSubmoduleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse> addTrustedIpAddress =
        genForAddTrustedIpAddress();

    private static HttpRequestDef<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse> genForAddTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddTrustedIpAddressRequest.class, AddTrustedIpAddressResponse.class)
                .withName("AddTrustedIpAddress")
                .withUri("/v4/projects/{id}/trusted-ip-addresses")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddTrustedIpAddressRequest::getId, AddTrustedIpAddressRequest::setId));
        builder.<AddTrustedIpAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddTrustedIpAddressRequestBody.class),
            f -> f.withMarshaller(AddTrustedIpAddressRequest::getBody, AddTrustedIpAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRemoteMirrorRequest, AssociateRemoteMirrorResponse> associateRemoteMirror =
        genForAssociateRemoteMirror();

    private static HttpRequestDef<AssociateRemoteMirrorRequest, AssociateRemoteMirrorResponse> genForAssociateRemoteMirror() {
        // basic
        HttpRequestDef.Builder<AssociateRemoteMirrorRequest, AssociateRemoteMirrorResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateRemoteMirrorRequest.class, AssociateRemoteMirrorResponse.class)
            .withName("AssociateRemoteMirror")
            .withUri("/v4/repositories/{repository_id}/remote-mirror/associate")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AssociateRemoteMirrorRequest::getRepositoryId,
                AssociateRemoteMirrorRequest::setRepositoryId));
        builder.<RemoteMirrorDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RemoteMirrorDto.class),
            f -> f.withMarshaller(AssociateRemoteMirrorRequest::getBody, AssociateRemoteMirrorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse> associateRepositoryUserGroup =
        genForAssociateRepositoryUserGroup();

    private static HttpRequestDef<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse> genForAssociateRepositoryUserGroup() {
        // basic
        HttpRequestDef.Builder<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateRepositoryUserGroupRequest.class,
                    AssociateRepositoryUserGroupResponse.class)
                .withName("AssociateRepositoryUserGroup")
                .withUri("/v4/{project_id}/repositories/{repository_id}/user-group/{user_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRepositoryUserGroupRequest::getProjectId,
                AssociateRepositoryUserGroupRequest::setProjectId));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AssociateRepositoryUserGroupRequest::getRepositoryId,
                AssociateRepositoryUserGroupRequest::setRepositoryId));
        builder.<String>withRequestField("user_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRepositoryUserGroupRequest::getUserGroupId,
                AssociateRepositoryUserGroupRequest::setUserGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchValidateRepoNamesRequest, BatchValidateRepoNamesResponse> batchValidateRepoNames =
        genForBatchValidateRepoNames();

    private static HttpRequestDef<BatchValidateRepoNamesRequest, BatchValidateRepoNamesResponse> genForBatchValidateRepoNames() {
        // basic
        HttpRequestDef.Builder<BatchValidateRepoNamesRequest, BatchValidateRepoNamesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchValidateRepoNamesRequest.class, BatchValidateRepoNamesResponse.class)
            .withName("BatchValidateRepoNames")
            .withUri("/v4/repository-names/validations")
            .withContentType("application/json");

        // requests
        builder.<ValidateRepoNameDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ValidateRepoNameDto.class),
            f -> f.withMarshaller(BatchValidateRepoNamesRequest::getBody, BatchValidateRepoNamesRequest::setBody));

        // response
        builder.<List<ValidateRepoNameResultDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchValidateRepoNamesResponse::getBody, BatchValidateRepoNamesResponse::setBody)
                .withInnerContainerType(ValidateRepoNameResultDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateDirRequest, CreateDirResponse> createDir = genForCreateDir();

    private static HttpRequestDef<CreateDirRequest, CreateDirResponse> genForCreateDir() {
        // basic
        HttpRequestDef.Builder<CreateDirRequest, CreateDirResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDirRequest.class, CreateDirResponse.class)
                .withName("CreateDir")
                .withUri("/v4/repositories/{repository_id}/repository/dir")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateDirRequest::getRepositoryId, CreateDirRequest::setRepositoryId));
        builder.<RepositoryDirDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RepositoryDirDto.class),
            f -> f.withMarshaller(CreateDirRequest::getBody, CreateDirRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDirResponse::getBody, CreateDirResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepositoryCommitRuleRequest, CreateRepositoryCommitRuleResponse> createRepositoryCommitRule =
        genForCreateRepositoryCommitRule();

    private static HttpRequestDef<CreateRepositoryCommitRuleRequest, CreateRepositoryCommitRuleResponse> genForCreateRepositoryCommitRule() {
        // basic
        HttpRequestDef.Builder<CreateRepositoryCommitRuleRequest, CreateRepositoryCommitRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRepositoryCommitRuleRequest.class,
                    CreateRepositoryCommitRuleResponse.class)
                .withName("CreateRepositoryCommitRule")
                .withUri("/v4/repositories/{repository_id}/commit-rules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateRepositoryCommitRuleRequest::getRepositoryId,
                CreateRepositoryCommitRuleRequest::setRepositoryId));
        builder.<CommitRuleCreateBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommitRuleCreateBodyDto.class),
            f -> f.withMarshaller(CreateRepositoryCommitRuleRequest::getBody,
                CreateRepositoryCommitRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepositoryLabelRequest, CreateRepositoryLabelResponse> createRepositoryLabel =
        genForCreateRepositoryLabel();

    private static HttpRequestDef<CreateRepositoryLabelRequest, CreateRepositoryLabelResponse> genForCreateRepositoryLabel() {
        // basic
        HttpRequestDef.Builder<CreateRepositoryLabelRequest, CreateRepositoryLabelResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateRepositoryLabelRequest.class, CreateRepositoryLabelResponse.class)
            .withName("CreateRepositoryLabel")
            .withUri("/v4/repositories/{repository_id}/labels")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateRepositoryLabelRequest::getRepositoryId,
                CreateRepositoryLabelRequest::setRepositoryId));
        builder.<LabelCreateDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LabelCreateDto.class),
            f -> f.withMarshaller(CreateRepositoryLabelRequest::getBody, CreateRepositoryLabelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepositorySystemLabelsRequest, CreateRepositorySystemLabelsResponse> createRepositorySystemLabels =
        genForCreateRepositorySystemLabels();

    private static HttpRequestDef<CreateRepositorySystemLabelsRequest, CreateRepositorySystemLabelsResponse> genForCreateRepositorySystemLabels() {
        // basic
        HttpRequestDef.Builder<CreateRepositorySystemLabelsRequest, CreateRepositorySystemLabelsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRepositorySystemLabelsRequest.class,
                    CreateRepositorySystemLabelsResponse.class)
                .withName("CreateRepositorySystemLabels")
                .withUri("/v4/repositories/{repository_id}/system-labels")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateRepositorySystemLabelsRequest::getRepositoryId,
                CreateRepositorySystemLabelsRequest::setRepositoryId));

        // response
        builder.<List<LabelDetailDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(CreateRepositorySystemLabelsResponse::getBody,
                    CreateRepositorySystemLabelsResponse::setBody)
                .withInnerContainerType(LabelDetailDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepositoryLabelRequest, DeleteRepositoryLabelResponse> deleteRepositoryLabel =
        genForDeleteRepositoryLabel();

    private static HttpRequestDef<DeleteRepositoryLabelRequest, DeleteRepositoryLabelResponse> genForDeleteRepositoryLabel() {
        // basic
        HttpRequestDef.Builder<DeleteRepositoryLabelRequest, DeleteRepositoryLabelResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteRepositoryLabelRequest.class, DeleteRepositoryLabelResponse.class)
            .withName("DeleteRepositoryLabel")
            .withUri("/v4/repositories/{repository_id}/label")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteRepositoryLabelRequest::getRepositoryId,
                DeleteRepositoryLabelRequest::setRepositoryId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepositoryLabelRequest::getName, DeleteRepositoryLabelRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse> deleteTrustedIpAddress =
        genForDeleteTrustedIpAddress();

    private static HttpRequestDef<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse> genForDeleteTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTrustedIpAddressRequest.class, DeleteTrustedIpAddressResponse.class)
            .withName("DeleteTrustedIpAddress")
            .withUri("/v4/projects/{id}/trusted-ip-addresses/{ip_id}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTrustedIpAddressRequest::getId, DeleteTrustedIpAddressRequest::setId));
        builder.<Integer>withRequestField("ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTrustedIpAddressRequest::getIpId, DeleteTrustedIpAddressRequest::setIpId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadArchiveRequest, DownloadArchiveResponse> downloadArchive =
        genForDownloadArchive();

    private static HttpRequestDef<DownloadArchiveRequest, DownloadArchiveResponse> genForDownloadArchive() {
        // basic
        HttpRequestDef.Builder<DownloadArchiveRequest, DownloadArchiveResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadArchiveRequest.class, DownloadArchiveResponse.class)
                .withName("DownloadArchive")
                .withUri("/v4/repositories/{repository_id}/repository/archive")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadArchiveRequest::getRepositoryId, DownloadArchiveRequest::setRepositoryId));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadArchiveRequest::getSha, DownloadArchiveRequest::setSha));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadArchiveRequest::getPath, DownloadArchiveRequest::setPath));
        builder.<String>withRequestField("archive_format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadArchiveRequest::getArchiveFormat, DownloadArchiveRequest::setArchiveFormat));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteRepositoryStatisticsRequest, ExecuteRepositoryStatisticsResponse> executeRepositoryStatistics =
        genForExecuteRepositoryStatistics();

    private static HttpRequestDef<ExecuteRepositoryStatisticsRequest, ExecuteRepositoryStatisticsResponse> genForExecuteRepositoryStatistics() {
        // basic
        HttpRequestDef.Builder<ExecuteRepositoryStatisticsRequest, ExecuteRepositoryStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteRepositoryStatisticsRequest.class,
                    ExecuteRepositoryStatisticsResponse.class)
                .withName("ExecuteRepositoryStatistics")
                .withUri("/v4/repositories/{repository_id}/repository/statistics")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteRepositoryStatisticsRequest::getRepositoryId,
                ExecuteRepositoryStatisticsRequest::setRepositoryId));
        builder.<StatisticsParamsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StatisticsParamsDto.class),
            f -> f.withMarshaller(ExecuteRepositoryStatisticsRequest::getBody,
                ExecuteRepositoryStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCurrentUserRepositoriesRequest, ListCurrentUserRepositoriesResponse> listCurrentUserRepositories =
        genForListCurrentUserRepositories();

    private static HttpRequestDef<ListCurrentUserRepositoriesRequest, ListCurrentUserRepositoriesResponse> genForListCurrentUserRepositories() {
        // basic
        HttpRequestDef.Builder<ListCurrentUserRepositoriesRequest, ListCurrentUserRepositoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCurrentUserRepositoriesRequest.class,
                    ListCurrentUserRepositoriesResponse.class)
                .withName("ListCurrentUserRepositories")
                .withUri("/v4/user/repositories")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCurrentUserRepositoriesRequest::getOffset,
                ListCurrentUserRepositoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCurrentUserRepositoriesRequest::getLimit,
                ListCurrentUserRepositoriesRequest::setLimit));
        builder.<ListCurrentUserRepositoriesRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCurrentUserRepositoriesRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListCurrentUserRepositoriesRequest::getOrderBy,
                ListCurrentUserRepositoriesRequest::setOrderBy));
        builder.<ListCurrentUserRepositoriesRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCurrentUserRepositoriesRequest.SortEnum.class),
            f -> f.withMarshaller(ListCurrentUserRepositoriesRequest::getSort,
                ListCurrentUserRepositoriesRequest::setSort));
        builder.<Boolean>withRequestField("archived",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCurrentUserRepositoriesRequest::getArchived,
                ListCurrentUserRepositoriesRequest::setArchived));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCurrentUserRepositoriesRequest::getSearch,
                ListCurrentUserRepositoriesRequest::setSearch));
        builder.<Boolean>withRequestField("starred",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCurrentUserRepositoriesRequest::getStarred,
                ListCurrentUserRepositoriesRequest::setStarred));
        builder.<Boolean>withRequestField("membership",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCurrentUserRepositoriesRequest::getMembership,
                ListCurrentUserRepositoriesRequest::setMembership));
        builder.<Boolean>withRequestField("user_created",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCurrentUserRepositoriesRequest::getUserCreated,
                ListCurrentUserRepositoriesRequest::setUserCreated));
        builder.<Boolean>withRequestField("include_abnormal",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCurrentUserRepositoriesRequest::getIncludeAbnormal,
                ListCurrentUserRepositoriesRequest::setIncludeAbnormal));

        // response
        builder.<List<RepositorySimplestDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListCurrentUserRepositoriesResponse::getBody,
                    ListCurrentUserRepositoriesResponse::setBody)
                .withInnerContainerType(RepositorySimplestDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupRepositoriesRequest, ListGroupRepositoriesResponse> listGroupRepositories =
        genForListGroupRepositories();

    private static HttpRequestDef<ListGroupRepositoriesRequest, ListGroupRepositoriesResponse> genForListGroupRepositories() {
        // basic
        HttpRequestDef.Builder<ListGroupRepositoriesRequest, ListGroupRepositoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGroupRepositoriesRequest.class, ListGroupRepositoriesResponse.class)
            .withName("ListGroupRepositories")
            .withUri("/v4/groups/{group_id}/repositories")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupRepositoriesRequest::getGroupId, ListGroupRepositoriesRequest::setGroupId));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupRepositoriesRequest::getSearch, ListGroupRepositoriesRequest::setSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupRepositoriesRequest::getOffset, ListGroupRepositoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupRepositoriesRequest::getLimit, ListGroupRepositoriesRequest::setLimit));
        builder.<ListGroupRepositoriesRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGroupRepositoriesRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListGroupRepositoriesRequest::getOrderBy, ListGroupRepositoriesRequest::setOrderBy));
        builder.<ListGroupRepositoriesRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGroupRepositoriesRequest.SortEnum.class),
            f -> f.withMarshaller(ListGroupRepositoriesRequest::getSort, ListGroupRepositoriesRequest::setSort));

        // response
        builder.<List<BasicRepositoryDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGroupRepositoriesResponse::getBody, ListGroupRepositoriesResponse::setBody)
                .withInnerContainerType(BasicRepositoryDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPersonalRecentPushEventsRequest, ListPersonalRecentPushEventsResponse> listPersonalRecentPushEvents =
        genForListPersonalRecentPushEvents();

    private static HttpRequestDef<ListPersonalRecentPushEventsRequest, ListPersonalRecentPushEventsResponse> genForListPersonalRecentPushEvents() {
        // basic
        HttpRequestDef.Builder<ListPersonalRecentPushEventsRequest, ListPersonalRecentPushEventsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPersonalRecentPushEventsRequest.class,
                    ListPersonalRecentPushEventsResponse.class)
                .withName("ListPersonalRecentPushEvents")
                .withUri("/v4/user/recent-push-events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersonalRecentPushEventsRequest::getProjectId,
                ListPersonalRecentPushEventsRequest::setProjectId));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPersonalRecentPushEventsRequest::getSize,
                ListPersonalRecentPushEventsRequest::setSize));

        // response
        builder.<List<PersonalPushEventDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListPersonalRecentPushEventsResponse::getBody,
                    ListPersonalRecentPushEventsResponse::setBody)
                .withInnerContainerType(PersonalPushEventDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPersonalRepositoryImportRecordsRequest, ListPersonalRepositoryImportRecordsResponse> listPersonalRepositoryImportRecords =
        genForListPersonalRepositoryImportRecords();

    private static HttpRequestDef<ListPersonalRepositoryImportRecordsRequest, ListPersonalRepositoryImportRecordsResponse> genForListPersonalRepositoryImportRecords() {
        // basic
        HttpRequestDef.Builder<ListPersonalRepositoryImportRecordsRequest, ListPersonalRepositoryImportRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPersonalRepositoryImportRecordsRequest.class,
                    ListPersonalRepositoryImportRecordsResponse.class)
                .withName("ListPersonalRepositoryImportRecords")
                .withUri("/v4/user/repository-import-records")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsRequest::getOffset,
                ListPersonalRepositoryImportRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsRequest::getLimit,
                ListPersonalRepositoryImportRecordsRequest::setLimit));
        builder.<ListPersonalRepositoryImportRecordsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPersonalRepositoryImportRecordsRequest.StateEnum.class),
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsRequest::getState,
                ListPersonalRepositoryImportRecordsRequest::setState));
        builder.<ListPersonalRepositoryImportRecordsRequest.SourceTypeEnum>withRequestField("source_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPersonalRepositoryImportRecordsRequest.SourceTypeEnum.class),
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsRequest::getSourceType,
                ListPersonalRepositoryImportRecordsRequest::setSourceType));
        builder.<OffsetDateTime>withRequestField("created_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsRequest::getCreatedAfter,
                ListPersonalRepositoryImportRecordsRequest::setCreatedAfter));
        builder.<OffsetDateTime>withRequestField("created_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsRequest::getCreatedBefore,
                ListPersonalRepositoryImportRecordsRequest::setCreatedBefore));
        builder.<OffsetDateTime>withRequestField("finished_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsRequest::getFinishedAfter,
                ListPersonalRepositoryImportRecordsRequest::setFinishedAfter));
        builder.<OffsetDateTime>withRequestField("finished_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsRequest::getFinishedBefore,
                ListPersonalRepositoryImportRecordsRequest::setFinishedBefore));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsRequest::getSearch,
                ListPersonalRepositoryImportRecordsRequest::setSearch));
        builder.<ListPersonalRepositoryImportRecordsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPersonalRepositoryImportRecordsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsRequest::getOrderBy,
                ListPersonalRepositoryImportRecordsRequest::setOrderBy));
        builder.<ListPersonalRepositoryImportRecordsRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPersonalRepositoryImportRecordsRequest.SortEnum.class),
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsRequest::getSort,
                ListPersonalRepositoryImportRecordsRequest::setSort));

        // response
        builder.<List<RepositoryImportRecordDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListPersonalRepositoryImportRecordsResponse::getBody,
                    ListPersonalRepositoryImportRecordsResponse::setBody)
                .withInnerContainerType(RepositoryImportRecordDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPersonalRepositoryImportRecordsResponse::getXTotal,
                ListPersonalRepositoryImportRecordsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListProjectRepositoriesRequest, ListProjectRepositoriesResponse> listProjectRepositories =
        genForListProjectRepositories();

    private static HttpRequestDef<ListProjectRepositoriesRequest, ListProjectRepositoriesResponse> genForListProjectRepositories() {
        // basic
        HttpRequestDef.Builder<ListProjectRepositoriesRequest, ListProjectRepositoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectRepositoriesRequest.class, ListProjectRepositoriesResponse.class)
            .withName("ListProjectRepositories")
            .withUri("/v4/projects/{project_id}/repositories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectRepositoriesRequest::getProjectId,
                ListProjectRepositoriesRequest::setProjectId));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectRepositoriesRequest::getSearch,
                ListProjectRepositoriesRequest::setSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectRepositoriesRequest::getOffset,
                ListProjectRepositoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectRepositoriesRequest::getLimit, ListProjectRepositoriesRequest::setLimit));
        builder.<ListProjectRepositoriesRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProjectRepositoriesRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListProjectRepositoriesRequest::getOrderBy,
                ListProjectRepositoriesRequest::setOrderBy));
        builder.<ListProjectRepositoriesRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProjectRepositoriesRequest.SortEnum.class),
            f -> f.withMarshaller(ListProjectRepositoriesRequest::getSort, ListProjectRepositoriesRequest::setSort));

        // response
        builder.<List<BasicRepositoryDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListProjectRepositoriesResponse::getBody, ListProjectRepositoriesResponse::setBody)
                .withInnerContainerType(BasicRepositoryDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryCommitRulesRequest, ListRepositoryCommitRulesResponse> listRepositoryCommitRules =
        genForListRepositoryCommitRules();

    private static HttpRequestDef<ListRepositoryCommitRulesRequest, ListRepositoryCommitRulesResponse> genForListRepositoryCommitRules() {
        // basic
        HttpRequestDef.Builder<ListRepositoryCommitRulesRequest, ListRepositoryCommitRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRepositoryCommitRulesRequest.class,
                    ListRepositoryCommitRulesResponse.class)
                .withName("ListRepositoryCommitRules")
                .withUri("/v4/repositories/{repository_id}/commit-rules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryCommitRulesRequest::getRepositoryId,
                ListRepositoryCommitRulesRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryCommitRulesRequest::getOffset,
                ListRepositoryCommitRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryCommitRulesRequest::getLimit,
                ListRepositoryCommitRulesRequest::setLimit));

        // response
        builder.<List<CommitRuleDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListRepositoryCommitRulesResponse::getBody, ListRepositoryCommitRulesResponse::setBody)
                .withInnerContainerType(CommitRuleDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryCommitRulesResponse::getXTotal,
                ListRepositoryCommitRulesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryContributorsRequest, ListRepositoryContributorsResponse> listRepositoryContributors =
        genForListRepositoryContributors();

    private static HttpRequestDef<ListRepositoryContributorsRequest, ListRepositoryContributorsResponse> genForListRepositoryContributors() {
        // basic
        HttpRequestDef.Builder<ListRepositoryContributorsRequest, ListRepositoryContributorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRepositoryContributorsRequest.class,
                    ListRepositoryContributorsResponse.class)
                .withName("ListRepositoryContributors")
                .withUri("/v4/repositories/{repository_id}/contributors")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryContributorsRequest::getRepositoryId,
                ListRepositoryContributorsRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryContributorsRequest::getOffset,
                ListRepositoryContributorsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryContributorsRequest::getLimit,
                ListRepositoryContributorsRequest::setLimit));
        builder.<ListRepositoryContributorsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryContributorsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListRepositoryContributorsRequest::getOrderBy,
                ListRepositoryContributorsRequest::setOrderBy));
        builder.<ListRepositoryContributorsRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryContributorsRequest.SortEnum.class),
            f -> f.withMarshaller(ListRepositoryContributorsRequest::getSort,
                ListRepositoryContributorsRequest::setSort));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryContributorsRequest::getRefName,
                ListRepositoryContributorsRequest::setRefName));
        builder.<Boolean>withRequestField("skip_merge",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRepositoryContributorsRequest::getSkipMerge,
                ListRepositoryContributorsRequest::setSkipMerge));
        builder.<String>withRequestField("author",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryContributorsRequest::getAuthor,
                ListRepositoryContributorsRequest::setAuthor));

        // response
        builder.<List<ContributorDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListRepositoryContributorsResponse::getBody,
                    ListRepositoryContributorsResponse::setBody)
                .withInnerContainerType(ContributorDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryContributorsResponse::getXTotal,
                ListRepositoryContributorsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryEventsRequest, ListRepositoryEventsResponse> listRepositoryEvents =
        genForListRepositoryEvents();

    private static HttpRequestDef<ListRepositoryEventsRequest, ListRepositoryEventsResponse> genForListRepositoryEvents() {
        // basic
        HttpRequestDef.Builder<ListRepositoryEventsRequest, ListRepositoryEventsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRepositoryEventsRequest.class, ListRepositoryEventsResponse.class)
            .withName("ListRepositoryEvents")
            .withUri("/v4/repositories/{repository_id}/events")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryEventsRequest::getRepositoryId,
                ListRepositoryEventsRequest::setRepositoryId));
        builder.<Integer>withRequestField("author_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryEventsRequest::getAuthorId, ListRepositoryEventsRequest::setAuthorId));
        builder.<ListRepositoryEventsRequest.FilterEnum>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryEventsRequest.FilterEnum.class),
            f -> f.withMarshaller(ListRepositoryEventsRequest::getFilter, ListRepositoryEventsRequest::setFilter));
        builder.<OffsetDateTime>withRequestField("before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListRepositoryEventsRequest::getBefore, ListRepositoryEventsRequest::setBefore));
        builder.<OffsetDateTime>withRequestField("after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListRepositoryEventsRequest::getAfter, ListRepositoryEventsRequest::setAfter));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryEventsRequest::getOffset, ListRepositoryEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryEventsRequest::getLimit, ListRepositoryEventsRequest::setLimit));

        // response
        builder.<List<RepositoryPushEventDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepositoryEventsResponse::getBody, ListRepositoryEventsResponse::setBody)
                .withInnerContainerType(RepositoryPushEventDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryEventsResponse::getXTotal, ListRepositoryEventsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryForksRequest, ListRepositoryForksResponse> listRepositoryForks =
        genForListRepositoryForks();

    private static HttpRequestDef<ListRepositoryForksRequest, ListRepositoryForksResponse> genForListRepositoryForks() {
        // basic
        HttpRequestDef.Builder<ListRepositoryForksRequest, ListRepositoryForksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepositoryForksRequest.class, ListRepositoryForksResponse.class)
                .withName("ListRepositoryForks")
                .withUri("/v4/repositories/{repository_id}/forks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryForksRequest::getRepositoryId,
                ListRepositoryForksRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryForksRequest::getOffset, ListRepositoryForksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryForksRequest::getLimit, ListRepositoryForksRequest::setLimit));
        builder.<ListRepositoryForksRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryForksRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListRepositoryForksRequest::getOrderBy, ListRepositoryForksRequest::setOrderBy));
        builder.<ListRepositoryForksRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryForksRequest.SortEnum.class),
            f -> f.withMarshaller(ListRepositoryForksRequest::getSort, ListRepositoryForksRequest::setSort));
        builder.<ListRepositoryForksRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryForksRequest.ViewEnum.class),
            f -> f.withMarshaller(ListRepositoryForksRequest::getView, ListRepositoryForksRequest::setView));

        // response
        builder.<List<ForkRepositoryDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepositoryForksResponse::getBody, ListRepositoryForksResponse::setBody)
                .withInnerContainerType(ForkRepositoryDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryLabelsRequest, ListRepositoryLabelsResponse> listRepositoryLabels =
        genForListRepositoryLabels();

    private static HttpRequestDef<ListRepositoryLabelsRequest, ListRepositoryLabelsResponse> genForListRepositoryLabels() {
        // basic
        HttpRequestDef.Builder<ListRepositoryLabelsRequest, ListRepositoryLabelsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRepositoryLabelsRequest.class, ListRepositoryLabelsResponse.class)
            .withName("ListRepositoryLabels")
            .withUri("/v4/repositories/{repository_id}/labels")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryLabelsRequest::getRepositoryId,
                ListRepositoryLabelsRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryLabelsRequest::getOffset, ListRepositoryLabelsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryLabelsRequest::getLimit, ListRepositoryLabelsRequest::setLimit));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryLabelsRequest::getSearch, ListRepositoryLabelsRequest::setSearch));
        builder.<ListRepositoryLabelsRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryLabelsRequest.SortEnum.class),
            f -> f.withMarshaller(ListRepositoryLabelsRequest::getSort, ListRepositoryLabelsRequest::setSort));
        builder.<Boolean>withRequestField("include_expired",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRepositoryLabelsRequest::getIncludeExpired,
                ListRepositoryLabelsRequest::setIncludeExpired));
        builder.<ListRepositoryLabelsRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryLabelsRequest.ViewEnum.class),
            f -> f.withMarshaller(ListRepositoryLabelsRequest::getView, ListRepositoryLabelsRequest::setView));

        // response
        builder.<List<LabelBasicDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepositoryLabelsResponse::getBody, ListRepositoryLabelsResponse::setBody)
                .withInnerContainerType(LabelBasicDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryLanguagesRequest, ListRepositoryLanguagesResponse> listRepositoryLanguages =
        genForListRepositoryLanguages();

    private static HttpRequestDef<ListRepositoryLanguagesRequest, ListRepositoryLanguagesResponse> genForListRepositoryLanguages() {
        // basic
        HttpRequestDef.Builder<ListRepositoryLanguagesRequest, ListRepositoryLanguagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRepositoryLanguagesRequest.class, ListRepositoryLanguagesResponse.class)
            .withName("ListRepositoryLanguages")
            .withUri("/v4/repositories/{repository_id}/repository/languages")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryLanguagesRequest::getRepositoryId,
                ListRepositoryLanguagesRequest::setRepositoryId));

        // response

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryLanguagesResponse::getXTotal,
                ListRepositoryLanguagesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryTemplatesRequest, ListRepositoryTemplatesResponse> listRepositoryTemplates =
        genForListRepositoryTemplates();

    private static HttpRequestDef<ListRepositoryTemplatesRequest, ListRepositoryTemplatesResponse> genForListRepositoryTemplates() {
        // basic
        HttpRequestDef.Builder<ListRepositoryTemplatesRequest, ListRepositoryTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRepositoryTemplatesRequest.class, ListRepositoryTemplatesResponse.class)
            .withName("ListRepositoryTemplates")
            .withUri("/v4/repository-templates")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryTemplatesRequest::getOffset,
                ListRepositoryTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryTemplatesRequest::getLimit, ListRepositoryTemplatesRequest::setLimit));
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTemplatesRequest::getPlatform,
                ListRepositoryTemplatesRequest::setPlatform));
        builder.<ListRepositoryTemplatesRequest.PipelineEnum>withRequestField("pipeline",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryTemplatesRequest.PipelineEnum.class),
            f -> f.withMarshaller(ListRepositoryTemplatesRequest::getPipeline,
                ListRepositoryTemplatesRequest::setPipeline));
        builder.<ListRepositoryTemplatesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRepositoryTemplatesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListRepositoryTemplatesRequest::getType, ListRepositoryTemplatesRequest::setType));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTemplatesRequest::getSearch,
                ListRepositoryTemplatesRequest::setSearch));
        builder.<String>withRequestField("enter_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTemplatesRequest::getEnterType,
                ListRepositoryTemplatesRequest::setEnterType));
        builder.<ListRepositoryTemplatesRequest.DateOrderEnum>withRequestField("date_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRepositoryTemplatesRequest.DateOrderEnum.class),
            f -> f.withMarshaller(ListRepositoryTemplatesRequest::getDateOrder,
                ListRepositoryTemplatesRequest::setDateOrder));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTemplatesRequest::getLanguage,
                ListRepositoryTemplatesRequest::setLanguage));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTemplatesRequest::getProjectId,
                ListRepositoryTemplatesRequest::setProjectId));

        // response
        builder.<List<RepositoryTemplateDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepositoryTemplatesResponse::getBody, ListRepositoryTemplatesResponse::setBody)
                .withInnerContainerType(RepositoryTemplateDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryTemplatesResponse::getXTotal,
                ListRepositoryTemplatesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListSubmodulesRequest, ListSubmodulesResponse> listSubmodules =
        genForListSubmodules();

    private static HttpRequestDef<ListSubmodulesRequest, ListSubmodulesResponse> genForListSubmodules() {
        // basic
        HttpRequestDef.Builder<ListSubmodulesRequest, ListSubmodulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubmodulesRequest.class, ListSubmodulesResponse.class)
                .withName("ListSubmodules")
                .withUri("/v4/repositories/{repository_id}/repository/submodules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubmodulesRequest::getRepositoryId, ListSubmodulesRequest::setRepositoryId));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubmodulesRequest::getSha, ListSubmodulesRequest::setSha));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubmodulesRequest::getOffset, ListSubmodulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubmodulesRequest::getLimit, ListSubmodulesRequest::setLimit));

        // response
        builder.<List<SubmoduleDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubmodulesResponse::getBody, ListSubmodulesResponse::setBody)
                .withInnerContainerType(SubmoduleDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubmodulesResponse::getXTotal, ListSubmodulesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse> listTrustedIpAddresses =
        genForListTrustedIpAddresses();

    private static HttpRequestDef<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse> genForListTrustedIpAddresses() {
        // basic
        HttpRequestDef.Builder<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTrustedIpAddressesRequest.class, ListTrustedIpAddressesResponse.class)
            .withName("ListTrustedIpAddresses")
            .withUri("/v4/projects/{id}/trusted-ip-addresses")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrustedIpAddressesRequest::getId, ListTrustedIpAddressesRequest::setId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrustedIpAddressesRequest::getOffset, ListTrustedIpAddressesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrustedIpAddressesRequest::getLimit, ListTrustedIpAddressesRequest::setLimit));

        // response
        builder.<List<TrustedIpAddressDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTrustedIpAddressesResponse::getBody, ListTrustedIpAddressesResponse::setBody)
                .withInnerContainerType(TrustedIpAddressDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTrustedIpAddressesResponse::getXTotal,
                ListTrustedIpAddressesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<LockRepositoryRequest, LockRepositoryResponse> lockRepository =
        genForLockRepository();

    private static HttpRequestDef<LockRepositoryRequest, LockRepositoryResponse> genForLockRepository() {
        // basic
        HttpRequestDef.Builder<LockRepositoryRequest, LockRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LockRepositoryRequest.class, LockRepositoryResponse.class)
                .withName("LockRepository")
                .withUri("/v4/{project_id}/repositories/{repository_id}/lock")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LockRepositoryRequest::getProjectId, LockRepositoryRequest::setProjectId));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(LockRepositoryRequest::getRepositoryId, LockRepositoryRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveDeployKeyRequest, RemoveDeployKeyResponse> removeDeployKey =
        genForRemoveDeployKey();

    private static HttpRequestDef<RemoveDeployKeyRequest, RemoveDeployKeyResponse> genForRemoveDeployKey() {
        // basic
        HttpRequestDef.Builder<RemoveDeployKeyRequest, RemoveDeployKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveDeployKeyRequest.class, RemoveDeployKeyResponse.class)
                .withName("RemoveDeployKey")
                .withUri("/v4/repositories/{repository_id}/deploy-keys/{key_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RemoveDeployKeyRequest::getRepositoryId, RemoveDeployKeyRequest::setRepositoryId));
        builder.<Integer>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RemoveDeployKeyRequest::getKeyId, RemoveDeployKeyRequest::setKeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveDeployKeyFromSubmodulesRequest, RemoveDeployKeyFromSubmodulesResponse> removeDeployKeyFromSubmodules =
        genForRemoveDeployKeyFromSubmodules();

    private static HttpRequestDef<RemoveDeployKeyFromSubmodulesRequest, RemoveDeployKeyFromSubmodulesResponse> genForRemoveDeployKeyFromSubmodules() {
        // basic
        HttpRequestDef.Builder<RemoveDeployKeyFromSubmodulesRequest, RemoveDeployKeyFromSubmodulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RemoveDeployKeyFromSubmodulesRequest.class,
                    RemoveDeployKeyFromSubmodulesResponse.class)
                .withName("RemoveDeployKeyFromSubmodules")
                .withUri("/v4/repositories/{repository_id}/deploy-keys/{key_id}/submodules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RemoveDeployKeyFromSubmodulesRequest::getRepositoryId,
                RemoveDeployKeyFromSubmodulesRequest::setRepositoryId));
        builder.<Integer>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RemoveDeployKeyFromSubmodulesRequest::getKeyId,
                RemoveDeployKeyFromSubmodulesRequest::setKeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBlobsRequest, ShowBlobsResponse> showBlobs = genForShowBlobs();

    private static HttpRequestDef<ShowBlobsRequest, ShowBlobsResponse> genForShowBlobs() {
        // basic
        HttpRequestDef.Builder<ShowBlobsRequest, ShowBlobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBlobsRequest.class, ShowBlobsResponse.class)
                .withName("ShowBlobs")
                .withUri("/v4/repositories/{repository_id}/repository/blobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBlobsRequest::getRepositoryId, ShowBlobsRequest::setRepositoryId));
        builder.<String>withRequestField("blob_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBlobsRequest::getBlobId, ShowBlobsRequest::setBlobId));

        // response

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBlobsResponse::getXTotal, ShowBlobsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ShowCommitStatisticsRequest, ShowCommitStatisticsResponse> showCommitStatistics =
        genForShowCommitStatistics();

    private static HttpRequestDef<ShowCommitStatisticsRequest, ShowCommitStatisticsResponse> genForShowCommitStatistics() {
        // basic
        HttpRequestDef.Builder<ShowCommitStatisticsRequest, ShowCommitStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCommitStatisticsRequest.class, ShowCommitStatisticsResponse.class)
            .withName("ShowCommitStatistics")
            .withUri("/v4/repositories/{repository_id}/repository/commit-statistics")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitStatisticsRequest::getRepositoryId,
                ShowCommitStatisticsRequest::setRepositoryId));
        builder.<String>withRequestField("branch_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitStatisticsRequest::getBranchName,
                ShowCommitStatisticsRequest::setBranchName));

        // response

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCommitStatisticsResponse::getXTotal, ShowCommitStatisticsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ShowDiffLinesRequest, ShowDiffLinesResponse> showDiffLines =
        genForShowDiffLines();

    private static HttpRequestDef<ShowDiffLinesRequest, ShowDiffLinesResponse> genForShowDiffLines() {
        // basic
        HttpRequestDef.Builder<ShowDiffLinesRequest, ShowDiffLinesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDiffLinesRequest.class, ShowDiffLinesResponse.class)
                .withName("ShowDiffLines")
                .withUri("/v4/repositories/{repository_id}/diff-lines")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDiffLinesRequest::getRepositoryId, ShowDiffLinesRequest::setRepositoryId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiffLinesRequest::getFilePath, ShowDiffLinesRequest::setFilePath));
        builder.<String>withRequestField("commit_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiffLinesRequest::getCommitId, ShowDiffLinesRequest::setCommitId));
        builder.<Integer>withRequestField("start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDiffLinesRequest::getStart, ShowDiffLinesRequest::setStart));
        builder.<Integer>withRequestField("end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDiffLinesRequest::getEnd, ShowDiffLinesRequest::setEnd));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLastPushEventInRepositoryRequest, ShowLastPushEventInRepositoryResponse> showLastPushEventInRepository =
        genForShowLastPushEventInRepository();

    private static HttpRequestDef<ShowLastPushEventInRepositoryRequest, ShowLastPushEventInRepositoryResponse> genForShowLastPushEventInRepository() {
        // basic
        HttpRequestDef.Builder<ShowLastPushEventInRepositoryRequest, ShowLastPushEventInRepositoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLastPushEventInRepositoryRequest.class,
                    ShowLastPushEventInRepositoryResponse.class)
                .withName("ShowLastPushEventInRepository")
                .withUri("/v4/repositories/{repository_id}/last-push-event")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLastPushEventInRepositoryRequest::getRepositoryId,
                ShowLastPushEventInRepositoryRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotificationSubscriptionRequest, ShowNotificationSubscriptionResponse> showNotificationSubscription =
        genForShowNotificationSubscription();

    private static HttpRequestDef<ShowNotificationSubscriptionRequest, ShowNotificationSubscriptionResponse> genForShowNotificationSubscription() {
        // basic
        HttpRequestDef.Builder<ShowNotificationSubscriptionRequest, ShowNotificationSubscriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowNotificationSubscriptionRequest.class,
                    ShowNotificationSubscriptionResponse.class)
                .withName("ShowNotificationSubscription")
                .withUri("/v4/repositories/{repository_id}/notification-subscriptions/subscription")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowNotificationSubscriptionRequest::getRepositoryId,
                ShowNotificationSubscriptionRequest::setRepositoryId));
        builder.<ShowNotificationSubscriptionRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowNotificationSubscriptionRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowNotificationSubscriptionRequest::getType,
                ShowNotificationSubscriptionRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotificationSubscriptionsStatusRequest, ShowNotificationSubscriptionsStatusResponse> showNotificationSubscriptionsStatus =
        genForShowNotificationSubscriptionsStatus();

    private static HttpRequestDef<ShowNotificationSubscriptionsStatusRequest, ShowNotificationSubscriptionsStatusResponse> genForShowNotificationSubscriptionsStatus() {
        // basic
        HttpRequestDef.Builder<ShowNotificationSubscriptionsStatusRequest, ShowNotificationSubscriptionsStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowNotificationSubscriptionsStatusRequest.class,
                    ShowNotificationSubscriptionsStatusResponse.class)
                .withName("ShowNotificationSubscriptionsStatus")
                .withUri("/v4/repositories/{repository_id}/notification-subscriptions/status")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowNotificationSubscriptionsStatusRequest::getRepositoryId,
                ShowNotificationSubscriptionsStatusRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRefCompareRequest, ShowRefCompareResponse> showRefCompare =
        genForShowRefCompare();

    private static HttpRequestDef<ShowRefCompareRequest, ShowRefCompareResponse> genForShowRefCompare() {
        // basic
        HttpRequestDef.Builder<ShowRefCompareRequest, ShowRefCompareResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRefCompareRequest.class, ShowRefCompareResponse.class)
                .withName("ShowRefCompare")
                .withUri("/v4/repositories/{repository_id}/compare")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getRepositoryId, ShowRefCompareRequest::setRepositoryId));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getFrom, ShowRefCompareRequest::setFrom));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getTo, ShowRefCompareRequest::setTo));
        builder.<ShowRefCompareRequest.CompareTypeEnum>withRequestField("compare_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowRefCompareRequest.CompareTypeEnum.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getCompareType, ShowRefCompareRequest::setCompareType));
        builder.<Integer>withRequestField("target_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getTargetId, ShowRefCompareRequest::setTargetId));
        builder.<Boolean>withRequestField("straight",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getStraight, ShowRefCompareRequest::setStraight));
        builder.<Boolean>withRequestField("ignore_whitespace_change",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getIgnoreWhitespaceChange,
                ShowRefCompareRequest::setIgnoreWhitespaceChange));
        builder.<ShowRefCompareRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowRefCompareRequest.ViewEnum.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getView, ShowRefCompareRequest::setView));
        builder.<Boolean>withRequestField("only_count",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getOnlyCount, ShowRefCompareRequest::setOnlyCount));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getFilePath, ShowRefCompareRequest::setFilePath));
        builder.<ShowRefCompareRequest.AdditionalFieldsEnum>withRequestField("additional_fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowRefCompareRequest.AdditionalFieldsEnum.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getAdditionalFields,
                ShowRefCompareRequest::setAdditionalFields));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getOffset, ShowRefCompareRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRefCompareRequest::getLimit, ShowRefCompareRequest::setLimit));

        // response

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRefCompareResponse::getXTotal, ShowRefCompareResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ShowRemoteMirrorRequest, ShowRemoteMirrorResponse> showRemoteMirror =
        genForShowRemoteMirror();

    private static HttpRequestDef<ShowRemoteMirrorRequest, ShowRemoteMirrorResponse> genForShowRemoteMirror() {
        // basic
        HttpRequestDef.Builder<ShowRemoteMirrorRequest, ShowRemoteMirrorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRemoteMirrorRequest.class, ShowRemoteMirrorResponse.class)
                .withName("ShowRemoteMirror")
                .withUri("/v4/repositories/{repository_id}/remote-mirror")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRemoteMirrorRequest::getRepositoryId, ShowRemoteMirrorRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> showRepository =
        genForShowRepository();

    private static HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> genForShowRepository() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryRequest, ShowRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepositoryRequest.class, ShowRepositoryResponse.class)
                .withName("ShowRepository")
                .withUri("/v4/repositories/{repository_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getRepositoryId, ShowRepositoryRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryGeneralCommitRuleRequest, ShowRepositoryGeneralCommitRuleResponse> showRepositoryGeneralCommitRule =
        genForShowRepositoryGeneralCommitRule();

    private static HttpRequestDef<ShowRepositoryGeneralCommitRuleRequest, ShowRepositoryGeneralCommitRuleResponse> genForShowRepositoryGeneralCommitRule() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryGeneralCommitRuleRequest, ShowRepositoryGeneralCommitRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRepositoryGeneralCommitRuleRequest.class,
                    ShowRepositoryGeneralCommitRuleResponse.class)
                .withName("ShowRepositoryGeneralCommitRule")
                .withUri("/v4/repositories/{repository_id}/general-commit-rule")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryGeneralCommitRuleRequest::getRepositoryId,
                ShowRepositoryGeneralCommitRuleRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryGeneralPolicyRequest, ShowRepositoryGeneralPolicyResponse> showRepositoryGeneralPolicy =
        genForShowRepositoryGeneralPolicy();

    private static HttpRequestDef<ShowRepositoryGeneralPolicyRequest, ShowRepositoryGeneralPolicyResponse> genForShowRepositoryGeneralPolicy() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryGeneralPolicyRequest, ShowRepositoryGeneralPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRepositoryGeneralPolicyRequest.class,
                    ShowRepositoryGeneralPolicyResponse.class)
                .withName("ShowRepositoryGeneralPolicy")
                .withUri("/v4/repositories/{repository_id}/general-policy")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryGeneralPolicyRequest::getRepositoryId,
                ShowRepositoryGeneralPolicyRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryInheritSettingRequest, ShowRepositoryInheritSettingResponse> showRepositoryInheritSetting =
        genForShowRepositoryInheritSetting();

    private static HttpRequestDef<ShowRepositoryInheritSettingRequest, ShowRepositoryInheritSettingResponse> genForShowRepositoryInheritSetting() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryInheritSettingRequest, ShowRepositoryInheritSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRepositoryInheritSettingRequest.class,
                    ShowRepositoryInheritSettingResponse.class)
                .withName("ShowRepositoryInheritSetting")
                .withUri("/v4/repositories/{repository_id}/inherit-setting")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryInheritSettingRequest::getRepositoryId,
                ShowRepositoryInheritSettingRequest::setRepositoryId));

        // response
        builder.<List<RepositoryInheritSettingDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowRepositoryInheritSettingResponse::getBody,
                    ShowRepositoryInheritSettingResponse::setBody)
                .withInnerContainerType(RepositoryInheritSettingDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryInheritSettingSourceRequest, ShowRepositoryInheritSettingSourceResponse> showRepositoryInheritSettingSource =
        genForShowRepositoryInheritSettingSource();

    private static HttpRequestDef<ShowRepositoryInheritSettingSourceRequest, ShowRepositoryInheritSettingSourceResponse> genForShowRepositoryInheritSettingSource() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryInheritSettingSourceRequest, ShowRepositoryInheritSettingSourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRepositoryInheritSettingSourceRequest.class,
                    ShowRepositoryInheritSettingSourceResponse.class)
                .withName("ShowRepositoryInheritSettingSource")
                .withUri("/v4/repositories/{repository_id}/inherit-setting-source")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryInheritSettingSourceRequest::getRepositoryId,
                ShowRepositoryInheritSettingSourceRequest::setRepositoryId));
        builder.<ShowRepositoryInheritSettingSourceRequest.NameEnum>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowRepositoryInheritSettingSourceRequest.NameEnum.class),
            f -> f.withMarshaller(ShowRepositoryInheritSettingSourceRequest::getName,
                ShowRepositoryInheritSettingSourceRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryStatisticsStatusRequest, ShowRepositoryStatisticsStatusResponse> showRepositoryStatisticsStatus =
        genForShowRepositoryStatisticsStatus();

    private static HttpRequestDef<ShowRepositoryStatisticsStatusRequest, ShowRepositoryStatisticsStatusResponse> genForShowRepositoryStatisticsStatus() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryStatisticsStatusRequest, ShowRepositoryStatisticsStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRepositoryStatisticsStatusRequest.class,
                    ShowRepositoryStatisticsStatusResponse.class)
                .withName("ShowRepositoryStatisticsStatus")
                .withUri("/v4/repositories/{repository_id}/repository/statistics-status")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryStatisticsStatusRequest::getRepositoryId,
                ShowRepositoryStatisticsStatusRequest::setRepositoryId));

        // response

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRepositoryStatisticsStatusResponse::getXTotal,
                ShowRepositoryStatisticsStatusResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryStatisticsSummaryRequest, ShowRepositoryStatisticsSummaryResponse> showRepositoryStatisticsSummary =
        genForShowRepositoryStatisticsSummary();

    private static HttpRequestDef<ShowRepositoryStatisticsSummaryRequest, ShowRepositoryStatisticsSummaryResponse> genForShowRepositoryStatisticsSummary() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryStatisticsSummaryRequest, ShowRepositoryStatisticsSummaryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRepositoryStatisticsSummaryRequest.class,
                    ShowRepositoryStatisticsSummaryResponse.class)
                .withName("ShowRepositoryStatisticsSummary")
                .withUri("/v4/repositories/{repository_id}/statistics-summary")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryStatisticsSummaryRequest::getRepositoryId,
                ShowRepositoryStatisticsSummaryRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryWatermarkRequest, ShowRepositoryWatermarkResponse> showRepositoryWatermark =
        genForShowRepositoryWatermark();

    private static HttpRequestDef<ShowRepositoryWatermarkRequest, ShowRepositoryWatermarkResponse> genForShowRepositoryWatermark() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryWatermarkRequest, ShowRepositoryWatermarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRepositoryWatermarkRequest.class, ShowRepositoryWatermarkResponse.class)
            .withName("ShowRepositoryWatermark")
            .withUri("/v4/repositories/{repository_id}/watermark")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryWatermarkRequest::getRepositoryId,
                ShowRepositoryWatermarkRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserRefPermissionRequest, ShowUserRefPermissionResponse> showUserRefPermission =
        genForShowUserRefPermission();

    private static HttpRequestDef<ShowUserRefPermissionRequest, ShowUserRefPermissionResponse> genForShowUserRefPermission() {
        // basic
        HttpRequestDef.Builder<ShowUserRefPermissionRequest, ShowUserRefPermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowUserRefPermissionRequest.class, ShowUserRefPermissionResponse.class)
            .withName("ShowUserRefPermission")
            .withUri("/v4/repositories/{repository_id}/user-ref-permission")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUserRefPermissionRequest::getRepositoryId,
                ShowUserRefPermissionRequest::setRepositoryId));
        builder.<String>withRequestField("target_ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRefPermissionRequest::getTargetRef,
                ShowUserRefPermissionRequest::setTargetRef));
        builder.<ShowUserRefPermissionRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowUserRefPermissionRequest.ActionEnum.class),
            f -> f.withMarshaller(ShowUserRefPermissionRequest::getAction, ShowUserRefPermissionRequest::setAction));
        builder.<Integer>withRequestField("change_request_iid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUserRefPermissionRequest::getChangeRequestIid,
                ShowUserRefPermissionRequest::setChangeRequestIid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartHouseKeepingRequest, StartHouseKeepingResponse> startHouseKeeping =
        genForStartHouseKeeping();

    private static HttpRequestDef<StartHouseKeepingRequest, StartHouseKeepingResponse> genForStartHouseKeeping() {
        // basic
        HttpRequestDef.Builder<StartHouseKeepingRequest, StartHouseKeepingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartHouseKeepingRequest.class, StartHouseKeepingResponse.class)
                .withName("StartHouseKeeping")
                .withUri("/v4/repositories/{repository_id}/housekeeping")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StartHouseKeepingRequest::getRepositoryId,
                StartHouseKeepingRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartRemoteMirrorSynchronizationRequest, StartRemoteMirrorSynchronizationResponse> startRemoteMirrorSynchronization =
        genForStartRemoteMirrorSynchronization();

    private static HttpRequestDef<StartRemoteMirrorSynchronizationRequest, StartRemoteMirrorSynchronizationResponse> genForStartRemoteMirrorSynchronization() {
        // basic
        HttpRequestDef.Builder<StartRemoteMirrorSynchronizationRequest, StartRemoteMirrorSynchronizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartRemoteMirrorSynchronizationRequest.class,
                    StartRemoteMirrorSynchronizationResponse.class)
                .withName("StartRemoteMirrorSynchronization")
                .withUri("/v4/repositories/{repository_id}/remote-mirror")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StartRemoteMirrorSynchronizationRequest::getRepositoryId,
                StartRemoteMirrorSynchronizationRequest::setRepositoryId));
        builder.<RemoteMirrorSyncInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RemoteMirrorSyncInfoDto.class),
            f -> f.withMarshaller(StartRemoteMirrorSynchronizationRequest::getBody,
                StartRemoteMirrorSynchronizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncDeployKeyToSubmodulesRequest, SyncDeployKeyToSubmodulesResponse> syncDeployKeyToSubmodules =
        genForSyncDeployKeyToSubmodules();

    private static HttpRequestDef<SyncDeployKeyToSubmodulesRequest, SyncDeployKeyToSubmodulesResponse> genForSyncDeployKeyToSubmodules() {
        // basic
        HttpRequestDef.Builder<SyncDeployKeyToSubmodulesRequest, SyncDeployKeyToSubmodulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SyncDeployKeyToSubmodulesRequest.class,
                    SyncDeployKeyToSubmodulesResponse.class)
                .withName("SyncDeployKeyToSubmodules")
                .withUri("/v4/repositories/{repository_id}/deploy-keys/{key_id}/submodules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SyncDeployKeyToSubmodulesRequest::getRepositoryId,
                SyncDeployKeyToSubmodulesRequest::setRepositoryId));
        builder.<Integer>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SyncDeployKeyToSubmodulesRequest::getKeyId,
                SyncDeployKeyToSubmodulesRequest::setKeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnlockRepositoryRequest, UnlockRepositoryResponse> unlockRepository =
        genForUnlockRepository();

    private static HttpRequestDef<UnlockRepositoryRequest, UnlockRepositoryResponse> genForUnlockRepository() {
        // basic
        HttpRequestDef.Builder<UnlockRepositoryRequest, UnlockRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnlockRepositoryRequest.class, UnlockRepositoryResponse.class)
                .withName("UnlockRepository")
                .withUri("/v4/{project_id}/repositories/{repository_id}/unlock")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnlockRepositoryRequest::getProjectId, UnlockRepositoryRequest::setProjectId));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UnlockRepositoryRequest::getRepositoryId, UnlockRepositoryRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotificationSubscriptionRequest, UpdateNotificationSubscriptionResponse> updateNotificationSubscription =
        genForUpdateNotificationSubscription();

    private static HttpRequestDef<UpdateNotificationSubscriptionRequest, UpdateNotificationSubscriptionResponse> genForUpdateNotificationSubscription() {
        // basic
        HttpRequestDef.Builder<UpdateNotificationSubscriptionRequest, UpdateNotificationSubscriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateNotificationSubscriptionRequest.class,
                    UpdateNotificationSubscriptionResponse.class)
                .withName("UpdateNotificationSubscription")
                .withUri("/v4/repositories/{repository_id}/notification-subscriptions/subscription")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateNotificationSubscriptionRequest::getRepositoryId,
                UpdateNotificationSubscriptionRequest::setRepositoryId));
        builder.<UpdateNotificationSubscriptionRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNotificationSubscriptionRequest.TypeEnum.class),
            f -> f.withMarshaller(UpdateNotificationSubscriptionRequest::getType,
                UpdateNotificationSubscriptionRequest::setType));
        builder.<UpdateRepoNotificationSubscriptionDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateRepoNotificationSubscriptionDto.class),
            f -> f.withMarshaller(UpdateNotificationSubscriptionRequest::getBody,
                UpdateNotificationSubscriptionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepositoryCommitRuleRequest, UpdateRepositoryCommitRuleResponse> updateRepositoryCommitRule =
        genForUpdateRepositoryCommitRule();

    private static HttpRequestDef<UpdateRepositoryCommitRuleRequest, UpdateRepositoryCommitRuleResponse> genForUpdateRepositoryCommitRule() {
        // basic
        HttpRequestDef.Builder<UpdateRepositoryCommitRuleRequest, UpdateRepositoryCommitRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRepositoryCommitRuleRequest.class,
                    UpdateRepositoryCommitRuleResponse.class)
                .withName("UpdateRepositoryCommitRule")
                .withUri("/v4/repositories/{repository_id}/commit-rules/{commit_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryCommitRuleRequest::getRepositoryId,
                UpdateRepositoryCommitRuleRequest::setRepositoryId));
        builder.<Integer>withRequestField("commit_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryCommitRuleRequest::getCommitRuleId,
                UpdateRepositoryCommitRuleRequest::setCommitRuleId));
        builder.<CommitRuleUpdateBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommitRuleUpdateBodyDto.class),
            f -> f.withMarshaller(UpdateRepositoryCommitRuleRequest::getBody,
                UpdateRepositoryCommitRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepositoryGeneralCommitRuleRequest, UpdateRepositoryGeneralCommitRuleResponse> updateRepositoryGeneralCommitRule =
        genForUpdateRepositoryGeneralCommitRule();

    private static HttpRequestDef<UpdateRepositoryGeneralCommitRuleRequest, UpdateRepositoryGeneralCommitRuleResponse> genForUpdateRepositoryGeneralCommitRule() {
        // basic
        HttpRequestDef.Builder<UpdateRepositoryGeneralCommitRuleRequest, UpdateRepositoryGeneralCommitRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRepositoryGeneralCommitRuleRequest.class,
                    UpdateRepositoryGeneralCommitRuleResponse.class)
                .withName("UpdateRepositoryGeneralCommitRule")
                .withUri("/v4/repositories/{repository_id}/general-commit-rule")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryGeneralCommitRuleRequest::getRepositoryId,
                UpdateRepositoryGeneralCommitRuleRequest::setRepositoryId));
        builder.<GeneralCommitRuleBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GeneralCommitRuleBodyDto.class),
            f -> f.withMarshaller(UpdateRepositoryGeneralCommitRuleRequest::getBody,
                UpdateRepositoryGeneralCommitRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepositoryGeneralPolicyRequest, UpdateRepositoryGeneralPolicyResponse> updateRepositoryGeneralPolicy =
        genForUpdateRepositoryGeneralPolicy();

    private static HttpRequestDef<UpdateRepositoryGeneralPolicyRequest, UpdateRepositoryGeneralPolicyResponse> genForUpdateRepositoryGeneralPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateRepositoryGeneralPolicyRequest, UpdateRepositoryGeneralPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRepositoryGeneralPolicyRequest.class,
                    UpdateRepositoryGeneralPolicyResponse.class)
                .withName("UpdateRepositoryGeneralPolicy")
                .withUri("/v4/repositories/{repository_id}/general-policy")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryGeneralPolicyRequest::getRepositoryId,
                UpdateRepositoryGeneralPolicyRequest::setRepositoryId));
        builder.<GeneralPolicyBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GeneralPolicyBodyDto.class),
            f -> f.withMarshaller(UpdateRepositoryGeneralPolicyRequest::getBody,
                UpdateRepositoryGeneralPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepositoryInheritSettingRequest, UpdateRepositoryInheritSettingResponse> updateRepositoryInheritSetting =
        genForUpdateRepositoryInheritSetting();

    private static HttpRequestDef<UpdateRepositoryInheritSettingRequest, UpdateRepositoryInheritSettingResponse> genForUpdateRepositoryInheritSetting() {
        // basic
        HttpRequestDef.Builder<UpdateRepositoryInheritSettingRequest, UpdateRepositoryInheritSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRepositoryInheritSettingRequest.class,
                    UpdateRepositoryInheritSettingResponse.class)
                .withName("UpdateRepositoryInheritSetting")
                .withUri("/v4/repositories/{repository_id}/inherit-setting")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryInheritSettingRequest::getRepositoryId,
                UpdateRepositoryInheritSettingRequest::setRepositoryId));
        builder.<RepositoryInheritSettingsBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RepositoryInheritSettingsBodyDto.class),
            f -> f.withMarshaller(UpdateRepositoryInheritSettingRequest::getBody,
                UpdateRepositoryInheritSettingRequest::setBody));

        // response
        builder.<List<RepositoryInheritSettingDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(UpdateRepositoryInheritSettingResponse::getBody,
                    UpdateRepositoryInheritSettingResponse::setBody)
                .withInnerContainerType(RepositoryInheritSettingDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepositoryLabelRequest, UpdateRepositoryLabelResponse> updateRepositoryLabel =
        genForUpdateRepositoryLabel();

    private static HttpRequestDef<UpdateRepositoryLabelRequest, UpdateRepositoryLabelResponse> genForUpdateRepositoryLabel() {
        // basic
        HttpRequestDef.Builder<UpdateRepositoryLabelRequest, UpdateRepositoryLabelResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateRepositoryLabelRequest.class, UpdateRepositoryLabelResponse.class)
            .withName("UpdateRepositoryLabel")
            .withUri("/v4/repositories/{repository_id}/label")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryLabelRequest::getRepositoryId,
                UpdateRepositoryLabelRequest::setRepositoryId));
        builder.<BodyPutLabelDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BodyPutLabelDto.class),
            f -> f.withMarshaller(UpdateRepositoryLabelRequest::getBody, UpdateRepositoryLabelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepositoryRemoteMirrorRequest, UpdateRepositoryRemoteMirrorResponse> updateRepositoryRemoteMirror =
        genForUpdateRepositoryRemoteMirror();

    private static HttpRequestDef<UpdateRepositoryRemoteMirrorRequest, UpdateRepositoryRemoteMirrorResponse> genForUpdateRepositoryRemoteMirror() {
        // basic
        HttpRequestDef.Builder<UpdateRepositoryRemoteMirrorRequest, UpdateRepositoryRemoteMirrorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRepositoryRemoteMirrorRequest.class,
                    UpdateRepositoryRemoteMirrorResponse.class)
                .withName("UpdateRepositoryRemoteMirror")
                .withUri("/v4/repositories/{repository_id}/remote-mirror")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryRemoteMirrorRequest::getRepositoryId,
                UpdateRepositoryRemoteMirrorRequest::setRepositoryId));
        builder.<RemoteMirrorUpdateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RemoteMirrorUpdateBody.class),
            f -> f.withMarshaller(UpdateRepositoryRemoteMirrorRequest::getBody,
                UpdateRepositoryRemoteMirrorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepositoryWatermarkRequest, UpdateRepositoryWatermarkResponse> updateRepositoryWatermark =
        genForUpdateRepositoryWatermark();

    private static HttpRequestDef<UpdateRepositoryWatermarkRequest, UpdateRepositoryWatermarkResponse> genForUpdateRepositoryWatermark() {
        // basic
        HttpRequestDef.Builder<UpdateRepositoryWatermarkRequest, UpdateRepositoryWatermarkResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRepositoryWatermarkRequest.class,
                    UpdateRepositoryWatermarkResponse.class)
                .withName("UpdateRepositoryWatermark")
                .withUri("/v4/repositories/{repository_id}/watermark")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryWatermarkRequest::getRepositoryId,
                UpdateRepositoryWatermarkRequest::setRepositoryId));
        builder.<UpdateWatermarkDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWatermarkDto.class),
            f -> f.withMarshaller(UpdateRepositoryWatermarkRequest::getBody,
                UpdateRepositoryWatermarkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse> updateTrustedIpAddress =
        genForUpdateTrustedIpAddress();

    private static HttpRequestDef<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse> genForUpdateTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateTrustedIpAddressRequest.class, UpdateTrustedIpAddressResponse.class)
            .withName("UpdateTrustedIpAddress")
            .withUri("/v4/projects/{id}/trusted-ip-addresses/{ip_id}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTrustedIpAddressRequest::getId, UpdateTrustedIpAddressRequest::setId));
        builder.<Integer>withRequestField("ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTrustedIpAddressRequest::getIpId, UpdateTrustedIpAddressRequest::setIpId));
        builder.<AddTrustedIpAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddTrustedIpAddressRequestBody.class),
            f -> f.withMarshaller(UpdateTrustedIpAddressRequest::getBody, UpdateTrustedIpAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse> addTenantTrustedIpAddress =
        genForAddTenantTrustedIpAddress();

    private static HttpRequestDef<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse> genForAddTenantTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddTenantTrustedIpAddressRequest.class,
                    AddTenantTrustedIpAddressResponse.class)
                .withName("AddTenantTrustedIpAddress")
                .withUri("/v4/tenant/trusted-ip-addresses")
                .withContentType("application/json");

        // requests
        builder.<AddTrustedIpAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddTrustedIpAddressRequestBody.class),
            f -> f.withMarshaller(AddTenantTrustedIpAddressRequest::getBody,
                AddTenantTrustedIpAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse> deleteTenantTrustedIpAddress =
        genForDeleteTenantTrustedIpAddress();

    private static HttpRequestDef<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse> genForDeleteTenantTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTenantTrustedIpAddressRequest.class,
                    DeleteTenantTrustedIpAddressResponse.class)
                .withName("DeleteTenantTrustedIpAddress")
                .withUri("/v4/tenant/trusted-ip-addresses/{ip_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTenantTrustedIpAddressRequest::getIpId,
                DeleteTenantTrustedIpAddressRequest::setIpId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportTenantRepositoriesRequest, ExportTenantRepositoriesResponse> exportTenantRepositories =
        genForExportTenantRepositories();

    private static HttpRequestDef<ExportTenantRepositoriesRequest, ExportTenantRepositoriesResponse> genForExportTenantRepositories() {
        // basic
        HttpRequestDef.Builder<ExportTenantRepositoriesRequest, ExportTenantRepositoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ExportTenantRepositoriesRequest.class, ExportTenantRepositoriesResponse.class)
                .withName("ExportTenantRepositories")
                .withUri("/v4/tenant/repositories/export")
                .withContentType("application/json");

        // requests
        builder.<ExportTenantRepositoryBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportTenantRepositoryBody.class),
            f -> f.withMarshaller(ExportTenantRepositoriesRequest::getBody, ExportTenantRepositoriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTenantRepositoriesRequest, ListTenantRepositoriesResponse> listTenantRepositories =
        genForListTenantRepositories();

    private static HttpRequestDef<ListTenantRepositoriesRequest, ListTenantRepositoriesResponse> genForListTenantRepositories() {
        // basic
        HttpRequestDef.Builder<ListTenantRepositoriesRequest, ListTenantRepositoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTenantRepositoriesRequest.class, ListTenantRepositoriesResponse.class)
            .withName("ListTenantRepositories")
            .withUri("/v4/tenant/repositories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantRepositoriesRequest::getRepositoryName,
                ListTenantRepositoriesRequest::setRepositoryName));
        builder.<Integer>withRequestField("member_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantRepositoriesRequest::getMemberNumber,
                ListTenantRepositoriesRequest::setMemberNumber));
        builder.<ListTenantRepositoriesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTenantRepositoriesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListTenantRepositoriesRequest::getStatus, ListTenantRepositoriesRequest::setStatus));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantRepositoriesRequest::getOwner, ListTenantRepositoriesRequest::setOwner));
        builder.<OffsetDateTime>withRequestField("created_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListTenantRepositoriesRequest::getCreatedAfter,
                ListTenantRepositoriesRequest::setCreatedAfter));
        builder.<OffsetDateTime>withRequestField("created_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListTenantRepositoriesRequest::getCreatedBefore,
                ListTenantRepositoriesRequest::setCreatedBefore));
        builder.<ListTenantRepositoriesRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTenantRepositoriesRequest.SortEnum.class),
            f -> f.withMarshaller(ListTenantRepositoriesRequest::getSort, ListTenantRepositoriesRequest::setSort));
        builder.<ListTenantRepositoriesRequest.SortFieldEnum>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTenantRepositoriesRequest.SortFieldEnum.class),
            f -> f.withMarshaller(ListTenantRepositoriesRequest::getSortField,
                ListTenantRepositoriesRequest::setSortField));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantRepositoriesRequest::getOffset, ListTenantRepositoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantRepositoriesRequest::getLimit, ListTenantRepositoriesRequest::setLimit));

        // response
        builder.<List<TenantRepositoryDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTenantRepositoriesResponse::getBody, ListTenantRepositoriesResponse::setBody)
                .withInnerContainerType(TenantRepositoryDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTenantRepositoriesResponse::getXTotal,
                ListTenantRepositoriesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse> listTenantTrustedIpAddresses =
        genForListTenantTrustedIpAddresses();

    private static HttpRequestDef<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse> genForListTenantTrustedIpAddresses() {
        // basic
        HttpRequestDef.Builder<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTenantTrustedIpAddressesRequest.class,
                    ListTenantTrustedIpAddressesResponse.class)
                .withName("ListTenantTrustedIpAddresses")
                .withUri("/v4/tenant/trusted-ip-addresses")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantTrustedIpAddressesRequest::getOffset,
                ListTenantTrustedIpAddressesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantTrustedIpAddressesRequest::getLimit,
                ListTenantTrustedIpAddressesRequest::setLimit));

        // response
        builder.<List<TenantTrustedIpAddressDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListTenantTrustedIpAddressesResponse::getBody,
                    ListTenantTrustedIpAddressesResponse::setBody)
                .withInnerContainerType(TenantTrustedIpAddressDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTenantTrustedIpAddressesResponse::getXTotal,
                ListTenantTrustedIpAddressesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse> updateTenantTrustedIpAddress =
        genForUpdateTenantTrustedIpAddress();

    private static HttpRequestDef<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse> genForUpdateTenantTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTenantTrustedIpAddressRequest.class,
                    UpdateTenantTrustedIpAddressResponse.class)
                .withName("UpdateTenantTrustedIpAddress")
                .withUri("/v4/tenant/trusted-ip-addresses/{ip_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTenantTrustedIpAddressRequest::getIpId,
                UpdateTenantTrustedIpAddressRequest::setIpId));
        builder.<AddTrustedIpAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddTrustedIpAddressRequestBody.class),
            f -> f.withMarshaller(UpdateTenantTrustedIpAddressRequest::getBody,
                UpdateTenantTrustedIpAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDeployKeyRequest, CheckDeployKeyResponse> checkDeployKey =
        genForCheckDeployKey();

    private static HttpRequestDef<CheckDeployKeyRequest, CheckDeployKeyResponse> genForCheckDeployKey() {
        // basic
        HttpRequestDef.Builder<CheckDeployKeyRequest, CheckDeployKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckDeployKeyRequest.class, CheckDeployKeyResponse.class)
                .withName("CheckDeployKey")
                .withUri("/v4/repositories/{repository_id}/deploy-keys/check-key")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckDeployKeyRequest::getRepositoryId, CheckDeployKeyRequest::setRepositoryId));
        builder.<DeployKeyValueDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployKeyValueDto.class),
            f -> f.withMarshaller(CheckDeployKeyRequest::getBody, CheckDeployKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckGroupDeployKeyRequest, CheckGroupDeployKeyResponse> checkGroupDeployKey =
        genForCheckGroupDeployKey();

    private static HttpRequestDef<CheckGroupDeployKeyRequest, CheckGroupDeployKeyResponse> genForCheckGroupDeployKey() {
        // basic
        HttpRequestDef.Builder<CheckGroupDeployKeyRequest, CheckGroupDeployKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckGroupDeployKeyRequest.class, CheckGroupDeployKeyResponse.class)
                .withName("CheckGroupDeployKey")
                .withUri("/v4/groups/{group_id}/deploy-keys/check-key")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckGroupDeployKeyRequest::getGroupId, CheckGroupDeployKeyRequest::setGroupId));
        builder.<DeployKeyValueDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployKeyValueDto.class),
            f -> f.withMarshaller(CheckGroupDeployKeyRequest::getBody, CheckGroupDeployKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBranchRelatedWorkItemsRequest, ListBranchRelatedWorkItemsResponse> listBranchRelatedWorkItems =
        genForListBranchRelatedWorkItems();

    private static HttpRequestDef<ListBranchRelatedWorkItemsRequest, ListBranchRelatedWorkItemsResponse> genForListBranchRelatedWorkItems() {
        // basic
        HttpRequestDef.Builder<ListBranchRelatedWorkItemsRequest, ListBranchRelatedWorkItemsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBranchRelatedWorkItemsRequest.class,
                    ListBranchRelatedWorkItemsResponse.class)
                .withName("ListBranchRelatedWorkItems")
                .withUri("/v4/repositories/{repository_id}/branch/work-items")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBranchRelatedWorkItemsRequest::getRepositoryId,
                ListBranchRelatedWorkItemsRequest::setRepositoryId));
        builder.<String>withRequestField("branch_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchRelatedWorkItemsRequest::getBranchName,
                ListBranchRelatedWorkItemsRequest::setBranchName));

        // response
        builder.<List<WorkItemSimpleDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListBranchRelatedWorkItemsResponse::getBody,
                    ListBranchRelatedWorkItemsResponse::setBody)
                .withInnerContainerType(WorkItemSimpleDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupDeployKeysRequest, ListGroupDeployKeysResponse> listGroupDeployKeys =
        genForListGroupDeployKeys();

    private static HttpRequestDef<ListGroupDeployKeysRequest, ListGroupDeployKeysResponse> genForListGroupDeployKeys() {
        // basic
        HttpRequestDef.Builder<ListGroupDeployKeysRequest, ListGroupDeployKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupDeployKeysRequest.class, ListGroupDeployKeysResponse.class)
                .withName("ListGroupDeployKeys")
                .withUri("/v4/groups/{group_id}/deploy-keys")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupDeployKeysRequest::getGroupId, ListGroupDeployKeysRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupDeployKeysRequest::getOffset, ListGroupDeployKeysRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupDeployKeysRequest::getLimit, ListGroupDeployKeysRequest::setLimit));

        // response
        builder.<List<DeployKeyDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGroupDeployKeysResponse::getBody, ListGroupDeployKeysResponse::setBody)
                .withInnerContainerType(DeployKeyDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGroupDeployKeysResponse::getXTotal, ListGroupDeployKeysResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListProjectDeployKeysRequest, ListProjectDeployKeysResponse> listProjectDeployKeys =
        genForListProjectDeployKeys();

    private static HttpRequestDef<ListProjectDeployKeysRequest, ListProjectDeployKeysResponse> genForListProjectDeployKeys() {
        // basic
        HttpRequestDef.Builder<ListProjectDeployKeysRequest, ListProjectDeployKeysResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectDeployKeysRequest.class, ListProjectDeployKeysResponse.class)
            .withName("ListProjectDeployKeys")
            .withUri("/v4/projects/{project_id}/deploy-keys")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectDeployKeysRequest::getProjectId,
                ListProjectDeployKeysRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectDeployKeysRequest::getOffset, ListProjectDeployKeysRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectDeployKeysRequest::getLimit, ListProjectDeployKeysRequest::setLimit));

        // response
        builder.<List<DeployKeyDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListProjectDeployKeysResponse::getBody, ListProjectDeployKeysResponse::setBody)
                .withInnerContainerType(DeployKeyDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectDeployKeysResponse::getXTotal, ListProjectDeployKeysResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryDeployKeysRequest, ListRepositoryDeployKeysResponse> listRepositoryDeployKeys =
        genForListRepositoryDeployKeys();

    private static HttpRequestDef<ListRepositoryDeployKeysRequest, ListRepositoryDeployKeysResponse> genForListRepositoryDeployKeys() {
        // basic
        HttpRequestDef.Builder<ListRepositoryDeployKeysRequest, ListRepositoryDeployKeysResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListRepositoryDeployKeysRequest.class, ListRepositoryDeployKeysResponse.class)
                .withName("ListRepositoryDeployKeys")
                .withUri("/v4/repositories/{repository_id}/deploy-keys")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryDeployKeysRequest::getRepositoryId,
                ListRepositoryDeployKeysRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryDeployKeysRequest::getOffset,
                ListRepositoryDeployKeysRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryDeployKeysRequest::getLimit,
                ListRepositoryDeployKeysRequest::setLimit));

        // response
        builder.<List<DeployKeyDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepositoryDeployKeysResponse::getBody, ListRepositoryDeployKeysResponse::setBody)
                .withInnerContainerType(DeployKeyDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryDeployKeysResponse::getXTotal,
                ListRepositoryDeployKeysResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryWorkItemsRequest, ListRepositoryWorkItemsResponse> listRepositoryWorkItems =
        genForListRepositoryWorkItems();

    private static HttpRequestDef<ListRepositoryWorkItemsRequest, ListRepositoryWorkItemsResponse> genForListRepositoryWorkItems() {
        // basic
        HttpRequestDef.Builder<ListRepositoryWorkItemsRequest, ListRepositoryWorkItemsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRepositoryWorkItemsRequest.class, ListRepositoryWorkItemsResponse.class)
            .withName("ListRepositoryWorkItems")
            .withUri("/v4/repositories/{repository_id}/work-items")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryWorkItemsRequest::getRepositoryId,
                ListRepositoryWorkItemsRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryWorkItemsRequest::getOffset,
                ListRepositoryWorkItemsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryWorkItemsRequest::getLimit, ListRepositoryWorkItemsRequest::setLimit));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryWorkItemsRequest::getProjectId,
                ListRepositoryWorkItemsRequest::setProjectId));
        builder.<Boolean>withRequestField("is_ipd",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRepositoryWorkItemsRequest::getIsIpd, ListRepositoryWorkItemsRequest::setIsIpd));
        builder.<String>withRequestField("subject",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryWorkItemsRequest::getSubject,
                ListRepositoryWorkItemsRequest::setSubject));
        builder.<String>withRequestField("target_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryWorkItemsRequest::getTargetBranch,
                ListRepositoryWorkItemsRequest::setTargetBranch));

        // response
        builder.<List<ReqWorkItemDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepositoryWorkItemsResponse::getBody, ListRepositoryWorkItemsResponse::setBody)
                .withInnerContainerType(ReqWorkItemDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryWorkItemsResponse::getXTotal,
                ListRepositoryWorkItemsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupE2eSettingRequest, ShowGroupE2eSettingResponse> showGroupE2eSetting =
        genForShowGroupE2eSetting();

    private static HttpRequestDef<ShowGroupE2eSettingRequest, ShowGroupE2eSettingResponse> genForShowGroupE2eSetting() {
        // basic
        HttpRequestDef.Builder<ShowGroupE2eSettingRequest, ShowGroupE2eSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupE2eSettingRequest.class, ShowGroupE2eSettingResponse.class)
                .withName("ShowGroupE2eSetting")
                .withUri("/v4/groups/{group_id}/e2e-setting")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupE2eSettingRequest::getGroupId, ShowGroupE2eSettingRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectE2eSettingRequest, ShowProjectE2eSettingResponse> showProjectE2eSetting =
        genForShowProjectE2eSetting();

    private static HttpRequestDef<ShowProjectE2eSettingRequest, ShowProjectE2eSettingResponse> genForShowProjectE2eSetting() {
        // basic
        HttpRequestDef.Builder<ShowProjectE2eSettingRequest, ShowProjectE2eSettingResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectE2eSettingRequest.class, ShowProjectE2eSettingResponse.class)
            .withName("ShowProjectE2eSetting")
            .withUri("/v4/projects/{project_id}/e2e-setting")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectE2eSettingRequest::getProjectId,
                ShowProjectE2eSettingRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryE2eSettingRequest, ShowRepositoryE2eSettingResponse> showRepositoryE2eSetting =
        genForShowRepositoryE2eSetting();

    private static HttpRequestDef<ShowRepositoryE2eSettingRequest, ShowRepositoryE2eSettingResponse> genForShowRepositoryE2eSetting() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryE2eSettingRequest, ShowRepositoryE2eSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowRepositoryE2eSettingRequest.class, ShowRepositoryE2eSettingResponse.class)
                .withName("ShowRepositoryE2eSetting")
                .withUri("/v4/repositories/{repository_id}/e2e-setting")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryE2eSettingRequest::getRepositoryId,
                ShowRepositoryE2eSettingRequest::setRepositoryId));
        builder.<Boolean>withRequestField("take_effect",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRepositoryE2eSettingRequest::getTakeEffect,
                ShowRepositoryE2eSettingRequest::setTakeEffect));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSshKeyRequest, AddSshKeyResponse> addSshKey = genForAddSshKey();

    private static HttpRequestDef<AddSshKeyRequest, AddSshKeyResponse> genForAddSshKey() {
        // basic
        HttpRequestDef.Builder<AddSshKeyRequest, AddSshKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddSshKeyRequest.class, AddSshKeyResponse.class)
                .withName("AddSshKey")
                .withUri("/v4/user/keys")
                .withContentType("application/json");

        // requests
        builder.<DeployKeyParamsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployKeyParamsDto.class),
            f -> f.withMarshaller(AddSshKeyRequest::getBody, AddSshKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchValidateUserGroupPermissionsRequest, BatchValidateUserGroupPermissionsResponse> batchValidateUserGroupPermissions =
        genForBatchValidateUserGroupPermissions();

    private static HttpRequestDef<BatchValidateUserGroupPermissionsRequest, BatchValidateUserGroupPermissionsResponse> genForBatchValidateUserGroupPermissions() {
        // basic
        HttpRequestDef.Builder<BatchValidateUserGroupPermissionsRequest, BatchValidateUserGroupPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchValidateUserGroupPermissionsRequest.class,
                    BatchValidateUserGroupPermissionsResponse.class)
                .withName("BatchValidateUserGroupPermissions")
                .withUri("/v4/user/groups/group-permissions")
                .withContentType("application/json");

        // requests
        builder.<List<GroupPermissionsDto>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(BatchValidateUserGroupPermissionsRequest::getBody,
                    BatchValidateUserGroupPermissionsRequest::setBody)
                .withInnerContainerType(GroupPermissionsDto.class));

        // response
        builder.<List<UserGroupPermissionDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(BatchValidateUserGroupPermissionsResponse::getBody,
                    BatchValidateUserGroupPermissionsResponse::setBody)
                .withInnerContainerType(UserGroupPermissionDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSshKeyRequest, DeleteSshKeyResponse> deleteSshKey = genForDeleteSshKey();

    private static HttpRequestDef<DeleteSshKeyRequest, DeleteSshKeyResponse> genForDeleteSshKey() {
        // basic
        HttpRequestDef.Builder<DeleteSshKeyRequest, DeleteSshKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSshKeyRequest.class, DeleteSshKeyResponse.class)
                .withName("DeleteSshKey")
                .withUri("/v4/user/keys/{key_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteSshKeyRequest::getKeyId, DeleteSshKeyRequest::setKeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImpersonationTokensRequest, ListImpersonationTokensResponse> listImpersonationTokens =
        genForListImpersonationTokens();

    private static HttpRequestDef<ListImpersonationTokensRequest, ListImpersonationTokensResponse> genForListImpersonationTokens() {
        // basic
        HttpRequestDef.Builder<ListImpersonationTokensRequest, ListImpersonationTokensResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListImpersonationTokensRequest.class, ListImpersonationTokensResponse.class)
            .withName("ListImpersonationTokens")
            .withUri("/v4/users/impersonation-tokens")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImpersonationTokensRequest::getGroupId,
                ListImpersonationTokensRequest::setGroupId));
        builder.<ListImpersonationTokensRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImpersonationTokensRequest.StateEnum.class),
            f -> f.withMarshaller(ListImpersonationTokensRequest::getState, ListImpersonationTokensRequest::setState));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImpersonationTokensRequest::getSearch,
                ListImpersonationTokensRequest::setSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImpersonationTokensRequest::getOffset,
                ListImpersonationTokensRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImpersonationTokensRequest::getLimit, ListImpersonationTokensRequest::setLimit));

        // response
        builder.<List<ImpersonationToken>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListImpersonationTokensResponse::getBody, ListImpersonationTokensResponse::setBody)
                .withInnerContainerType(ImpersonationToken.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListUserGpgKeysRequest, ListUserGpgKeysResponse> listUserGpgKeys =
        genForListUserGpgKeys();

    private static HttpRequestDef<ListUserGpgKeysRequest, ListUserGpgKeysResponse> genForListUserGpgKeys() {
        // basic
        HttpRequestDef.Builder<ListUserGpgKeysRequest, ListUserGpgKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserGpgKeysRequest.class, ListUserGpgKeysResponse.class)
                .withName("ListUserGpgKeys")
                .withUri("/v4/user/gpg-keys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserGpgKeysRequest::getQuery, ListUserGpgKeysRequest::setQuery));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserKeysRequest, ListUserKeysResponse> listUserKeys = genForListUserKeys();

    private static HttpRequestDef<ListUserKeysRequest, ListUserKeysResponse> genForListUserKeys() {
        // basic
        HttpRequestDef.Builder<ListUserKeysRequest, ListUserKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserKeysRequest.class, ListUserKeysResponse.class)
                .withName("ListUserKeys")
                .withUri("/v4/user/keys")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserKeysRequest::getOffset, ListUserKeysRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserKeysRequest::getLimit, ListUserKeysRequest::setLimit));
        builder.<String>withRequestField("query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserKeysRequest::getQuery, ListUserKeysRequest::setQuery));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendUserEmailVerifyCodeRequest, SendUserEmailVerifyCodeResponse> sendUserEmailVerifyCode =
        genForSendUserEmailVerifyCode();

    private static HttpRequestDef<SendUserEmailVerifyCodeRequest, SendUserEmailVerifyCodeResponse> genForSendUserEmailVerifyCode() {
        // basic
        HttpRequestDef.Builder<SendUserEmailVerifyCodeRequest, SendUserEmailVerifyCodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SendUserEmailVerifyCodeRequest.class, SendUserEmailVerifyCodeResponse.class)
            .withName("SendUserEmailVerifyCode")
            .withUri("/v4/user/email-verify-code")
            .withContentType("application/json");

        // requests
        builder.<ModifyEmailAddressDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyEmailAddressDto.class),
            f -> f.withMarshaller(SendUserEmailVerifyCodeRequest::getBody, SendUserEmailVerifyCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpsPasswordSettingRequest, ShowHttpsPasswordSettingResponse> showHttpsPasswordSetting =
        genForShowHttpsPasswordSetting();

    private static HttpRequestDef<ShowHttpsPasswordSettingRequest, ShowHttpsPasswordSettingResponse> genForShowHttpsPasswordSetting() {
        // basic
        HttpRequestDef.Builder<ShowHttpsPasswordSettingRequest, ShowHttpsPasswordSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowHttpsPasswordSettingRequest.class, ShowHttpsPasswordSettingResponse.class)
                .withName("ShowHttpsPasswordSetting")
                .withUri("/v4/user/https-password-setting")
                .withContentType("application/json");

        // requests

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHttpsPasswordSettingResponse::getBody,
                ShowHttpsPasswordSettingResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserEmailsRequest, ShowUserEmailsResponse> showUserEmails =
        genForShowUserEmails();

    private static HttpRequestDef<ShowUserEmailsRequest, ShowUserEmailsResponse> genForShowUserEmails() {
        // basic
        HttpRequestDef.Builder<ShowUserEmailsRequest, ShowUserEmailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserEmailsRequest.class, ShowUserEmailsResponse.class)
                .withName("ShowUserEmails")
                .withUri("/v4/user/emails")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpsPasswordSettingRequest, UpdateHttpsPasswordSettingResponse> updateHttpsPasswordSetting =
        genForUpdateHttpsPasswordSetting();

    private static HttpRequestDef<UpdateHttpsPasswordSettingRequest, UpdateHttpsPasswordSettingResponse> genForUpdateHttpsPasswordSetting() {
        // basic
        HttpRequestDef.Builder<UpdateHttpsPasswordSettingRequest, UpdateHttpsPasswordSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateHttpsPasswordSettingRequest.class,
                    UpdateHttpsPasswordSettingResponse.class)
                .withName("UpdateHttpsPasswordSetting")
                .withUri("/v4/user/https-password-setting")
                .withContentType("application/json");

        // requests
        builder.<UpdateHttpsPasswordSetting>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHttpsPasswordSetting.class),
            f -> f.withMarshaller(UpdateHttpsPasswordSettingRequest::getBody,
                UpdateHttpsPasswordSettingRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateHttpsPasswordSettingResponse::getBody,
                UpdateHttpsPasswordSettingResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserEmailsRequest, UpdateUserEmailsResponse> updateUserEmails =
        genForUpdateUserEmails();

    private static HttpRequestDef<UpdateUserEmailsRequest, UpdateUserEmailsResponse> genForUpdateUserEmails() {
        // basic
        HttpRequestDef.Builder<UpdateUserEmailsRequest, UpdateUserEmailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserEmailsRequest.class, UpdateUserEmailsResponse.class)
                .withName("UpdateUserEmails")
                .withUri("/v4/user/emails")
                .withContentType("application/json");

        // requests
        builder.<ModifyEmailAddressDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyEmailAddressDto.class),
            f -> f.withMarshaller(UpdateUserEmailsRequest::getBody, UpdateUserEmailsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddGroupWebhookRequest, AddGroupWebhookResponse> addGroupWebhook =
        genForAddGroupWebhook();

    private static HttpRequestDef<AddGroupWebhookRequest, AddGroupWebhookResponse> genForAddGroupWebhook() {
        // basic
        HttpRequestDef.Builder<AddGroupWebhookRequest, AddGroupWebhookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddGroupWebhookRequest.class, AddGroupWebhookResponse.class)
                .withName("AddGroupWebhook")
                .withUri("/v4/groups/{group_id}/hooks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddGroupWebhookRequest::getGroupId, AddGroupWebhookRequest::setGroupId));
        builder.<WebhookParamsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WebhookParamsDto.class),
            f -> f.withMarshaller(AddGroupWebhookRequest::getBody, AddGroupWebhookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddProjectWebhookRequest, AddProjectWebhookResponse> addProjectWebhook =
        genForAddProjectWebhook();

    private static HttpRequestDef<AddProjectWebhookRequest, AddProjectWebhookResponse> genForAddProjectWebhook() {
        // basic
        HttpRequestDef.Builder<AddProjectWebhookRequest, AddProjectWebhookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddProjectWebhookRequest.class, AddProjectWebhookResponse.class)
                .withName("AddProjectWebhook")
                .withUri("/v4/projects/{project_id}/hooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddProjectWebhookRequest::getProjectId, AddProjectWebhookRequest::setProjectId));
        builder.<WebhookParamsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WebhookParamsDto.class),
            f -> f.withMarshaller(AddProjectWebhookRequest::getBody, AddProjectWebhookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRepositoryWebhookRequest, AddRepositoryWebhookResponse> addRepositoryWebhook =
        genForAddRepositoryWebhook();

    private static HttpRequestDef<AddRepositoryWebhookRequest, AddRepositoryWebhookResponse> genForAddRepositoryWebhook() {
        // basic
        HttpRequestDef.Builder<AddRepositoryWebhookRequest, AddRepositoryWebhookResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddRepositoryWebhookRequest.class, AddRepositoryWebhookResponse.class)
            .withName("AddRepositoryWebhook")
            .withUri("/v4/repositories/{repository_id}/hooks")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddRepositoryWebhookRequest::getRepositoryId,
                AddRepositoryWebhookRequest::setRepositoryId));
        builder.<WebhookParamsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WebhookParamsDto.class),
            f -> f.withMarshaller(AddRepositoryWebhookRequest::getBody, AddRepositoryWebhookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupWebhookLogsRequest, ListGroupWebhookLogsResponse> listGroupWebhookLogs =
        genForListGroupWebhookLogs();

    private static HttpRequestDef<ListGroupWebhookLogsRequest, ListGroupWebhookLogsResponse> genForListGroupWebhookLogs() {
        // basic
        HttpRequestDef.Builder<ListGroupWebhookLogsRequest, ListGroupWebhookLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGroupWebhookLogsRequest.class, ListGroupWebhookLogsResponse.class)
            .withName("ListGroupWebhookLogs")
            .withUri("/v4/groups/{group_id}/hooks/{hook_id}/logs")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupWebhookLogsRequest::getGroupId, ListGroupWebhookLogsRequest::setGroupId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupWebhookLogsRequest::getHookId, ListGroupWebhookLogsRequest::setHookId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupWebhookLogsRequest::getOffset, ListGroupWebhookLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupWebhookLogsRequest::getLimit, ListGroupWebhookLogsRequest::setLimit));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupWebhookLogsRequest::getRepositoryId,
                ListGroupWebhookLogsRequest::setRepositoryId));
        builder.<String>withRequestField("uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupWebhookLogsRequest::getUuid, ListGroupWebhookLogsRequest::setUuid));
        builder.<OffsetDateTime>withRequestField("created_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListGroupWebhookLogsRequest::getCreatedAfter,
                ListGroupWebhookLogsRequest::setCreatedAfter));
        builder.<OffsetDateTime>withRequestField("created_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListGroupWebhookLogsRequest::getCreatedBefore,
                ListGroupWebhookLogsRequest::setCreatedBefore));

        // response
        builder.<List<WebhookLogExtendDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGroupWebhookLogsResponse::getBody, ListGroupWebhookLogsResponse::setBody)
                .withInnerContainerType(WebhookLogExtendDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGroupWebhookLogsResponse::getXTotal, ListGroupWebhookLogsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListGroupWebhooksRequest, ListGroupWebhooksResponse> listGroupWebhooks =
        genForListGroupWebhooks();

    private static HttpRequestDef<ListGroupWebhooksRequest, ListGroupWebhooksResponse> genForListGroupWebhooks() {
        // basic
        HttpRequestDef.Builder<ListGroupWebhooksRequest, ListGroupWebhooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupWebhooksRequest.class, ListGroupWebhooksResponse.class)
                .withName("ListGroupWebhooks")
                .withUri("/v4/groups/{group_id}/hooks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupWebhooksRequest::getGroupId, ListGroupWebhooksRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupWebhooksRequest::getOffset, ListGroupWebhooksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupWebhooksRequest::getLimit, ListGroupWebhooksRequest::setLimit));

        // response
        builder.<List<WebhookDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGroupWebhooksResponse::getBody, ListGroupWebhooksResponse::setBody)
                .withInnerContainerType(WebhookDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGroupWebhooksResponse::getXTotal, ListGroupWebhooksResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListProjectWebhookLogsRequest, ListProjectWebhookLogsResponse> listProjectWebhookLogs =
        genForListProjectWebhookLogs();

    private static HttpRequestDef<ListProjectWebhookLogsRequest, ListProjectWebhookLogsResponse> genForListProjectWebhookLogs() {
        // basic
        HttpRequestDef.Builder<ListProjectWebhookLogsRequest, ListProjectWebhookLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectWebhookLogsRequest.class, ListProjectWebhookLogsResponse.class)
            .withName("ListProjectWebhookLogs")
            .withUri("/v4/projects/{project_id}/hooks/{hook_id}/logs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectWebhookLogsRequest::getProjectId,
                ListProjectWebhookLogsRequest::setProjectId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectWebhookLogsRequest::getHookId, ListProjectWebhookLogsRequest::setHookId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectWebhookLogsRequest::getOffset, ListProjectWebhookLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectWebhookLogsRequest::getLimit, ListProjectWebhookLogsRequest::setLimit));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectWebhookLogsRequest::getRepositoryId,
                ListProjectWebhookLogsRequest::setRepositoryId));
        builder.<String>withRequestField("uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectWebhookLogsRequest::getUuid, ListProjectWebhookLogsRequest::setUuid));
        builder.<OffsetDateTime>withRequestField("created_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListProjectWebhookLogsRequest::getCreatedAfter,
                ListProjectWebhookLogsRequest::setCreatedAfter));
        builder.<OffsetDateTime>withRequestField("created_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListProjectWebhookLogsRequest::getCreatedBefore,
                ListProjectWebhookLogsRequest::setCreatedBefore));

        // response
        builder.<List<WebhookLogExtendDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListProjectWebhookLogsResponse::getBody, ListProjectWebhookLogsResponse::setBody)
                .withInnerContainerType(WebhookLogExtendDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectWebhookLogsResponse::getXTotal,
                ListProjectWebhookLogsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListProjectWebhooksRequest, ListProjectWebhooksResponse> listProjectWebhooks =
        genForListProjectWebhooks();

    private static HttpRequestDef<ListProjectWebhooksRequest, ListProjectWebhooksResponse> genForListProjectWebhooks() {
        // basic
        HttpRequestDef.Builder<ListProjectWebhooksRequest, ListProjectWebhooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectWebhooksRequest.class, ListProjectWebhooksResponse.class)
                .withName("ListProjectWebhooks")
                .withUri("/v4/projects/{project_id}/hooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectWebhooksRequest::getProjectId, ListProjectWebhooksRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectWebhooksRequest::getOffset, ListProjectWebhooksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectWebhooksRequest::getLimit, ListProjectWebhooksRequest::setLimit));

        // response
        builder.<List<WebhookDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListProjectWebhooksResponse::getBody, ListProjectWebhooksResponse::setBody)
                .withInnerContainerType(WebhookDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectWebhooksResponse::getXTotal, ListProjectWebhooksResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryWebhookLogsRequest, ListRepositoryWebhookLogsResponse> listRepositoryWebhookLogs =
        genForListRepositoryWebhookLogs();

    private static HttpRequestDef<ListRepositoryWebhookLogsRequest, ListRepositoryWebhookLogsResponse> genForListRepositoryWebhookLogs() {
        // basic
        HttpRequestDef.Builder<ListRepositoryWebhookLogsRequest, ListRepositoryWebhookLogsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRepositoryWebhookLogsRequest.class,
                    ListRepositoryWebhookLogsResponse.class)
                .withName("ListRepositoryWebhookLogs")
                .withUri("/v4/repositories/{repository_id}/hooks/{hook_id}/logs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryWebhookLogsRequest::getRepositoryId,
                ListRepositoryWebhookLogsRequest::setRepositoryId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryWebhookLogsRequest::getHookId,
                ListRepositoryWebhookLogsRequest::setHookId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryWebhookLogsRequest::getOffset,
                ListRepositoryWebhookLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryWebhookLogsRequest::getLimit,
                ListRepositoryWebhookLogsRequest::setLimit));
        builder.<String>withRequestField("uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryWebhookLogsRequest::getUuid,
                ListRepositoryWebhookLogsRequest::setUuid));
        builder.<OffsetDateTime>withRequestField("created_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListRepositoryWebhookLogsRequest::getCreatedAfter,
                ListRepositoryWebhookLogsRequest::setCreatedAfter));
        builder.<OffsetDateTime>withRequestField("created_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListRepositoryWebhookLogsRequest::getCreatedBefore,
                ListRepositoryWebhookLogsRequest::setCreatedBefore));

        // response
        builder.<List<WebhookLogDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListRepositoryWebhookLogsResponse::getBody, ListRepositoryWebhookLogsResponse::setBody)
                .withInnerContainerType(WebhookLogDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryWebhookLogsResponse::getXTotal,
                ListRepositoryWebhookLogsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryWebhooksRequest, ListRepositoryWebhooksResponse> listRepositoryWebhooks =
        genForListRepositoryWebhooks();

    private static HttpRequestDef<ListRepositoryWebhooksRequest, ListRepositoryWebhooksResponse> genForListRepositoryWebhooks() {
        // basic
        HttpRequestDef.Builder<ListRepositoryWebhooksRequest, ListRepositoryWebhooksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRepositoryWebhooksRequest.class, ListRepositoryWebhooksResponse.class)
            .withName("ListRepositoryWebhooks")
            .withUri("/v4/repositories/{repository_id}/hooks")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryWebhooksRequest::getRepositoryId,
                ListRepositoryWebhooksRequest::setRepositoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryWebhooksRequest::getOffset, ListRepositoryWebhooksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryWebhooksRequest::getLimit, ListRepositoryWebhooksRequest::setLimit));

        // response
        builder.<List<WebhookDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepositoryWebhooksResponse::getBody, ListRepositoryWebhooksResponse::setBody)
                .withInnerContainerType(WebhookDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryWebhooksResponse::getXTotal,
                ListRepositoryWebhooksResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<RemoveGroupWebhookRequest, RemoveGroupWebhookResponse> removeGroupWebhook =
        genForRemoveGroupWebhook();

    private static HttpRequestDef<RemoveGroupWebhookRequest, RemoveGroupWebhookResponse> genForRemoveGroupWebhook() {
        // basic
        HttpRequestDef.Builder<RemoveGroupWebhookRequest, RemoveGroupWebhookResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveGroupWebhookRequest.class, RemoveGroupWebhookResponse.class)
                .withName("RemoveGroupWebhook")
                .withUri("/v4/groups/{group_id}/hooks/{hook_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RemoveGroupWebhookRequest::getGroupId, RemoveGroupWebhookRequest::setGroupId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RemoveGroupWebhookRequest::getHookId, RemoveGroupWebhookRequest::setHookId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveProjectWebhookRequest, RemoveProjectWebhookResponse> removeProjectWebhook =
        genForRemoveProjectWebhook();

    private static HttpRequestDef<RemoveProjectWebhookRequest, RemoveProjectWebhookResponse> genForRemoveProjectWebhook() {
        // basic
        HttpRequestDef.Builder<RemoveProjectWebhookRequest, RemoveProjectWebhookResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, RemoveProjectWebhookRequest.class, RemoveProjectWebhookResponse.class)
            .withName("RemoveProjectWebhook")
            .withUri("/v4/projects/{project_id}/hooks/{hook_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveProjectWebhookRequest::getProjectId,
                RemoveProjectWebhookRequest::setProjectId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RemoveProjectWebhookRequest::getHookId, RemoveProjectWebhookRequest::setHookId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveRepositoryWebhookRequest, RemoveRepositoryWebhookResponse> removeRepositoryWebhook =
        genForRemoveRepositoryWebhook();

    private static HttpRequestDef<RemoveRepositoryWebhookRequest, RemoveRepositoryWebhookResponse> genForRemoveRepositoryWebhook() {
        // basic
        HttpRequestDef.Builder<RemoveRepositoryWebhookRequest, RemoveRepositoryWebhookResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, RemoveRepositoryWebhookRequest.class, RemoveRepositoryWebhookResponse.class)
            .withName("RemoveRepositoryWebhook")
            .withUri("/v4/repositories/{repository_id}/hooks/{hook_id}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RemoveRepositoryWebhookRequest::getRepositoryId,
                RemoveRepositoryWebhookRequest::setRepositoryId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RemoveRepositoryWebhookRequest::getHookId,
                RemoveRepositoryWebhookRequest::setHookId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupWebhookRequest, ShowGroupWebhookResponse> showGroupWebhook =
        genForShowGroupWebhook();

    private static HttpRequestDef<ShowGroupWebhookRequest, ShowGroupWebhookResponse> genForShowGroupWebhook() {
        // basic
        HttpRequestDef.Builder<ShowGroupWebhookRequest, ShowGroupWebhookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupWebhookRequest.class, ShowGroupWebhookResponse.class)
                .withName("ShowGroupWebhook")
                .withUri("/v4/groups/{group_id}/hooks/{hook_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupWebhookRequest::getGroupId, ShowGroupWebhookRequest::setGroupId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupWebhookRequest::getHookId, ShowGroupWebhookRequest::setHookId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupWebhookLogRequest, ShowGroupWebhookLogResponse> showGroupWebhookLog =
        genForShowGroupWebhookLog();

    private static HttpRequestDef<ShowGroupWebhookLogRequest, ShowGroupWebhookLogResponse> genForShowGroupWebhookLog() {
        // basic
        HttpRequestDef.Builder<ShowGroupWebhookLogRequest, ShowGroupWebhookLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupWebhookLogRequest.class, ShowGroupWebhookLogResponse.class)
                .withName("ShowGroupWebhookLog")
                .withUri("/v4/groups/{group_id}/hooks/{hook_id}/logs/{log_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupWebhookLogRequest::getGroupId, ShowGroupWebhookLogRequest::setGroupId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupWebhookLogRequest::getHookId, ShowGroupWebhookLogRequest::setHookId));
        builder.<Integer>withRequestField("log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupWebhookLogRequest::getLogId, ShowGroupWebhookLogRequest::setLogId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectWebhookRequest, ShowProjectWebhookResponse> showProjectWebhook =
        genForShowProjectWebhook();

    private static HttpRequestDef<ShowProjectWebhookRequest, ShowProjectWebhookResponse> genForShowProjectWebhook() {
        // basic
        HttpRequestDef.Builder<ShowProjectWebhookRequest, ShowProjectWebhookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectWebhookRequest.class, ShowProjectWebhookResponse.class)
                .withName("ShowProjectWebhook")
                .withUri("/v4/projects/{project_id}/hooks/{hook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectWebhookRequest::getProjectId, ShowProjectWebhookRequest::setProjectId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectWebhookRequest::getHookId, ShowProjectWebhookRequest::setHookId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectWebhookLogRequest, ShowProjectWebhookLogResponse> showProjectWebhookLog =
        genForShowProjectWebhookLog();

    private static HttpRequestDef<ShowProjectWebhookLogRequest, ShowProjectWebhookLogResponse> genForShowProjectWebhookLog() {
        // basic
        HttpRequestDef.Builder<ShowProjectWebhookLogRequest, ShowProjectWebhookLogResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectWebhookLogRequest.class, ShowProjectWebhookLogResponse.class)
            .withName("ShowProjectWebhookLog")
            .withUri("/v4/projects/{project_id}/hooks/{hook_id}/logs/{log_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectWebhookLogRequest::getProjectId,
                ShowProjectWebhookLogRequest::setProjectId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectWebhookLogRequest::getHookId, ShowProjectWebhookLogRequest::setHookId));
        builder.<Integer>withRequestField("log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectWebhookLogRequest::getLogId, ShowProjectWebhookLogRequest::setLogId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryWebhookRequest, ShowRepositoryWebhookResponse> showRepositoryWebhook =
        genForShowRepositoryWebhook();

    private static HttpRequestDef<ShowRepositoryWebhookRequest, ShowRepositoryWebhookResponse> genForShowRepositoryWebhook() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryWebhookRequest, ShowRepositoryWebhookResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRepositoryWebhookRequest.class, ShowRepositoryWebhookResponse.class)
            .withName("ShowRepositoryWebhook")
            .withUri("/v4/repositories/{repository_id}/hooks/{hook_id}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryWebhookRequest::getRepositoryId,
                ShowRepositoryWebhookRequest::setRepositoryId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryWebhookRequest::getHookId, ShowRepositoryWebhookRequest::setHookId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryWebhookLogRequest, ShowRepositoryWebhookLogResponse> showRepositoryWebhookLog =
        genForShowRepositoryWebhookLog();

    private static HttpRequestDef<ShowRepositoryWebhookLogRequest, ShowRepositoryWebhookLogResponse> genForShowRepositoryWebhookLog() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryWebhookLogRequest, ShowRepositoryWebhookLogResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowRepositoryWebhookLogRequest.class, ShowRepositoryWebhookLogResponse.class)
                .withName("ShowRepositoryWebhookLog")
                .withUri("/v4/repositories/{repository_id}/hooks/{hook_id}/logs/{log_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryWebhookLogRequest::getRepositoryId,
                ShowRepositoryWebhookLogRequest::setRepositoryId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryWebhookLogRequest::getHookId,
                ShowRepositoryWebhookLogRequest::setHookId));
        builder.<Integer>withRequestField("log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryWebhookLogRequest::getLogId,
                ShowRepositoryWebhookLogRequest::setLogId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupWebhookRequest, UpdateGroupWebhookResponse> updateGroupWebhook =
        genForUpdateGroupWebhook();

    private static HttpRequestDef<UpdateGroupWebhookRequest, UpdateGroupWebhookResponse> genForUpdateGroupWebhook() {
        // basic
        HttpRequestDef.Builder<UpdateGroupWebhookRequest, UpdateGroupWebhookResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGroupWebhookRequest.class, UpdateGroupWebhookResponse.class)
                .withName("UpdateGroupWebhook")
                .withUri("/v4/groups/{group_id}/hooks/{hook_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateGroupWebhookRequest::getGroupId, UpdateGroupWebhookRequest::setGroupId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateGroupWebhookRequest::getHookId, UpdateGroupWebhookRequest::setHookId));
        builder.<WebhookParamsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WebhookParamsDto.class),
            f -> f.withMarshaller(UpdateGroupWebhookRequest::getBody, UpdateGroupWebhookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectWebhookRequest, UpdateProjectWebhookResponse> updateProjectWebhook =
        genForUpdateProjectWebhook();

    private static HttpRequestDef<UpdateProjectWebhookRequest, UpdateProjectWebhookResponse> genForUpdateProjectWebhook() {
        // basic
        HttpRequestDef.Builder<UpdateProjectWebhookRequest, UpdateProjectWebhookResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateProjectWebhookRequest.class, UpdateProjectWebhookResponse.class)
            .withName("UpdateProjectWebhook")
            .withUri("/v4/projects/{project_id}/hooks/{hook_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectWebhookRequest::getProjectId,
                UpdateProjectWebhookRequest::setProjectId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProjectWebhookRequest::getHookId, UpdateProjectWebhookRequest::setHookId));
        builder.<WebhookParamsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WebhookParamsDto.class),
            f -> f.withMarshaller(UpdateProjectWebhookRequest::getBody, UpdateProjectWebhookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepositoryWebhookRequest, UpdateRepositoryWebhookResponse> updateRepositoryWebhook =
        genForUpdateRepositoryWebhook();

    private static HttpRequestDef<UpdateRepositoryWebhookRequest, UpdateRepositoryWebhookResponse> genForUpdateRepositoryWebhook() {
        // basic
        HttpRequestDef.Builder<UpdateRepositoryWebhookRequest, UpdateRepositoryWebhookResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateRepositoryWebhookRequest.class, UpdateRepositoryWebhookResponse.class)
            .withName("UpdateRepositoryWebhook")
            .withUri("/v4/repositories/{repository_id}/hooks/{hook_id}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryWebhookRequest::getRepositoryId,
                UpdateRepositoryWebhookRequest::setRepositoryId));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRepositoryWebhookRequest::getHookId,
                UpdateRepositoryWebhookRequest::setHookId));
        builder.<WebhookParamsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WebhookParamsDto.class),
            f -> f.withMarshaller(UpdateRepositoryWebhookRequest::getBody, UpdateRepositoryWebhookRequest::setBody));

        // response

        return builder.build();
    }

}
