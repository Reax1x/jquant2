#coding=gbk
 
__author__ = 'Administrator'

import sys
import win32gui
import win32api
import win32con
import os
import time

classname = "Afx:400000:b:10005:6:6f6045d"
titlename = "���Ϲ�Ʊ����ϵͳ5.0"

#�ַ�ת���̴���  
def keyboarddic(key):
    #�ж��Ƿ���С����
    if(key=='.'):
        return 110
    #תΪ����
    key = int(key)
    if (key==0):
        return 96
    elif (key==1):
        return 97
    elif (key==2):
        return 98
    elif (key==3):
        return 99
    elif (key==4):
        return 100
    elif (key==5):
        return 101
    elif (key==6):
        return 102
    elif (key==7):
        return 103
    elif (key==8):
        return 104
    elif (key==9):
        return 105
    else:
        return 0
        
#ģ���������ָ����num
def inputnum(num):
    #����ת���� 601016->6,0,1,0,1,6
    listnum = list(num)
    for list_char in listnum:
        keycode = keyboarddic(list_char)
        if(keycode==0):
            os._exit(0)
        else:
            win32api.keybd_event(keycode,0,0,0)
            win32api.keybd_event(keycode,0,win32con.KEYEVENTF_KEYUP,0)
def buy_stock(stock_id,stock_price,stock_sum):
    if not stock_id:
        os._exit(0)
    if not stock_sum:
        os._exit(0)
    if( not stock_id.isdigit() or not len(stock_id)==6):
        os._exit(0)
    if( not stock_sum.isdigit()):
        os._exit(0)

    #1 �Ȱ�F1���������  Ȼ��ˢ��һ��

    #��������F2
    win32api.keybd_event(113,0,0,0)	    # F2
    win32api.keybd_event(113,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    
    #�������F1
    win32api.keybd_event(112,0,0,0)	    # F1
    win32api.keybd_event(112,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    time.sleep(0.01)

    #ˢ��F5
    win32api.keybd_event(116,0,0,0)	    # F5
    win32api.keybd_event(116,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    time.sleep(0.01)

    #����Backspace����ɾ��֤ȯ�����е���Ϣ
    for i in range(1,8):
        win32api.keybd_event(8,0,0,0)	    # Backspace
        win32api.keybd_event(8,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    
    
    #2  ����Ҫ��Ĵ���
    inputnum(stock_id)
    #3  ��tab�е�����۸�
    win32api.keybd_event(9,0,0,0)
    win32api.keybd_event(9,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.1)
    #��������۸�
    inputnum(stock_price)

    #4  ��tab�л�����������
    win32api.keybd_event(9,0,0,0)
    win32api.keybd_event(9,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.01)
    #5  ��������
    inputnum(stock_sum)

    #6  ������밴ťB
    win32api.keybd_event(66,0,0,0)
    win32api.keybd_event(66,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.1)

    #7  ���ȷ������Y
    #win32api.keybd_event(89,0,0,0)
    #win32api.keybd_event(89,0,win32con.KEYEVENTF_KEYUP,0)
    
    #ִ����ɺ��ӡ��־
    #print('�����Ʊ����:'+stock_id+'  ����۸�:'+stock_price+'  ��������:'+stock_sum)
    print 0
    
    
def sell_stock(stock_id,stock_price,stock_sum):
    if not stock_id:
        os._exit(0)
    if not stock_sum:
        os._exit(0)
    if( not stock_id.isdigit() or not len(stock_id)==6):
        os._exit(0)
    if( not stock_sum.isdigit()):
        os._exit(0)

    #1 �Ȱ�F1���������  Ȼ��ˢ��һ��

    #�������F1
    win32api.keybd_event(112,0,0,0)	    # F1
    win32api.keybd_event(112,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    
    #��������F2
    win32api.keybd_event(113,0,0,0)	    # F2
    win32api.keybd_event(113,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���

    #ˢ��F5
    win32api.keybd_event(116,0,0,0)	    # F5
    win32api.keybd_event(116,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���

    #����Backspace����ɾ��֤ȯ�����е���Ϣ
    for i in range(1,8):
        win32api.keybd_event(8,0,0,0)	    # Backspace
        win32api.keybd_event(8,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    
    
    #2  ����Ҫ���Ĵ���
    inputnum(stock_id)
    #3  ��tab�е������۸�
    win32api.keybd_event(9,0,0,0)
    win32api.keybd_event(9,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.1)
    #���������۸�
    inputnum(stock_price)

    #4  ��tab�л�����������
    win32api.keybd_event(9,0,0,0)
    win32api.keybd_event(9,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.01)
    #5  ��������
    inputnum(stock_sum)

    #6  ���������ťS
    win32api.keybd_event(83,0,0,0)
    win32api.keybd_event(83,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.1)

    #7  ���ȷ������Y
    #win32api.keybd_event(89,0,0,0)
    #win32api.keybd_event(89,0,win32con.KEYEVENTF_KEYUP,0)
    
    #ִ����ɺ��ӡ��־
    #print('������Ʊ����:'+stock_id+'  �����۸�:'+stock_price+'  ��������:'+stock_sum)    
    print 0

def flushed_stock():
    #��������F2
    win32api.keybd_event(113,0,0,0)	    # F2
    win32api.keybd_event(113,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    time.sleep(0.01)
    #ˢ��F5
    win32api.keybd_event(116,0,0,0)	    # F5
    win32api.keybd_event(116,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    print 0
    
def quanbuchedan():
    #��������F3
    win32api.keybd_event(114,0,0,0)	    # F3
    win32api.keybd_event(114,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    time.sleep(0.1)

    #ˢ��һ��
    win32api.keybd_event(116,0,0,0)	    # F5
    win32api.keybd_event(116,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    time.sleep(0.5)

    #��Zȫ������
    win32api.keybd_event(90,0,0,0)	    # Z
    win32api.keybd_event(90,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    print 0
    
def chaxunzijin(parent):

    #��ѯ�ʽ��Ʊ
    if not parent:
        return
    #��ѯ����F4
    win32api.keybd_event(115,0,0,0)	    # F4
    win32api.keybd_event(115,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    time.sleep(0.1)
    #ˢ��һ��
    win32api.keybd_event(116,0,0,0)	    # F4
    win32api.keybd_event(116,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    time.sleep(0.5)
    hWndChildList = []
    zijin = []
    win32gui.EnumChildWindows(parent, lambda hWnd, param: param.append(hWnd),  hWndChildList)
    for i, h in enumerate(hWndChildList):
        if(win32gui.GetWindowText(h)=='��ѯ�ʽ��Ʊ' and win32gui.GetClassName(h)=='Static'):
            zijin.append(hWndChildList[i])
            zijin.append(hWndChildList[i+1])
            zijin.append(hWndChildList[i+2])
            zijin.append(hWndChildList[i+3])
            zijin.append(hWndChildList[i+4])
            zijin.append(hWndChildList[i+5])
            zijin.append(hWndChildList[i+6])
            zijin.append(hWndChildList[i+7])
            zijin.append(hWndChildList[i+8])
            zijin.append(hWndChildList[i+9])
            zijin.append(hWndChildList[i+10])
            zijin.append(hWndChildList[i+11])
            zijin.append(hWndChildList[i+12])
    #show_windows(zijin)
    if len(zijin)==13:
        formatzijin = []
        formatzijin.append(win32gui.GetWindowText(zijin[4]))#�ʽ����
        formatzijin.append(win32gui.GetWindowText(zijin[5]))#������
        formatzijin.append(win32gui.GetWindowText(zijin[6]))#���ý��
        formatzijin.append(win32gui.GetWindowText(zijin[10]))#��ȡ���
        formatzijin.append(win32gui.GetWindowText(zijin[11]))#��Ʊ��ֵ
        formatzijin.append(win32gui.GetWindowText(zijin[12]))#�� �� ��
        print(formatzijin[0]+'#'+formatzijin[1]+'#'+formatzijin[2]+'#'+formatzijin[3]+'#'+formatzijin[4]+'#'+formatzijin[5])    
    
    
#��ȡ���

    
global hwnd
hwnd = win32gui.FindWindow(None, titlename)
if(hwnd>0):
    #��ý���
    win32gui.SetForegroundWindow(hwnd)
    time.sleep(0.1)
    #�������F1
    win32api.keybd_event(112,0,0,0)	    # F5
    win32api.keybd_event(112,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���

    #ˢ��F5
    #win32api.keybd_event(116,0,0,0)	    # F5
    #win32api.keybd_event(116,0,win32con.KEYEVENTF_KEYUP,0)  #�ͷŰ���
    #time.sleep(0.5)

    ##״̬����  1:���� 0:����  3:ȫ������  4:ˢ��  5:��ѯ�ʽ� 
    if(sys.argv[1]=='1'):
        buy_stock(sys.argv[2],sys.argv[3],sys.argv[4])
    elif(sys.argv[1]=='0'):
        sell_stock(sys.argv[2],sys.argv[3],sys.argv[4])
    elif(sys.argv[1]=='3'):
        quanbuchedan()    
    elif(sys.argv[1]=='4'):
        flushed_stock()
    elif(sys.argv[1]=='5'):
        chaxunzijin(hwnd)
    else:
        print '����'+sys.argv[1]+'��֧��!'
        os._exit(0)
    #flushed_stock()
    
else:
    os._exit(0)


    
