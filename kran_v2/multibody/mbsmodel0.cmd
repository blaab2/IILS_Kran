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
   red_component = 0.8567715451682416  &
   green_component = 0.4305465803783496  &
   blue_component = 0.44828642246333683
!
part attributes  &
   part_name = .mbsmodel0.ground0  &
   color = ground0_color
!
! --------Part: SuspensionBody --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.SuspensionBody  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, -0.0d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_v2/multibody\geometry\hauptausleger0.stl"  &
   part_name = .mbsmodel0.SuspensionBody  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, -0.0d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.SuspensionBody  &
   density = 1.0E-7
!
color create  &
   color_name = SuspensionBody_color  &
   red_component = 0.00473385760994105  &
   green_component = 0.0750597532466617  &
   blue_component = 0.41116953563481073
!
part attributes  &
   part_name = .mbsmodel0.SuspensionBody  &
   color = SuspensionBody_color
!
view zoom  &
   auto = on
!
simulation script create  &
   sim_script_name = .mbsmodel0.simulation1  &
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
   sim_script_name = simulation1  &
   reset_before_and_after = yes
!
simulation single_run   &
   replay
