package com.mmf;

import com.mmf.dao.entity.ModelUser;
import com.mmf.dao.repository.UserRepository;
import com.mmf.service.impl.RoleMapServiceImpl;
import com.mmf.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private RoleMapServiceImpl roleMapService;

    @Mock
    private UserRepository userRepository;

    @Mock
    private ModelUser modelUser;


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        when(modelUser.getUserId()).thenReturn(1);
    }

    @Test
    public void saveUserTest() {
        when(userRepository.save(modelUser)).thenReturn(modelUser);

        assertEquals(userService.save(modelUser), modelUser.getUserId());
    }



}