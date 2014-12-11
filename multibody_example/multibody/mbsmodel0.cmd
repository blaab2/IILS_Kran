!
! --------Units for Model --------
!
!
defaults units  &
   length = mm  &
   angle = deg  &
   force = newton  &
   mass = kg  &
   time = s
!
!
defaults units  &
   coordinate_system_type = cartesian  &
   orientation_type = body321
!
! --------Attributes for Model --------
!
!
defaults attributes  &
   inheritance = bottom_up  &
   icon_visibility = off  &
   grid_visibility = off  &
   size_of_icons = 50.0  &
   spacing_for_grid = 1000.0
!
view manage modify  &
   render = shaded
!
color create  &
   color_name = background_color_infinity  &
   red_component = 0.7568627450980392  &
   green_component = 0.796078431372549  &
   blue_component = 0.8862745098039215
!
view management modify  &
   background_color = background_color_infinity
!
! --------Adams Model --------
!
!
model create  &
   model_name = mbsmodel0
!
part create new_ground  &
   part_name =ground0
!
part delete  &
   part_name = ground
!
defaults model  &
   part_name = ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
color create  &
   color_name = ground0_color  &
   red_component = 0.13015468838115962  &
   green_component = 0.9935851930267394  &
   blue_component = 0.9218529685236887
!
part attributes  &
   part_name = .mbsmodel0.ground0  &
   color = ground0_color
!
! --------Part: b2 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.b2  &
   location = 0.0, 200.0, 0.0  &
   orientation = 0.0d, -0.0d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/multibody_example/multibody\geometry\component0.stl"  &
   part_name = .mbsmodel0.b2  &
   location = 0.0, 200.0, 0.0  &
   orientation = 0.0d, -0.0d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.b2  &
   density = 7.8E-6
!
color create  &
   color_name = b2_color  &
   red_component = 0.07574821258818132  &
   green_component = 0.653550169718927  &
   blue_component = 0.43743051576430636
!
part attributes  &
   part_name = .mbsmodel0.b2  &
   color = b2_color
!
! --------Part: b1 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.b1  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, -0.0d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/multibody_example/multibody\geometry\component1.stl"  &
   part_name = .mbsmodel0.b1  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, -0.0d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.b1  &
   density = 7.8E-6
!
color create  &
   color_name = b1_color  &
   red_component = 0.8626595880473688  &
   green_component = 0.5636265940824507  &
   blue_component = 0.7539242799839178
!
part attributes  &
   part_name = .mbsmodel0.b1  &
   color = b1_color
!
! --------Field Force:  --------
!
!
force create body gravitational  &
   gravity_field_name = gravity  &
   x_component_gravity = 0.0  &
   y_component_gravity = -9810.0  &
   z_component_gravity = 0.0
!
constraint create joint fixed  &
   joint_name = .mbsmodel0.FIXED1  &
   i_part_name = .mbsmodel0.b1  &
   j_part_name = .mbsmodel0.ground0
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.generaljoint0_transl  &
   i_part_name = .mbsmodel0.b2  &
   j_part_name = .mbsmodel0.ground0  &
   location = 0.0, 200.0, 0.0  &
   orientation = 0.0d, -0.0d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.generaljoint0_rot  &
   i_part_name = .mbsmodel0.b2  &
   j_part_name = .mbsmodel0.ground0  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, 0.0d  &
   relative_to = .mbsmodel0.b2
!
view zoom  &
   auto = on
!
simulation script create  &
   sim_script_name = .mbsmodel0.simulation2  &
   initial_static = no  &
   end_time = 1.0  &
   step_size = 0.01
!
simulation single_run set  &
   update = none  &
   monitor = output_step
!
simulation single_run scripted  &
   model_name = mbsmodel0  &
   sim_script_name = simulation2  &
   reset_before_and_after = yes
!
simulation single_run   &
   replay
