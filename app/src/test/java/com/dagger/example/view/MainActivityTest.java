package com.dagger.example.view;


import com.dagger.example.BuildConfig;
import com.dagger.example.TestDaggerExampleApplication;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, application = TestDaggerExampleApplication.class)
public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setUp() throws Exception {
        ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class);
        activity = controller.get();
        MockitoAnnotations.initMocks(this);
        controller.create();
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(activity);
        assertNotNull(activity.presenter);
        activity.presenter.onClick();
    }


}
