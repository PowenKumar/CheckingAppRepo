package com.freecode.statussaver.interfaces;


import com.freecode.statussaver.model.FBStoryModel.NodeModel;
import com.freecode.statussaver.model.story.TrayModel;

public interface UserListInterface {
    void userListClick(int position, TrayModel trayModel);
    void fbUserListClick(int position, NodeModel trayModel);
}
